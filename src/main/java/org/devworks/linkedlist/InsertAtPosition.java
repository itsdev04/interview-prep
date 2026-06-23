package org.devworks.linkedlist;

public class InsertAtPosition {

  private static void printList(Node head) {
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
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    // head = insertAtPostion(head,6);
    printList(head);
  }
}
