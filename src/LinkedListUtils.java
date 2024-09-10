class LinkedListUtils {

        static SinglyLinkedListNode reverse1(SinglyLinkedListNode head) {
                SinglyLinkedListNode previous = null;
                SinglyLinkedListNode current = head;
                while (current != null) {
                        SinglyLinkedListNode next = current.next;
                        current.next = previous;
                        previous = current;
                        current = next;
                }
                return previous;
        }

        static DoublyLinkedListNode reverse2(DoublyLinkedListNode head) {
                DoublyLinkedListNode previous = null;
                DoublyLinkedListNode current = head;
                while (current != null) {
                        DoublyLinkedListNode next = current.next;
                        current.next = previous;
                        current.prev = next;
                        previous = current;
                        current = next;
                }
                return previous;
        }

        static void printLinkedList1(SinglyLinkedListNode head) {
                while (head != null) {
                        System.out.println(head.data);
                        head = head.next;
                }
        }

        static void printLinkedList2(DoublyLinkedListNode head) {
                DoublyLinkedListNode current = head;
                while (current != null) {
                        System.out.println(current.data);
                        current = current.next;
                }
        }

        public static void main(String[] args) {
                //Ex-1
                SinglyLinkedListNode head1 = new SinglyLinkedListNode(10);
                SinglyLinkedListNode second1 = new SinglyLinkedListNode(20);
                SinglyLinkedListNode third1 = new SinglyLinkedListNode(30);

                head1.next = second1;
                second1.next = third1;

                // Reverse the linked list
                SinglyLinkedListNode reversedHead1 = reverse1(head1);

                // Print the reversed linked list
                printLinkedList1(reversedHead1);

                //Ex-2
                DoublyLinkedListNode head2 = new DoublyLinkedListNode(10);
                DoublyLinkedListNode second2 = new DoublyLinkedListNode(20);
                DoublyLinkedListNode third2 = new DoublyLinkedListNode(30);

                head2.next = second2;
                second2.next = third2;
                second2.prev = head2;
                third2.prev = second2;

                // Reverse the linked list
                DoublyLinkedListNode reversedHead2 = reverse2(head2);

                // Print the reversed linked list
                printLinkedList2(reversedHead2);
        }

}





