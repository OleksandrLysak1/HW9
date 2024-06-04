package HW9;

public class Main {
    public static void main(String[] args) {
        // Тестування MyArrayList
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println("MyArrayList size: " + myArrayList.size());
        System.out.println("Element at index 1: " + myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println("MyArrayList size after removal: " + myArrayList.size());
        myArrayList.clear();
        System.out.println("MyArrayList size after clear: " + myArrayList.size());

        // Тестування MyLinkedList
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("World");
        myLinkedList.add("!");
        System.out.println("MyLinkedList size: " + myLinkedList.size());
        System.out.println("Element at index 1: " + myLinkedList.get(1));
        myLinkedList.remove(1);
        System.out.println("MyLinkedList size after removal: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("MyLinkedList size after clear: " + myLinkedList.size());

        // Тестування MyQueue
        MyQueue<Double> myQueue = new MyQueue<>();
        myQueue.add(1.1);
        myQueue.add(2.2);
        myQueue.add(3.3);
        System.out.println("MyQueue size: " + myQueue.size());
        System.out.println("First element: " + myQueue.peek());
        System.out.println("Polled element: " + myQueue.poll());
        System.out.println("MyQueue size after poll: " + myQueue.size());
        myQueue.clear();
        System.out.println("MyQueue size after clear: " + myQueue.size());

        // Тестування MyStack
        MyStack<Character> myStack = new MyStack<>();
        myStack.push('A');
        myStack.push('B');
        myStack.push('C');
        System.out.println("MyStack size: " + myStack.size());
        System.out.println("Top element: " + myStack.peek());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("MyStack size after pop: " + myStack.size());
        myStack.clear();
        System.out.println("MyStack size after clear: " + myStack.size());

        // Тестування MyHashMap
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);
        System.out.println("MyHashMap size: " + myHashMap.size());
        System.out.println("Value for key 'two': " + myHashMap.get("two"));
        myHashMap.remove("two");
        System.out.println("MyHashMap size after removal: " + myHashMap.size());
        myHashMap.clear();
        System.out.println("MyHashMap size after clear: " + myHashMap.size());
    }
}

