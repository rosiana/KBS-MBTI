/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosi
 */
import java.io.BufferedWriter;
import java.io.File;
import static java.io.File.separator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

public class Main
{
    /***********************************/
    /* Constants                       */
    /***********************************/

    // where the ontology should be
    protected static String SOURCE_URL;
    protected static File sourceFile;
    protected static IRI documentIRI;
    protected static OWLOntology ontology;

    // where we've stashed it on disk for the time being
    protected static String SOURCE_FILE;

//    // the namespace of the ontology
    public static String NS;
    private static OWLOntologyManager manager;

    /***********************************/
    /* External signature methods      */
    /***********************************/

    public static void main( String[] args ) {
        
    }
//        SOURCE_FILE = System.getProperty("user.dir").concat(separator).concat("src").concat(separator).concat("owl").concat(separator).concat("MBTI.owl");
//        SOURCE_URL = SOURCE_FILE;
//        NS = SOURCE_URL + "#";
//        System.out.println(SOURCE_FILE);
//        try {
//            loadModel();
//        } catch (OWLOntologyCreationException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        new Main().run();
//    }
//
//    public void run() {
//        OWLDataFactory factory = manager.getOWLDataFactory();
//        OWLClass clsAMethodA = factory.getOWLClass(documentIRI);
//        OWLReasoner reasoner=new Reasoner.ReasonerFactory().createReasoner(ontology);
//        System.out.println(reasoner.isConsistent());
//        System.out.println(clsAMethodA.toString());
//    }
//
//    /***********************************/
//    /* Internal implementation methods */
//    /***********************************/
//
//    /** read the ontology and add it as a sub-model of the given ontmodel */
//    protected static void loadModel() throws OWLOntologyCreationException {
//        File file = new File(SOURCE_FILE);
//        try {
//            Writer output = new BufferedWriter(new FileWriter(file));
//        } catch (IOException ex) {
//            
//            
//        }
//		    
//        // Create our ontology manager in the usual way.
//        manager = OWLManager.createOWLOntologyManager();                        
//
//        sourceFile = new File(SOURCE_FILE);
//        // Now load the local copy
//        ontology = manager.loadOntologyFromOntologyDocument(sourceFile);
//        System.out.println("Loaded ontology: " + ontology);	
//        documentIRI = manager.getOntologyDocumentIRI(ontology);
//    }
    
    

}
