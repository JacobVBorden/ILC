package example.Algorithms.DFStree;

import java.util.Stack;

public class DFS {

    public Node traversePreOrderSearch(Node root, int searchValue) {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        stack.push(root);
        while(!stack.isEmpty()) {
            if(current.value == searchValue){
                return current;
            }
            current = stack.pop();

            if(current.right != null) {
                stack.push(current.right);
            }    
            if(current.left != null) {
                stack.push(current.left);
            }
        }
        
        return null;
    }

}

