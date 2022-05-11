package tree;

public class BinaryTreeFromScratch {

    Node root;

    // Add new node to the tree
    public void addNewNode(int key, String value) {
        Node newNode = new Node(key, value);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root; // start with root to traverse the tree
            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }

                }
            }

        }
    }

    public static void main(String[] args) {

    }

}

class Node {

    int key;
    String value;
    Node leftChild;
    Node rightChild;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return "key: " + this.key + " has value: " + this.value;
    }

}
