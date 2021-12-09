/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04q04;

/**
 *
 * @author Emertat
 */
public class LinkedList {
   
   public Node head; 
   static class Node {
   
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    public static LinkedList insert(LinkedList list, int data)
    {
      
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
     public static Node reverse(Node head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        Node newHeadNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHeadNode;
    }
  
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
    
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
 
}
    

