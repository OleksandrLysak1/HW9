public class MyHashMap<K, V> {
    private Node<K, V>[] table;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private V nullKeyValue;
    private boolean nullKeyPresent = false;

    private static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        if (key == null) {
            if (!nullKeyPresent) {
                size++;
                nullKeyPresent = true;
            }
            nullKeyValue = value;
            return;
        }

        int index = indexFor(hash(key));
        Node<K, V> node = table[index];
        if (node == null) {
            table[index] = new Node<>(key, value, null);
        } else {
            Node<K, V> current = node;
            while (current != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            table[index] = new Node<>(key, value, node);
        }
        size++;
    }

    public V remove(K key) {
        if (key == null) {
            if (nullKeyPresent) {
                V oldValue = nullKeyValue;
                nullKeyValue = null;
                nullKeyPresent = false;
                size--;
                return oldValue;
            }
            return null;
        }

        int index = indexFor(hash(key));
        Node<K, V> node = table[index];
        Node<K, V> previous = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (previous == null) {
                    table[index] = node.next;
                } else {
                    previous.next = node.next;
                }
                size--;
                return node.value;
            }
            previous = node;
            node = node.next;
        }
        return null;
    }

    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
        nullKeyValue = null;
        nullKeyPresent = false;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        if (key == null) {
            return nullKeyPresent ? nullKeyValue : null;
        }

        int index = indexFor(hash(key));
        Node<K, V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    private int hash(Object key) {
        return key == null ? 0 : key.hashCode();
    }

    private int indexFor(int hash) {
        return hash & (table.length - 1);
    }
}
