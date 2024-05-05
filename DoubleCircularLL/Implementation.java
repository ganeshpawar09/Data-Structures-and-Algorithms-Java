
public class Implementation {
    public static void main(String[] args) {
        DoubleCircularLL<Integer> a = new DoubleCircularLL<>();
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(5);
        a.printDoubleCircularLL();
        a.printReverseDoubleCircularLL();
    }

}

class DoubleCircularLL<T> {
    private Node<T> tail;

    DoubleCircularLL() {
        this.tail = null;
    }

    void insert(T value) {
        Node<T> newNode = new Node<>();
        newNode.setData(value);
        if (tail == null) {
            tail = newNode;
            tail.setNext(tail);
            tail.setPrev(newNode);
        } else {

            newNode.setNext(tail.getNext());
            newNode.setPrev(tail);
            tail.getNext().setPrev(newNode);
            tail.setNext(newNode);
            tail = newNode;

        }
    }

    void printDoubleCircularLL() {
        Node<T> temp = tail.getNext();
        do {
            System.out.print(temp.getData() + "  ");
            temp = temp.getNext();
        } while (temp != tail.getNext());
        System.out.println();
    }

    void printReverseDoubleCircularLL() {
        Node<T> temp = tail;
        
        do {
            System.out.print(temp.getData() + "  ");
            temp = temp.getPrev();
        } while (temp != tail);
        System.out.println();
    }
}

class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    Node() {
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    void setData(T data) {
        this.data = data;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    T getData() {
        return data;
    }

    Node<T> getNext() {
        return next;
    }

    Node<T> getPrev() {
        return prev;
    }
}
