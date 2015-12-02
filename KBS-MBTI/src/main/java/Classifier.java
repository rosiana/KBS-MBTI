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
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
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

    protected String SOURCE_FILE;

//    // the namespace of the ontology
    public static String NS;
    private static OWLOntologyManager manager;

    /***********************************/
    /* External signature methods      */
    /***********************************/

    public Classifier(){
        SOURCE_FILE = System.getProperty("user.dir").concat(separator).concat("src").concat(separator).concat("owl").concat(separator).concat("MBTI.owl");
        loadModel();
    }

    public void run() {
            // Entities are named using IRIs.  These are usually too long for use in user interfaces.  To solve this
            // problem, and so a query can be written using short class, property, individual names we use a short form
            // provider.  In this case, we'll just use a simple short form provider that generates short froms from IRI
            // fragments.
            ShortFormProvider shortFormProvider = new SimpleShortFormProvider();

            // Create the DLQueryPrinter helper class.  This will manage the parsing of input and printing of results
            DLQueryPrinter dlQueryPrinter = new DLQueryPrinter(reasoner, shortFormProvider);

        try {
            // Enter the query loop.  A user is expected to enter class expression on the command line.
            doQueryLoop(dlQueryPrinter);
        } catch (IOException ex) {
            
        }
        
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
    private void doQueryLoop(DLQueryPrinter dlQueryPrinter) throws IOException{
        while (true) {
            // Prompt the user to enter a class expression
            System.out.println("Please type a class expression in Manchester Syntax and press Enter (or press x to exit):");
            System.out.println("");
            String classExpression = readInput();
            // Check for exit condition
            if(classExpression.equalsIgnoreCase("x")) {
                break;
            }
            dlQueryPrinter.askQuery(classExpression.trim());
            System.out.println();
            System.out.println();
        }
    }
    private String readInput() throws IOException {
        InputStream is = System.in;
        InputStreamReader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);
        return br.readLine();
    }
}
