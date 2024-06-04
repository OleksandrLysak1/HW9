package HW9;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value, top);
        top = newNode;
        size++;
    }

    public T remove(int index) {
        checkIndex(index);
        if (index == 0) {
            return pop();
        } else {
            Node<T> previous = getNode(index - 1);
            Node<T> current = previous.next;
            previous.next = current.next;
            size--;
            return current.value;
        }
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return top.value;
    }

    public T pop() {
        if (size == 0) {
            return null;
        }
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }

    private Node<T> getNode(int index) {
        Node<T> current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}
