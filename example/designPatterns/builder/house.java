package example.designPatterns.builder;

public class house {
    int floors;
    boolean pool;
    AC type;
    Materials materials;


    public house(int floors, boolean pool, AC type, Materials materials) {
        this.floors = floors;
        this.pool = pool;
        this.type = type;
        this.materials = materials;
    }
    
}
