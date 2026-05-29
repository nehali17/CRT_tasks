class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void delete(int key) {
        if (head == null)
            return;

        Node temp = head;

        // If head node is to be deleted
        if (head.data == key) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null)
            return;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println("Doubly Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}