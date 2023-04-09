import Creational.Prototype.Shape;
import Creational.Prototype.ShapeCash;
import Creational.Singleton.Singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("======== Singleton Pattern ========");
        Singleton singleton = Singleton.getSingletonInstance();
        Singleton singleton1 = Singleton.getSingletonInstance();
        System.out.println(singleton);
        System.out.println(singleton);

    }
}