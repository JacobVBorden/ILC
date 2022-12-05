package example.Algorithms.BFStree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {

    public static tree search(int value, tree root) {
        // ArrayDeque is an array double ended queue. Ie can be added and removed from both sides. 
        Queue<tree> queue = new ArrayDeque<>();
        queue.add(root); 

        while(!queue.isEmpty()) {

            tree currentNode = queue.remove(); 
            
            if (currentNode.getValue() == value) {
                System.out.println("Finished searching!");
                return currentNode;
            }
            else {
                queue.addAll(currentNode.getChildren());
            }
        }

        return null;
    }
}
