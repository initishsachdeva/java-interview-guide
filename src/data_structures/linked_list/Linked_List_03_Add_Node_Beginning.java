package data_structures.linked_list;

public class Linked_List_03_Add_Node_Beginning {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    Node tail = null;

    public void addNodeAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void printLinkedList(Node headNode) {
        Node current = headNode;
        while (current != null) {
            System.out.print(current.val + " -->");
            current = current.next;
        }
    }

    public void addNodeAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    public static void main(String[] args) {
        Linked_List_03_Add_Node_Beginning linkedList = new Linked_List_03_Add_Node_Beginning();
        linkedList.addNodeAtEnd(1);
        linkedList.addNodeAtEnd(2);
        linkedList.addNodeAtEnd(3);
        linkedList.addNodeAtEnd(4);
        linkedList.addNodeAtEnd(5);
        linkedList.printLinkedList(head);
        System.out.println("");
        linkedList.addNodeAtBeginning( 11);
        System.out.println("");
        linkedList.printLinkedList(head);
    }
}
