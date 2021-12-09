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
public class DLL {
     Node head;
    class Node {
        int data;
        Node prev;
        Node next;
        Node(int d) { data = d; }
    }
    void append(int new_data)
    { 
        Node new_node = new Node(new_data);
        Node last = head; /* used in step 5*/
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (last.next != null)
            last = last.next;
        last.next = new_node;
 
        new_node.prev = last;
    }
    
    public void toString(Node head,int w){
        Node temp = head.next;
        while(head!=null){
            while(temp !=null){
                if((head.data+temp.data)==w){
                    System.out.println(head.data+"+"+temp.data+"="+w);
                }
                temp = temp.next;
            }
            head = head.next;
            if(head!=null)temp = head.next;
            else temp = null;
        }
    }
 
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal list");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
    }
 
   
    
}
