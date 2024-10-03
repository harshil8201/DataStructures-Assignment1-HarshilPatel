# DataStructures-Assignment1-HarshilPatel

Assignment 1 submission

**Name:** Harshil Patel

**Student ID:** C0908491

---

### Ques1:

**Key Components:**

- **ArtifactVault Class:** Manages an array of Artifact objects.
- **Add Artifact:** Inserts artifacts into the first available slot while keeping the array in sorted order.
- **Remove Artifact:** Deletes an artifact by its name and shifts the remaining elements to fill the gap.
- **Linear Search:** Iteratively searches through the array for the specified artifact.
- **Binary Search:** Conducts a binary search on the sorted array to locate an artifact by its name.
- **Artifact Class:** Contains the details of each artifact (name and age) and implements the Comparable interface to facilitate sorting.

### Ques2:

**Key Components:**

- **Node Class:** Represents each location in the path, containing the location name and a reference to the next node.
- **Add Location:** Appends a new location to the end of the linked list.
- **Remove Last Location:** Deletes the last location by traversing to the second-to-last node and updating the pointers accordingly.
- **Check for Loop:** Utilizes Floyd’s Cycle-Finding Algorithm (slow and fast pointers) to identify if a loop exists in the path.
- **Print Path:** Traverses the linked list to display all locations.

**Explanation:**

- **Adding Locations:** New locations are appended at the end of the singly linked list.
- **Removing Last Location:** The last location is removed by navigating to the second-to-last node and adjusting the tail pointer.
- **Loop Detection:** The algorithm detects a cycle if the slow and fast pointers converge, indicating a loop in the path.
- **Manual Loop:** For testing, I introduced a loop by linking the last node back to a previous node in the list (Maze -> Hallway), simulating a trap in the labyrinth.

### Ques3:

**Key Components:**

- **Stack<String>:** The stack is created using Java’s built-in Stack class to store titles of scrolls.
- **Push Operation:** Adds a new scroll to the top of the stack.
- **Pop Operation:** Removes and returns the scroll at the top of the stack.
- **Peek Operation:** Displays the scroll on top without removing it from the stack.
- **Search Operation:** Verifies if a specific scroll exists in the stack using the `contains()` method.
- **Display:** Outputs all scrolls in the stack from the top to the bottom.

**Explanation:**

- **Push Scroll:** Scrolls like "Ancient Scroll of Wisdom," "Scroll of Fire Magic," and "Scroll of Earth Power" are added to the stack.
- **Peek Scroll:** The top scroll, "Scroll of Earth Power," is shown without removal.
- **Contains Scroll:** Checks for the existence of "Scroll of Water Magic" (not found), while "Scroll of Fire Magic" exists.
- **Pop Scroll:** The top scroll ("Scroll of Earth Power") is removed from the stack.
- **Display Stack:** Shows the remaining scrolls after popping, displaying only two scrolls.

### Ques4:

**Key Components:**

- **Circular Queue:** Utilizes a circular array to facilitate enqueueing and dequeueing, employing both front and rear pointers with modulus operations for wrapping.
- **Enqueue:** Adds an explorer to the rear of the queue, wrapping around if needed.
- **Dequeue:** Removes an explorer from the front and adjusts the pointer to the next element.
- **Peek:** Displays the explorer at the front without removing them.
- **Is Full:** Determines if the queue is full by comparing its size to the capacity.
- **Is Empty:** Checks if the queue is empty by comparing its size to zero.
- **Display Queue:** Outputs all explorers currently in the queue in the correct order.

**Explanation:**

- **Enqueue:** Adds explorers "A," "B," "C," "D," and "E" to the queue. When attempting to enqueue "F," the system detects the queue is full.
- **Dequeue:** Removes explorers starting from the front. The queue correctly wraps around as needed due to its circular structure.
- **Peek:** Displays the next explorer in line (at the front) without removal.
- **Full/Empty Check:** Confirms the queue's state at various stages.

### Ques5:

**Key Components:**

