class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public void insert(int data) {
        this.root = insertKey(this.root, data);
    }

    public boolean search(int data) {
        Node node = searchKey(this.root, data);
        return node != null;
    }

    private Node searchKey(Node root, int number) {
        if (root == null || root.data == number) {
            return root;
        }
        if (number < root.data) {
            return searchKey(root.left, number);
        }
        return searchKey(root.right, number);
    }


    private Node insertKey(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertKey(root.left, data);
        else if (data > root.data)
            root.right = insertKey(root.right, data);
        return root;
    }


}
