package fromscratch.binarytree;

public class TheTree {

    Node root;

    public void addNode(Node node) {

        if (root == null) {
            root = node;
            return;
        }

        Node focusNode = root;
        Node parent;

        while (true) {
            parent = focusNode;

            if (node.key < parent.key) {
                if (parent.leftChild == null) {
                    parent.leftChild = node;
                    return;
                } else {
                    focusNode = parent.leftChild;
                }
            } else {
                if (parent.rightChild == null) {
                    parent.rightChild = node;
                    return;
                } else {
                    focusNode = parent.rightChild;
                }
            }
        }
    }

    public Node findNodeForKey(int key) {

        Node focusNode = root;

        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if (focusNode == null) {
                return null;
            }
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
        TheTree theTree = new TheTree();

        theTree.addNode(new Node(50, "President"));
        theTree.addNode(new Node(25, "Vice President"));
        theTree.addNode(new Node(15, "Office Manager"));
        theTree.addNode(new Node(30, "Secretary"));
        theTree.addNode(new Node(75, "Sales Manager"));
        theTree.addNode(new Node(85, "Salesman I"));

        // theTree.addNode(50, "President");
        // theTree.addNode(25, "Vice President");
        // theTree.addNode(15, "Office Manager");
        // theTree.addNode(30, "Secretary");
        // theTree.addNode(75, "Sales Manager");
        // theTree.addNode(85, "Salesman I");

        System.out.println("\nPRE Order Traversal:");
        theTree.preOrderTraverseTree(theTree.root);

        System.out.println("\nIN Order Traversal:");
        theTree.inOrderTraverseTree(theTree.root);

        System.out.println("\nPOST Order Traversal:");
        theTree.postOrderTraverseTree(theTree.root);

        System.out.println("\nFind for 15:");
        System.out.println(theTree.findNodeForKey(15));

        System.out.println("\nFind for 30:");
        System.out.println(theTree.findNodeForKey(30));

        System.out.println("\nFind for 90:");
        System.out.println(theTree.findNodeForKey(90));

    }

}

class Node {

    int key;
    String value;
    Node leftChild;
    Node rightChild;

    Node(Node node) {
    }

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key = " + this.key + "\tValue = " + value;
    }

}
