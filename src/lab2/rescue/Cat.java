package lab2.rescue;

public class Cat {

    private String name =" Kitty";
    private float age = 1.6f;
    private int healthy = 4;
    private int hunger = 9;
   private String nameoffavouritefood ="kitkat";

   public void setName(String newName){
       this.name = newName;
   }

   public String getName() {
       return this.name;
   }
   public void setAge(float newAge){
       this.age = newAge;
   }
   public float getAge(){
       return this.age;
   }
   public void setHealthy(int newHealthy){
       this.healthy = newHealthy;
   }
   public int getHealthy(){
       return this.healthy;
   }

}
