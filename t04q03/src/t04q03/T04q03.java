/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04q03;

/**
 *
 * @author Emertat
 */
public class T04q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLList l = new SLList();
        // System.out.println(l);
        l.addH((int) 2);
        l.addH((int) 8);
        l.addT((int) 4);
        l.addT((int) 7);
        l.addT((int) 9);
        l.add(3, (int) 1);
        // l.remove(3);

        System.out.println(l);
        l.swap(3, 0);
        System.out.println(l);
        // System.out.println(l.size);
        // System.out.println(l.getindex(8));
        // System.out.println(l.dely());
        //System.out.println(l.findmid());
        // System.out.println(l.findp(0));

    }
}
