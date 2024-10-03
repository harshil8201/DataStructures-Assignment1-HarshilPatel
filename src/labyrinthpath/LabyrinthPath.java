package src.labyrinthpath;

public class LabyrinthPath {
    private Node head;

    private class Node {
        String location;
        Node next;

        // Constructor to initialize
        public Node(String location) {
            this.location = location;
            this.next = null;
        }
    }

    // Add new location to the path
    public void addLocation(String location) {
        Node newNode = new Node(location);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Remove last visited location
    public void removeLastLocation() {
        if (head == null) {
            System.out.println("Path is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Detect if the path contains a loop
    public boolean containsLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Print the entire path
    public void printPath() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.location + " -> ");
            temp = temp.next;
        }
        System.out.println("End of path.");
    }

    // Example usage
    public static void main(String[] args) {
        LabyrinthPath path = new LabyrinthPath();

        // Adding locations to the path
        path.addLocation("Entrance");
        path.addLocation("Hall of Mirrors");
        path.addLocation("Chamber of Secrets");
        path.addLocation("Treasure Room");

        // Print the path
        System.out.print("Current path: ");
        path.printPath();

        // Remove the last location
        path.removeLastLocation();
        System.out.print("Path after removing last location: ");
        path.printPath();

        // Add a new location
        path.addLocation("Maze of Despair");
        System.out.print("Path after adding new location: ");
        path.printPath();

        // Check if the path contains a loop
        System.out.println("Does the path contain a loop? " + path.containsLoop());
    }
}
