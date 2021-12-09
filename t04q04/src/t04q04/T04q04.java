/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t04q04;
import static  t04q04.LinkedList.insert;
import static  t04q04.LinkedList.printList;
import static  t04q04.LinkedList.reverse;

/**
 *
 * @author Emertat
 */
public class T04q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           LinkedList list = new LinkedList();
        
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
   
        System.out.println("-----*BEFOR REVERSE*-----");
        printList(list);
        
        list.head = reverse(list.head);
        System.out.println("\n\n-----*AFTER REVERSE*------");
         printList(list);
         System.out.println("");



    
    }
    
}

 
    

