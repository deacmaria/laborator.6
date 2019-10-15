package lab2.rescue;

public class Dog {
    private String color = "geo";
    private char gender = 'f';
    private float age = 3.4f;
    private String breed = "Geman Shepard";
    private float weight = 33.5f;
    private String name = "Rex";


    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }


    public void setGender(char newGender){
        this.gender = newGender;
    }
    public char getGender(){
        return this.gender;
    }

    public void setAge(float newAge){
        this.age = newAge;
    }

    public float getAge() {
        return this.age;
    }

    public void setBreed(String newBreed){
        this.breed = newBreed;
    }
    public String getBreed(){
        return this.breed;
    }
}
