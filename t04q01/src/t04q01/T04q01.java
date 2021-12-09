/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t04q01;
import java.util.LinkedList;
/**
 *
 * @author Emertat
 */
public class T04q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> s = new LinkedList<>();
        LinkedList<Integer> q = new LinkedList<>();
        s.push(3);
        s.push(5);
        s.push(9);
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
        //////////////////////////////////////////////////////////////////////////
        q.add(12);
        q.add(70);
        q.add(50);
        //System.out.println(q.removeFirst());
        //System.out.println(q.removeFirst());
        System.out.println(q.remove());
        q.add(20);
        System.out.println(q.remove());
        
        
        
    }
    
}
