package lab2.rescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        System.out.println(rex.name);
        rex.bark();

        Dog rexa = new Dog();
        rexa.name = "Rexa";
        System.out.println(rexa.name);
        rexa.bark();
    }
}
