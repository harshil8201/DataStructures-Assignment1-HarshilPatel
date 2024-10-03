package src.artifactvault;

import java.util.Arrays;

public class ArtifactVault {
    private String[] artifacts;
    private int size;

    // Constructor to initialize the vault with a given capacity
    public ArtifactVault(int capacity) {
        artifacts = new String[capacity];
        size = 0;
    }

    // Adds an artifact to the vault and sorts the array
    public void addArtifact(String artifact) {
        if (size < artifacts.length) {
            artifacts[size] = artifact;
            size++;
            Arrays.sort(artifacts, 0, size); // Keep artifacts sorted
        } else {
            System.out.println("Vault is full, cannot add more artifacts.");
        }
    }

    // Removes an artifact by shifting the remaining elements
    public void removeArtifact(String artifact) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(artifact)) {
                for (int j = i; j < size - 1; j++) {
                    artifacts[j] = artifacts[j + 1];
                }
                artifacts[size - 1] = null; // Clear the last slot
                size--;
                return;
            }
        }
        System.out.println("Artifact not found.");
    }

    // Linear search for finding an artifact
    public int findArtifactLinear(String artifact) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(artifact)) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Binary search for finding an artifact in a sorted array
    public int findArtifactBinary(String artifact) {
        return Arrays.binarySearch(artifacts, 0, size, artifact);
    }

    // Example usage
    public static void main(String[] args) {
        ArtifactVault vault = new ArtifactVault(5);

        // Adding artifacts to the vault
        vault.addArtifact("Sword of Truth");
        vault.addArtifact("Shield of Valor");
        vault.addArtifact("Crown of Wisdom");

        // Printing the vault contents
        System.out.println("Artifacts in the vault: " + Arrays.toString(vault.artifacts));

        // Searching for an artifact
        int index = vault.findArtifactLinear("Crown of Wisdom");
        System.out.println("Found 'Crown of Wisdom' at index: " + index);

        // Removing an artifact
        vault.removeArtifact("Shield of Valor");
        System.out.println("After removing 'Shield of Valor': " + Arrays.toString(vault.artifacts));

        // Searching using binary search
        int binarySearchIndex = vault.findArtifactBinary("Sword of Truth");
        System.out.println("Binary search index of 'Sword of Truth': " + binarySearchIndex);
    }
}
