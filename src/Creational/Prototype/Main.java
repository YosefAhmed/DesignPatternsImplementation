package Creational.Prototype;

import Creational.Singleton.Singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("======== Prototype Pattern ========");
        ShapeCash.loadCash();
        Shape clonedShape = ShapeCash.getShape("1");
        System.out.println("Shape:"+ clonedShape.getType() +" "+ clonedShape);
        Shape clonedShape1 = ShapeCash.getShape("2");
        System.out.println("Shape:"+ clonedShape1.getType()+" "+ clonedShape1);
        Shape clonedShape2 = (Shape) clonedShape.clone();
        System.out.println("Shape:"+ clonedShape2.getType()+" "+ clonedShape2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(clonedShape.getId()+"   "+clonedShape2.getId());
        System.out.println("changing the cloned id to 1c");
        clonedShape2.setId("1c");
        System.out.println(clonedShape.getId()+"   "+clonedShape2.getId());



    }
}