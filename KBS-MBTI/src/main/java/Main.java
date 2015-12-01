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
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.IRI;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class Main
{
    /***********************************/
    /* Constants                       */
    /***********************************/

    // where the ontology should be
    protected static String SOURCE_URL;

    // where we've stashed it on disk for the time being
    protected static String SOURCE_FILE;

//    // the namespace of the ontology
    public static String NS;

    /***********************************/
    /* External signature methods      */
    /***********************************/

    public static void main( String[] args ){
        SOURCE_FILE = System.getProperty("user.dir").concat(separator).concat("src").concat(separator).concat("owl").concat(separator).concat("MBTI.owl");
        SOURCE_URL = SOURCE_FILE;
        NS = SOURCE_URL + "#";
        System.out.println(SOURCE_FILE);
        
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(new File("src/owl/MBTI.owl"));
        
        Reasoner reason = new Reasoner (ontology);
        LoadOntoJava loj = new LoadOntoJava (reason);
        loj.getListOfQuestion();
        
//        new Main().run();
    }

//    public void run() throws OWLOntologyCreationException, IOException {
//    }
//
//    /***********************************/
//    /* Internal implementation methods */
//    /***********************************/
//
//    /** read the ontology and add it as a sub-model of the given ontmodel */
//    protected void loadModel() throws OWLOntologyCreationException, IOException {
//        File file = new File(SOURCE_FILE);
//	Writer output = new BufferedWriter(new FileWriter(file));
//		    
//        // Create our ontology manager in the usual way.
//        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();                        
//
//        File file1 = new File("ontology/OntologyOBL.owl");
//        // Now load the local copy
//        OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file1);
//        System.out.println("Loaded ontology: " + ontology);	
//    }

}
