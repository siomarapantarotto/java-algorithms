package fromscratch.linkedlist;
// Linked list implementation in Java

import java.util.Random;

import linkedlist.LinkedList;

// Company class
class Company {
    int id;
    String name;
    String ownerName;

    Company(String companyName, String companyOwnerName) {
        this.id = generateRandomId();
        this.name = companyName;
        this.ownerName = companyOwnerName;
    }

    static int generateRandomId() {
        // create random value for company ID
        Random random = new Random();
        return random.nextInt(1000000);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nOwner: " + ownerName;
    }
}

// Node class
class Node {
    int key;
    Company value;
    Node next;

    Node(int key, Company company) {
        this.key = key;
        this.value = company;
        next = null;
    }
}

// The linked list class
class CompanyLinkedList {
    // Creating a node
    Node head;

    public static void cloneLinkedList(Node head) {
    }

    public void printLinkedList(CompanyLinkedList linkedList) {
        // printing node-value
        // while (originalList.head != null) {
        // System.out.print(originalList.head.value + " ");
        // originalList.head = originalList.head.next;
    }

    public static void printFromHead(Node head) {
        // printing node-value
        System.out.println("Key node received: " + head.key + " ");
        while (head != null) {
            System.out.println(head.key + " ");
            System.out.println(head.value + " ");
            System.out.println(head.next + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Create the original linked list
        CompanyLinkedList originalList = new CompanyLinkedList();

        // Create companies
        Company company1 = new Company("Apple", "Steve");
        Company company2 = new Company("Microsoft", "Bill");
        Company company3 = new Company("Tesla", "Elon");

        // Assign value values
        originalList.head = new Node(1, company1);
        Node second = new Node(2, company2);
        Node third = new Node(3, company3);

        // Connect nodess
        originalList.head.next = second;
        second.next = third;

        // printing node-value
        // while (originalList.head != null) {
        // System.out.print(originalList.head.value + " ");
        // originalList.head = originalList.head.next;
        // }

        printFromHead(originalList.head);

    }
}