package src.clueTree;

public class ClueTree {
    private class Node {
        String clue;
        Node left, right;

        // Constructor to initialize
        public Node(String clue) {
            this.clue = clue;
            left = right = null;
        }
    }

    private Node root;

    // Insert a new clue into the tree
    public void insertClue(String clue) {
        root = insertRecursive(root, clue);
    }

    private Node insertRecursive(Node root, String clue) {
        if (root == null) {
            return new Node(clue);
        }
        if (clue.compareTo(root.clue) < 0) {
            root.left = insertRecursive(root.left, clue);
        } else if (clue.compareTo(root.clue) > 0) {
            root.right = insertRecursive(root.right, clue);
        }
        return root;
    }

    // In-order traversal
    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.println(node.clue);
            inOrderRecursive(node.right);
        }
    }

    // Pre-order traversal
    public void preOrder() {
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node node) {
        if (node != null) {
            System.out.println(node.clue);
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    // Post-order traversal
    public void postOrder() {
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.println(node.clue);
        }
    }

    // Search for a specific clue
    public boolean findClue(String clue) {
        return findClueRecursive(root, clue);
    }

    private boolean findClueRecursive(Node root, String clue) {
        if (root == null) {
            return false;
        }
        if (root.clue.equals(clue)) {
            return true;
        }
        return clue.compareTo(root.clue) < 0
            ? findClueRecursive(root.left, clue)
            : findClueRecursive(root.right, clue);
    }

    // Count total number of clues
    public int countClues() {
        return countRecursive(root);
    }

    private int countRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countRecursive(node.left) + countRecursive(node.right);
    }

    // Example usage
    public static void main(String[] args) {
        ClueTree clueTree = new ClueTree();

        // Inserting clues into the tree
        clueTree.insertClue("Key to the Treasure");
        clueTree.insertClue("Map of the Hidden Valley");
        clueTree.insertClue("Compass of Destiny");
        clueTree.insertClue("Scroll of the Ancients");
        clueTree.insertClue("Ring of Power");

        // Count and display total number of clues
        System.out.println("Total number of clues: " + clueTree.countClues());

        // In-order traversal (should display clues in sorted order)
        System.out.println("In-order traversal:");
        clueTree.inOrder();

        // Pre-order traversal
        System.out.println("Pre-order traversal:");
        clueTree.preOrder();

        // Post-order traversal
        System.out.println("Post-order traversal:");
        clueTree.postOrder();

        // Searching for a specific clue
        String searchClue = "Map of the Hidden Valley";
        System.out.println("Is '" + searchClue + "' in the tree? " + clueTree.findClue(searchClue));

        // Searching for a clue that doesn't exist
        String missingClue = "Amulet of Time";
        System.out.println("Is '" + missingClue + "' in the tree? " + clueTree.findClue(missingClue));
    }
}
