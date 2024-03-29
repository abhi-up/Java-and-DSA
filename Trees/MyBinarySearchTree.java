class TreeNode {
    int data; // Data stored in the node
    TreeNode left; // Reference to the left child node
    TreeNode right; // Reference to the right child node

    // Constructor to initialize the node with data
    TreeNode(int data) {
        this.data = data;
        this.left = null; // Initialize left child as null
        this.right = null; // Initialize right child as null
    }

    // Method to provide a string representation of the node
    public String toString() {
        return "Value= " + this.data; // Return the string representation of the node's data
    }
}

class BinarySearchTree {
    TreeNode root; // Reference to the root node of the binary search tree

    // Constructor to initialize the binary search tree with null root
    BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        insert(root, data);
    }

    // Method to insert a new node with given data into the BST recursively
    TreeNode insert(TreeNode root, int data) {
        // If the root is null, create a new node with the given data and return it as
        // the new root
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // If the data is less than or equal to the current node's data, recursively
        // insert into the left subtree
        if (data <= root.data) {
            return insert(root.left, data);
        }

        // Otherwise, recursively insert into the right subtree
        return insert(root.right, data);
    }

    // Method to provide a string representation of the root node's data
    public String toString() {
        return "value= " + this.root.data;
    }
}

public class MyBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree(); // Creating a new instance of BinarySearchTree

        // Inserting elements into the binary search tree
        root.insert(5);
        root.insert(4);
        root.insert(2);
        root.insert(6);
        root.insert(8);
        root.insert(1);
        root.insert(7);
        root.insert(0);

        System.out.println(root); // Printing the root node's data
    }
}
