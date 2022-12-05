package example.Algorithms.BFStree;

import java.util.ArrayList;
import java.util.List;

public class tree {
    private int value;
    private List<tree> children;

    public tree(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public int getValue() {
        return this.value;
    }

    public List<tree> getChildren() {
        return this.children;
    }

    public tree addChild(int value) {
        tree newChild = new tree(value);
        children.add(newChild);
        return newChild;
    }
}
