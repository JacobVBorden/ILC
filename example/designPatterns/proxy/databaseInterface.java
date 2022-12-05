package example.designPatterns.proxy;

// assume database is for a store
public interface databaseInterface {
    public String getProductList();
    public String getOrders();
}
