package example.designPatterns.builder;

public class houseBuilder implements builder {

    int numFloors;
    boolean pool;
    AC type;
    Materials materials;

    @Override
    public void setFloors(int numFloors){
        this.numFloors = numFloors;
    }

    @Override
    public void setPool(boolean pool) {
        this.pool = pool;
        
    }

    @Override
    public void setAC(AC type) {
        this.type = type;
    }

    @Override
    public void setMaterials(Materials materials) {
        this.materials = materials;
        
    }
    
    public house getResult(){
        return new house(numFloors, pool, type, materials);
    }
}
