package lab2.rescue;

public class AppMain {
    public static void main(String[] args) {
        Cat Kitty = new Cat();
        System.out.println("Cat");

        System.out.println("Numele inainte de setName este : " + Kitty.getName());
        Kitty.setName("Matz");
        System.out.println("Numele dupa setName este : " + Kitty.getName());

        System.out.println("Varsta inainte de setAge este:"+Kitty.getAge());
        Kitty.setAge(45);
        System.out.println("varsta dupa setAge este:"+ Kitty.getAge());

        System.out.println("Healthy inainte de setHealthy este:"+ Kitty.getHealthy());
        Kitty.setHealthy(6);
        System.out.println("Healthy dupa setHealthy este:"+ Kitty.getHealthy());

        Dog Rex = new Dog();
        System.out.println("Dog");

        System.out.println("Numele inainte de setName este:"+Rex.getName());
        Rex.setName("Bruno");
        System.out.println("Numele dupa setAge este:"+Rex.getName());

        System.out.println("Gender inainte de setGender este:"+ Rex.getGender());
        Rex.setGender('m');
        System.out.println("Gender dupa setGender este:"+Rex.getGender());

        System.out.println("Age inainte de setAge este:"+ Rex.getAge());
        Rex.setAge(5f);
        System.out.println("Age dupa setAge este:"+ Rex.getAge());

        System.out.println("Breed inainte de setBreed este:"+Rex.getBreed());
        Rex.setBreed("Ianu");
        System.out.println("Breed dupa setBreed este:"+ Rex.getBreed());



    }
}
