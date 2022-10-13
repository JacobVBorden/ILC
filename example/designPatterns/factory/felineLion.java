package ilc.example.designPatterns.factory;

public class felineLion extends Feline{
    @Override
    public Cats createFeline(){
        return new Lion();
    }

    
}
