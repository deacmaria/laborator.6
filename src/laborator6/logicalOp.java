package laborator6;

import java.util.ArrayList;
import java.util.List;

public class logicalOp {


    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
    public void myList( List<Integer> myList) {
        System.out.println(myList);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.
    public List<Integer> numberList(List<Integer>myList,int number){
        myList.add(number);
        System.out.println(myList);
        return myList;
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
    public void numberAndList(List<Integer>myList,int x) {
        for (int i = myList.indexOf(x); i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public void deLaCoadaList(List<Integer>myList){
        for (int i= myList.size()-1;i>=0;i--) {
            System.out.println(myList.get(i));
        }
}

//Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
// Metoda sa adauge parametrul de tip String in lista primita,
// iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
    public void nuMaiPot(List<String>myList, int b,String Dog ){
        myList.add(b, Dog);
        System.out.println(myList);
    }

    //Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public void doiParametrii(String f,List<String>myMYList){
        myMYList.add(0,f);
        System.out.println(myMYList);

    }
    //Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista, si ce pe ce pozitie.
    // (Ex: “Pe pozitia 1 valoare este 4”).
    public void pozitie ( List<String> myMyList){
        for (int i = 0; i<myMyList.size();i++){
            System.out.println("Pe pozitia "+i+" "+"este "+myMyList.get(i));
        }
    }

    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public void celMaiMareNumar( List<Integer>myList){
        int highest=0;
        for (int i=0; i< myList.size();i++){
            if (myList.get(i)>highest){}
            highest= myList.get(i);
        }
        System.out.println(highest);

    }
}