package org.devworks.linkedlist;

public class InsertAtFront {

  static Node insertAtFront(Node head, int x) {
    Node newNode = new Node(x);
    newNode.next = head;
    return newNode;
  }

  // print the linked list
  static void printList(Node head) {
    Node curr = head;

    while (curr != null) {
      System.out.print(curr.data);
      if (curr.next != null) {
        System.out.print(" -> ");
      }
      curr = curr.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(2);
    head.next = new Node(3);
    head.next.next = new Node(4);
    head = insertAtFront(head, 1);
    printList(head);
  }
}
