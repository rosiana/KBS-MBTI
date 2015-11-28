/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosi
 */
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import edu.stanford.smi.protegex.owl.ProtegeOWL;
        
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OWLModel owlModel = ProtegeOWL.createJenaOWLModel();
        owlModel.getNamespaceManager().setDefaultNamespace("http://hello.com#");
        OWLNamedClass worldClass = owlModel.createOWLNamedClass("World");
        System.out.println("Class URI: " + worldClass.getURI());
    } 
}
