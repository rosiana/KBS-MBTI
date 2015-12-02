
import org.semanticweb.HermiT.Reasoner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class MBTIReasoner {
    private Reasoner reason;
    
    public MBTIReasoner(Reasoner reason){this.reason = reason;}
    
    public void runReasoner(String expression){
        Reasoner r = reason;
        System.out.println(r.getPrefixes().toString());
    }
}
