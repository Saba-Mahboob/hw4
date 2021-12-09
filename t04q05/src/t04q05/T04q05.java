/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04q05;

/**
 *
 * @author Emertat
 */
public class T04q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           DLL dll = new DLL();
 
        dll.append(10);
        dll.append(20);
        dll.append(5);
        dll.append(-8);
        dll.append(6);
        dll.append(2);
 
        dll.printlist(dll.head);
        
        int w = 12;
        System.out.println("\nAll Of Two Data With Summation "+w);
        dll.toString(dll.head,w);



    
    }
    
}
