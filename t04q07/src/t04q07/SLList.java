/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04q07;

/**
 *
 * @author Emertat
 */
public class SLList {

    private Node head;
    private Node tail;
    int size;

    public SLList() {
        head = null;
        tail = null;
        size = 0;
    }

    public String toString() {
        String out = "";
        if (head == null) {
            return "is empty!";
        }
        for (Node n = head; n != null; n = n.next) {
            if (n != tail) {
                out += n.item.toString() + "->";
            } else {
                out += n.item.toString() + ";";
            }

        }
        return out;
    }

    public void addH(Object i) {
        Node nNode = new Node(i, null);
        if (head == null && tail == null) {
            head = nNode;
            tail = nNode;
            size++;
            return;
        }
        nNode.next = head;
        head = nNode;
        size++;

    }

    public int size() {
        return size;
    }

    public void addT(Object i) {
        Node nNode = new Node(i, null);
        if (head == null && tail == null) {
            head = nNode;
            tail = nNode;
            size++;
        } else {
            tail.next = nNode;
            tail = nNode;
            size++;
        }
    }

    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    public String findmid() {
        int k = 1;
        String s = "";
        if (head == null && tail == null) {
            return "is empty";
        }
        if (head == tail) {
            return head.toString();
        }
        if (size % 2 == 0) {
            return "false";
        }
        for (Node n = head; n != null; n = n.next) {
            if (k == (size + 1) / 2) {
                s = n.item.toString();
                break;
            }
            k++;

        }
        return s;

    }

}
