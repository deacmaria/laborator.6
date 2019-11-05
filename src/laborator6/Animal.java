package laborator6;

public class Animal {

    private int numberOfLegs;
    public void setNumberOfLegs(int number){
        this.numberOfLegs=number;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void movingWithSpeed(int speed){
        System.out.println("The animal is moving with "+ speed);
    }


}
