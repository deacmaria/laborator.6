package lab2;

public class Main {

    public static void main(String[] args) {
        int x = 6;
        int y = 4;
        int z= 5;
        int t= 7;

        System.out.println("Rezultatul adunarii este: " + sum(x, y));
        System.out.println("Rezultatul scaderii este: " + substract(x, y));
        System.out.println("Rezultatul impartirii este: " + divided(x, y));
        System.out.println("Rezultatul inmultirii este: " + multiply(x, y));
        System.out.println("Rezultatul mediei aritmetice este:"+ media(x,y,z));
        System.out.println("Restul impartirii a doua numere este:" + rest(x,y));
        System.out.println("Distanta in metrii este:"+ inchToMeters(y));
        speed(1200, 1, 1, 10);
        printJavaText();
        printText();
        farenheitToCelsius(110);
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int substract(int first, int second) {
        int substract = first - second;
        return substract;
    }

    public static int divided(int first, int second) {
        int divided = first / second;
        // divided( first / second)
        return divided;
    }

    public static int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }

    private static void printJavaText() {
        System.out.println("   J     a   V     V   a  ");
        System.out.println("   J    a a   V   V   a a  ");
        System.out.println("J  J   aaaaa   V V   aaaaa  ");
        System.out.println(" JJ   a     a   V   a     a  ");
    }

    public static int media(int first,int second,int third) {
        int media = (first + second + third) / 3;
        return media;
    }
    public static void printText(){
        System.out.println("  +\"\"\"\"\"+  ");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  | ");
        System.out.println("  | '-' |  ");
        System.out.println("  +_____+");
     }
     public static int rest(int first, int second){
        int rest= first % second;
        return rest;

    }
    public static float farenheitToCelsius(float farenheitTemp){
        float temperature = (farenheitTemp-32)*(5.0f/9.0f);
        System.out.println("Converting " + farenheitTemp + "°F to Celsius: " + temperature);
        return temperature;
    }
    public static float inchToMeters(float second){
        float inchToMeters= second / 39.37f;
        return inchToMeters;
    }
    public static void speed(float distanceMeters, int hours,int minutes, int seconds){
        float totalTimeInSeconds = hours*3600 + minutes*60 + seconds;;
        System.out.println("Viteza in metrii pe secunda este : " + distanceMeters/totalTimeInSeconds);
        System.out.println("Viteza in kilometrii pe ora este : " + (distanceMeters/1000)/(totalTimeInSeconds/3600));
        System.out.println("Viteza in mile pe ora este : " + (distanceMeters/1609.344)/(totalTimeInSeconds/3600));
    }

}