- **Binary Tree Structure:** A Node class is defined to represent each clue, containing references for left and right children to maintain a binary tree structure.
- **Insertion:** The insert method places clues while preserving the binary search tree (BST) property, ensuring left children are smaller and right children are larger.
- **Tree Traversals:**
  - **In-order Traversal:** Visits nodes in left -> root -> right order.
  - **Pre-order Traversal:** Visits nodes in root -> left -> right order.
  - **Post-order Traversal:** Visits nodes in left -> right -> root order.
- **Find Clue:** Searches for a specific clue using the binary search tree logic.
- **Count Clues:** Recursively counts the total number of clues in the tree.

**Explanation:**

- **Insert Clues:** Clues are added to the tree while maintaining the binary search tree property.
- **Traversals:** Demonstrates in-order, pre-order, and post-order traversals to visit nodes in different sequences.
- **Find Clue:** The method successfully locates "Clue B" and confirms that "Clue E" is absent.
- **Count Clues:** Recursively counts and returns the total number of clues in the tree.

---

### Challenge Descriptions and Approach:

1. **The Array Artifact**

   - **Description:** Developed the `ArtifactVault` class to manage an array of artifacts, featuring methods for adding, removing, and searching (linear and binary).
   - **Approach:** An array is utilized to store the artifacts, ensuring binary search functionality by maintaining a sorted order after each insertion. Removal by name is managed through element shifting. Linear search is straightforward, while binary search requires the array to remain sorted.
   - **Assumptions/Design:** The array is of fixed size, and binary search presupposes a sorted array.
   - **Run:** The class can be executed in any Java environment. Instantiate the class and invoke the methods for adding, removing, and searching artifacts.

2. **The Linked List Labyrinth**

   - **Description:** Constructed the `LabyrinthPath` class using a singly linked list with methods for adding a location, removing the last visited location, detecting loops, and printing the path.
   - **Approach:** A singly linked list is employed for efficient location addition and removal. Loop detection is implemented using Floyd’s cycle-finding algorithm (tortoise and hare).
   - **Assumptions/Design:** The list is unbounded, and no special handling is required for duplicate locations.
   - **Run:** Create an instance of `LabyrinthPath` and use methods to manipulate and traverse the list. The loop detection can be tested with either cyclic or acyclic data.

3. **The Stack of Ancient Texts**

   - **Description:** Developed a `ScrollStack` class that manages a stack of scrolls, featuring methods for pushing, popping, peeking, and searching for specific scroll titles.
   - **Approach:** A basic stack data structure is implemented using an array to manage standard operations (push, pop, peek). The search operation is executed linearly through the stack.
   - **Assumptions/Design:** Stack overflow is not explicitly managed, and the stack is of fixed size.
   - **Run:** Create an instance of `ScrollStack`, and utilize methods to manipulate the stack. Push and pop operations simulate scroll management.

4. **The Queue of Explorers**

   - **Description:** Developed an `ExplorerQueue` class using a circular queue to manage explorers, including enqueueing, dequeueing, peeking, and checking fullness or emptiness.
   - **Approach:** Implemented as a circular array with handling for wrap-around of the front and rear pointers. Ensured that full and empty states of the queue are accurately managed.
   - **Assumptions/Design:** The queue has a fixed size and explorers are added in the order they arrive.
   - **Run:** Instantiate the `ExplorerQueue` class, enqueue and dequeue explorers, and use methods for manipulation.

5. **The Binary Tree of Clues**
   - **Description:** Created a `ClueTree` class representing a binary search tree of clues, with methods for insertion, various traversals (in-order, pre-order, post-order), finding clues, and counting the total number of clues.
   - **Approach:** A binary search tree is implemented with recursive methods for insertion and traversal. The tree is structured for efficient clue searching and traversing.
   - **Assumptions/Design:** The tree is designed with unique clues in mind and is not self-balancing.
   - **Run:** Instantiate the `ClueTree` class and insert clues. Call the traversal and search methods to visualize the tree structure.

---

### How to Run the Code:

1. **Environment:** The code can be executed in any Java environment (e.g., IntelliJ IDEA, Eclipse, or command line with JDK installed).
2. **Compilation:** Each class can be compiled individually using the command:
   javac ClassName.java
3. **Execution:** Run the compiled class using:
   java ClassName
