/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosi
 */
import example.DLQueryPrinter;
import java.io.BufferedReader;
import java.io.File;
import static java.io.File.separator;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;

public class Classifier{
    protected OWLOntology ontology;
    protected OWLReasoner reasoner;


    private static OWLOntologyManager manager;

    /***********************************/
    /* External signature methods      */
    /***********************************/

    public Classifier(){
        loadModel();
    }
    
    public String getResult(Map resultMap){
        String ie = "";
        String ns = "";
        String ft = "";
        String jp = "";
        if((int)resultMap.get('I') >= 8) ie = "I";
        else if((int)resultMap.get('E') >= 8) ie = "E";
        ie = "(hasPersonality  value " + ie + ")";
        
        if((int)resultMap.get('S') >= 9) ns = "S";
        else if((int)resultMap.get('N') >= 9) ns = "N";
        ns = "(hasPersonality  value " + ns + ")";
        
        if((int)resultMap.get('T') >= 7) ft = "T";
        else if((int)resultMap.get('F') >= 7) ft = "F";
        ft = "(hasPersonality  value " + ft + ")";
        
        if((int)resultMap.get('J') >= 7) jp = "J";
        else if((int)resultMap.get('P') >= 7) jp = "P";
        jp = "(hasPersonality  value " + jp + ")";
        
        String query = "MBTI that (" + ie + " and " + ns + " and " + ft + " and " + jp + ")";
        ShortFormProvider shortFormProvider = new SimpleShortFormProvider();
        DLQueryPrinter dlQueryPrinter = new DLQueryPrinter(reasoner, shortFormProvider);
        Set<OWLClass> equivalentClass = dlQueryPrinter.askQuery(query);
        StringBuilder sb = new StringBuilder();
        if (!equivalentClass.isEmpty()) {
            for(OWLEntity entity : equivalentClass) {
                sb.append(shortFormProvider.getShortForm(entity));
                sb.append("\n");
            }
        }
        else {
            sb.append("\t[NONE]\n");
        }
        return sb.toString();
    }

    /***********************************/
    /* Internal implementation methods */
    /***********************************/

    /** read the ontology and add it as a sub-model of the given ontmodel */
    private void loadModel(){
        try{
            manager = OWLManager.createOWLOntologyManager();
            ontology = manager.loadOntologyFromOntologyDocument(new File(System.getProperty("user.dir").concat(separator).concat("src").concat(separator).concat("owl").concat(separator).concat("MBTI.owl")));
            System.out.println("Loaded ontology: " + ontology.getOntologyID());
            // We need a reasoner to do our query answering
            reasoner = createReasoner(ontology);
        }
        catch (OWLOntologyCreationException e) {
            System.out.println("Could not load ontology: " + e.getMessage());
        }
    }
    
    private OWLReasoner createReasoner(OWLOntology rootOntology) {
        OWLReasonerFactory reasonerFactory = new Reasoner.ReasonerFactory();
        return reasonerFactory.createReasoner(rootOntology);
    }
}
