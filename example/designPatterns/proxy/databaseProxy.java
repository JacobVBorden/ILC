package example.designPatterns.proxy;

public class databaseProxy implements databaseInterface{
    private static String cachedProducts;
    private static String cachedOrders;
    private static boolean needReset;

    public String getProducts(){
        if(cachedProducts != || needReset){
            cachedProducts = database.getProducts();
        }
        else{
            System.out.print("Reterived Products from Cache");
        }

        return cachedProducts;
    }

    public String getOrders(){
        if(cachedOrders != null || needReset){
            cachedOrders = database.getOrders();
        }
        else{
            System.out.print("Retrieved Orders from Cache");
        }

        return cachedOrders;
    }

    public void reset(){
        cachedOrders = null;
        cachedProducts = null;
    }

    
}
