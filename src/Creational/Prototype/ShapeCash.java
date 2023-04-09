package Creational.Prototype;

import java.util.HashMap;

public class ShapeCash {
    private static HashMap shapeCash = new HashMap();

    // returns a clone from an object in hashmap
    public static Shape getShape(String id){
        Shape cashedShape = (Shape) shapeCash.get(id);
//        System.out.println("Original Object: "+cashedShape);
        return (Shape) cashedShape.clone();
    }

    public static void loadCash(){
        Circle circle = new Circle();
        circle.setId("1");
//        System.out.println("Original circle: "+circle);

        shapeCash.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeCash.put(square.getId(), square);
//        System.out.println("Original square: "+square);

    }
}
