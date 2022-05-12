package tree;

public class BinaryTreeFromScratch {

    Node root;

    // Add a new node to the tree
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

    public Node findNode(int key) {
        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

    public void preOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverseTree(focusNode.leftChild);
            preOrderTraverseTree(focusNode.rightChild);

        }
    }

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);

        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);

        }
    }

    public static void main(String[] args) {

        BinaryTreeFromScratch theTree = new BinaryTreeFromScratch();

        theTree.addNewNode(50, "President");
        theTree.addNewNode(25, "Vice President");
        theTree.addNewNode(15, "Office Manager");
        theTree.addNewNode(30, "Secretary");
        theTree.addNewNode(75, "Sales Manager");
        theTree.addNewNode(85, "Salesman I");

        System.out.println("\nPRE Order Traversal:");
        theTree.preOrderTraverseTree(theTree.root);

        System.out.println("\nIN Order Traversal:");
        theTree.inOrderTraverseTree(theTree.root);

        System.out.println("\nPOST Order Traversal:");
        theTree.postOrderTraverseTree(theTree.root);

        System.out.println("\nFind for 30:");
        System.out.println(theTree.findNode(30));

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
