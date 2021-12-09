/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t04q06;

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

    public String findp(int i) {
        String s = "";
        int k = 1;
        if (head == null && tail == null) {
            return "is empty";
        }
        if (i > size || i == 0) {
            return "error!";
        }
        for (Node n = head; n != null; n = n.next) {
            if (k == size - i + 1) {
                s = n.item.toString();
            }
            k++;
        }
        return s;

    }
//    public void delmid(int loc){
//        
//    }
//        
//    
//
//    public String dely( Object o){
//        String s1="";
//        String s2="";
//        
//         for(Node n=head;n!=null;n=n.next){
//             Node m=n;
//             if((int) n.item>=(int)o) {
//                 tail.next=n;
//                 tail=n;
//                 
//             }
//                 
//             }
//                 
//                 
//           
//    }

    public String getindex(int i) {
        int k = 1;
        if (i > size || i == 0) {
            return "false";
        }
        for (Node n = head; n != null; n = n.next) {
            if (k == i) {
                return n.item.toString();
            }
            k++;
        }
        return " ";
    }

    public void add(int index, Object o) {
        int k = index - 1;
        int c = 1;
        Node nNode = new Node(o, null);
        for (Node n = head; n != null; n = n.next) {
            if (c == k) {
                nNode.next = n.next;
                n.next = nNode;
            }
            c++;
        }

    }

    public void remove(int index) {
        int k = index - 1;
        int c = 1;
        Node nNode = new Node(null, null);
        for (Node n = head; n != null; n = n.next) {
            if (c == k) {
                nNode = n.next;
                n.next = nNode.next;
                size--;

            }
            c++;

        }
    }

    public void removeall() {
        head = null;
        size = 0;

    }

    public void swap(int i, int j) {
        if (i > size || j > size) {
            System.out.println("wrong!");

        }
        if (i == 0 || j == 0) {
            System.out.println("wrong!");
        } else {
            int o2 = 0, o1 = 0;
            int k = 1;
            for (Node n = head; n != null; n = n.next) {
                if (k == i) {
                    o1 = (int) n.item;
                }
                if (k == j) {
                    o2 = (int) n.item;
                }
                k++;
            }
            k = 1;

            for (Node n = head; n != null; n = n.next) {
                if (k == i) {
                    n.item = (int) o2;
                }
                if (k == j) {
                    n.item = (int) o1;
                }
                k++;
            }
        }

    }

    public void ab(int a, int b) {
        if (a + b > size) {
            System.out.println("wrong!");
        }
        if (a == 0 || b == 0) {
            System.out.println("wrong!");
        }
        int k;
        Node n = head, t;
        Node nNode = new Node(null, null);
        while (n != null) {
            for (k = 1; k < a && n != null; k++) {
                n = n.next;
                if (n == null) {
                    break;
                }
                t = n.next;
                for (k = 1; k <= b && t != null; k++) {
                    nNode = t;
                    t = t.next;
                }
                n.next = t;
                n = t;
            }
        }
    }
}
