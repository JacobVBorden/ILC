package ilc.example.designPatterns.prototype;

public abstract class Shape{
    public int x;
    public int y;
    public String color; 

    public Shape(){}

    public Shape(int xValue, int yValue, String colorValue){
        this.x = xValue;
        this.y = yValue;
        this.color = colorValue; 
    }

    public Shape(Shape target){
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color; 
        }
    }

    public abstract Shape clone();


}

/* 
The protoype design pattern allows copying objects without needing to know the exact class 
of the object. In this case, any number of shapes can extend the Shape class but they can
all be cloned using the clone method. I.e if given a list of shapes you can copy any of 
them using the clone method without needing to worry about copying the objects feilds
or even creating a new object. 
*/