import java.util.Scanner;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(){

        }
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        while (choice != 0) {
            
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> {
                    break;
                }
                case 1 -> insertAtFirst(sc.nextInt());
                case 2 -> insertAtEnd(sc.nextInt());
                case 3 -> insertAtRandom(sc.nextInt(), sc.nextInt());
                case 9 -> {
                    display(head);
                    System.out.println();
                }
            }
        }

        sc.close();

    }

    static void insertAtFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    static void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = node;        
    }
    static void insertAtRandom(int data, int l){
        if(head == null && l != 0){
            System.out.println("Unable to Insert");
            return;
        }
        Node node = new Node(data);
        if(l == 0){
            node.next = head;
            head = node;
            return;
        }
        int c = 1;
        Node temp = head;
        while (temp != null) {
            if(l == c){
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp = temp.next;
            c++;
        }
        System.out.println("Unable to insert");

    }
    static void display(Node head){
        if(head == null)
            return;
        System.out.print(head.data + " ");
        display(head.next);
    }
}
