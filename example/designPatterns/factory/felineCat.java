package example.designPatterns.factory;

public class felineCat extends Feline {
    @Override
    public Cats createFeline(){
        return new HouseCat();
    }
    
}
