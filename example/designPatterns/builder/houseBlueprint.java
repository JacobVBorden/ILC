package example.designPatterns.builder;

public class houseBlueprint {
    int floors;
    boolean pool;
    AC type;
    Materials materials;


    public houseBlueprint(int floors, boolean pool, AC type, Materials materials) {
        this.floors = floors;
        this.pool = pool;
        this.type = type;
        this.materials = materials;
    }
    
}
