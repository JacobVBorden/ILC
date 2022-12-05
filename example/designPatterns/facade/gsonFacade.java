package example.designPatterns.facade;

// Error are due to not having GSON innstalled. As this is an example on not going to be used 
// installing GSON is not needed. 
public class gsonFacade {
    private static Gson gson = new Gson();
    private String result;

    public String toJSON(Object obj){
        try {
            result = gson.toJSON(obj);
        } catch (Exception e) {
            result = "Invalid JSON";
        }

    }
    
}
