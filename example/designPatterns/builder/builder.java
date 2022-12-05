package example.designPatterns.builder;

public interface builder {
    void setFloors(int numFloors);
    void setPool(boolean pool);
    void setAC(AC type);
    void setMaterials(Materials materials);
}
