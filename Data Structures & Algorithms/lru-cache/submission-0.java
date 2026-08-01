class LRUCache {

    private class Node {
        int key, value;
        Node next, prev;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, Node> cache;
    private int capacity;
    private Node head;
    private Node tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToFront(Node node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node node = cache.get(key); // cache contains kety and points to node;
        remove(node);
        addToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            remove(node);
            addToFront(node);
            return;
        }
        Node node = new Node(key, value);
        cache.put(key, node);
        addToFront(node);
        if (cache.size() > capacity) {
            Node lru = tail.prev;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
