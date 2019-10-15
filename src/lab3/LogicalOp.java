package lab3;

public class LogicalOp {




//exerictiul 3
     //  creati o metoda de tip int,
     //  care sa se numeasca (),
    //  si sa primeasca doua int-uri ca si parametrii.
    //  Folosind if - else,
    //  verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii,
   //  si returnati numarul mai mare.

public int checkBiggerNumber(int x, int y){
    if(x>y){
        return x;
    }
    else{
        return y;
    }
}
//exercitiul 4
    //Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    //Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”
    //Daca da, atunci metoda sa returneze “Learning text comparison”
    //Daca nu, atunci metoda sa returneze “Got to try some more”
public String comparisonText(String text) {
    if (text.equals("FastTrack")) {
        return "Learning text comparison";
    }
    else{
        return "Got to try some more";
    }
}
//Exercitiul 5
    //Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int
    //Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3,
    //returnati textul si numarul, in ordinea asta.
    //daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4
    //returnati numarul si textul, in ordinea asta

    public String equalText(String text, int x){
    if(text.equals("FrastTrackIT") && x<= 3){
        text.equals("FrastTrackIT");
    }
    else if(!text.equals("FrastTrackIT") && x>= 4){
        return (x + "fast");
    }
        return ("Didn't meet any condition");
}
//Exercitiul 6
     //Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    //Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul
    //Daca nu, sa printeze “The forecast snow is(cm):” si numarul.

    public String compareNumber(int x){
    if (x>8 || x==6){
        return "The amount of snow this winter was 8(cm):";
    }
    else{
        return "The forecast snow is(cm):" + x;
    }
    }
    //Exercitiul 7
    //Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    //Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”,
    // daca numarul este mai mic de 3 returnati “The number is lower than 3”

    public String compareNumberWithAnother(int x){
    if (x>3 && x==4){
        return "The number is greater than 3 and not equal to 4";}

        else if (x==4){
            return "The number is equal to 4";
        }
        else if(x<3){
            return "The number is lower than 3";

    }
        return "null";


}
//Exercitiul 10
     //Creati o metoda care sa se numeasca isEligibleToVote.
    //Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta
    //metoda sa iti zica daca daca persoana are drept de vot
    // Daca varsta e peste 18, sa se returneze true
    //ar daca nu, sa returneze false.

    public String  isEligibleToVote(int x) {
    if (x>=18){
        return "True";
    }
    else if (x<18){
        return"False";
        }
    return "null";
    }
//Exercitiul 11
    //Creati o metoda care sa primeasca 3 numere
    // ca si parametrii si sa returneze cel mai mare numar.
    public int theBiggestNumber(int x, int y,int z) {
        if (x % 2 == 0) {
            return x;
        }
        else if (y % 2 == 0) {
            return y;
        }
        else if (z%2==0){
            return z;
        }
        else{
            return 19;
        }
    }
    //Exercitiul 9
    //Creati o metoda care sa se numeasca isNumberEven.
    //Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals
    //Daca numarul e par sa returneze true iar daca e impar sa returnese false
    public String isNumberEven(int x){
    if (x%2==0){
        return "True";
    }
    else{
        return "False";
    }
    }
    //Exercitiul 8
    //Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit
    //Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
    //unde x trebuie sa reprezinte numarul apasat.
    //Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
    // ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.

   public void switchMethod(int number) {
       switch (number) {
           case 1:
               System.out.println("The number is: " + number + "!");
               break;
           case 2:
               System.out.println("The number is: " + number + "!");
               break;
           default:
               System.out.println("The number is: " + number);
       }
   }



}


