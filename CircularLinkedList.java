class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void delete(int key) {
        if (head == null)
            return;

        Node current = head;
        Node prev = null;

        // If head node is to be deleted
        if (head.data == key) {

            // Only one node
            if (head.next == head) {
                head = null;
                return;
            }

            Node last = head;

            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
            return;
        }

        do {
            prev = current;
            current = current.next;
        } while (current != head && current.data != key);

        if (current.data == key) {
            prev.next = current.next;
        }
    }

    void display() {
        if (head == null)
            return;

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Circular Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}