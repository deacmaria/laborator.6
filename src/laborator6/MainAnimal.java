package laborator6;

import javax.management.modelmbean.ModelMBeanOperationInfo;

public class MainAnimal {
    public static void main(String[] args) {
        cat Moo= new cat();
        System.out.println(Moo.canClimb);
        Moo.setNumberOfLegs(4);
        System.out.println(Moo.getNumberOfLegs());
        Moo.getSpeed();
        System.out.println("The animal drinks milk: "+Moo.drinkMilk);
        dog Rex = new dog();
        System.out.println(Rex.canClimb);
        Rex.setNumberOfLegs(4);
        System.out.println(Rex.getNumberOfLegs());
        duck Chichi= new duck();
        Chichi.getSpeed();

    }

}
