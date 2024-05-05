public class Implementation {
    public static void main(String[] args) {
        System.out.println("Hello World");
        CircularLL<Integer> cll = new CircularLL<>();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.printCircularLL();
    }
}

class CircularLL<T> {
    private Node<T> tail;

    CircularLL() {
        this.tail = null;
    }

    void insert(T value) {
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        if (tail == null) {
            tail = newNode;
            newNode.setNext(tail);
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    void printCircularLL() {
        Node<T> temp = tail.getNext();

        do {
            System.out.print(temp.getData() + "  ");
            temp = temp.getNext();
        } while (temp != tail.getNext());
    }
}

class Node<T> {
    private T data;
    private Node<T> next;

    Node() {
        this.data = null;
        this.next = null;
    }

    void setData(T data) {
        this.data = data;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    T getData() {
        return data;
    }

    Node<T> getNext() {
        return next;
    }

}