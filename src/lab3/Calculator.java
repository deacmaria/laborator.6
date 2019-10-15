package lab3;

public class Calculator {

    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public int substract(int first, int second) {
        int substract = first - second;
        return substract;
    }

    public int divided(int first, int second) {
        int divided = first / second;
        // divided( first / second)
        return divided;
    }

    public int multiply(int first, int second) {
        int multiply = first * second;
        return multiply;
    }

    public int media(int first,int second,int third) {
        int media = (first + second + third) / 3;
        return media;
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
