public class Main {
    public static void main(String[] args) {
        // Tao binary rong
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(8);
        binarySearchTree.insert(10);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        // Debug
        System.out.println(binarySearchTree.search(20));
    }
}
