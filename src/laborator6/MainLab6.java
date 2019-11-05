package laborator6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MainLab6 {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);


        logicalOp mylogic= new logicalOp();
        System.out.println("exercitiul1");
        mylogic.myList(myList);
        System.out.println("exercitiu 2");
        mylogic.numberList(myList,9);
        System.out.println("exercitiul 3");
        mylogic.numberAndList(myList,3);
        System.out.println("exercitiul 4");
        mylogic.deLaCoadaList(myList);
        System.out.println("exercitiu 5");

        List<String> myMyList = new ArrayList<>();
        myMyList.add("Grivei");
        myMyList.add("Azorel");
        myMyList.add("Ianu");
        myMyList.add("Misu");
        myMyList.add("miau");
       mylogic.nuMaiPot(myMyList,3,"Cusu");
        System.out.println("exercitiul 6");
        mylogic.doiParametrii("Mamasita",myMyList);
        System.out.println("exercitiul 7");
        mylogic.pozitie(myMyList);
        System.out.println("exercitiul 8");
        mylogic.celMaiMareNumar(myList);

}

}
