package lab4.rescue;

import javax.swing.*;

public class LogicalOp {


//exerictiul 3
    //  creati o metoda de tip int,
    //  care sa se numeasca (),
    //  si sa primeasca doua int-uri ca si parametrii.
    //  Folosind if - else,
    //  verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii,
    //  si returnati numarul mai mare.

    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else {
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
        } else {
            return "Got to try some more";
        }
    }
//Exercitiul 5
    //Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int
    //Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3,
    //returnati textul si numarul, in ordinea asta.
    //daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4
    //returnati numarul si textul, in ordinea asta

    public String equalText(String text, int x) {
        if (text.equals("FrastTrackIT") && x <= 3) {
            text.equals("FrastTrackIT");
        } else if (!text.equals("FrastTrackIT") && x >= 4) {
            return (x + "fast");
        }
        return ("Didn't meet any condition");
    }
//Exercitiul 6
    //Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    //Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul
    //Daca nu, sa printeze “The forecast snow is(cm):” si numarul.

    public String compareNumber(int x) {
        if (x > 8 || x == 6) {
            return "The amount of snow this winter was 8(cm):";
        } else {
            return "The forecast snow is(cm):" + x;
        }
    }
    //Exercitiul 7
    //Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    //Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”,
    // daca numarul este mai mic de 3 returnati “The number is lower than 3”

    public String compareNumberWithAnother(int x) {
        if (x > 3 && x == 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "The number is equal to 4";
        } else if (x < 3) {
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

    public String isEligibleToVote(int x) {
        if (x >= 18) {
            return "True";
        } else if (x < 18) {
            return "False";
        }
        return "null";
    }

    //Exercitiul 11
    //Creati o metoda care sa primeasca 3 numere
    // ca si parametrii si sa returneze cel mai mare numar.
    public int theBiggestNumber(int x, int y, int z) {
        if (x % 2 == 0) {
            return x;
        } else if (y % 2 == 0) {
            return y;
        } else if (z % 2 == 0) {
            return z;
        } else {
            return 19;
        }
    }

    //Exercitiul 9
    //Creati o metoda care sa se numeasca isNumberEven.
    //Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals
    //Daca numarul e par sa returneze true iar daca e impar sa returnese false
    public String isNumberEven(int x) {
        if (x % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }
    //Exercitiul 8
    //Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit
    //Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
    //unde x trebuie sa reprezinte numarul apasat.
    //Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
    // ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.

    //public void switchMethod(int number) {
    //     switch (number) {
    //        case 1:
    //             System.out.println("The number is: " + number + "!");
    //            break;
    //        case 2:
    //            System.out.println("The number is: " + number + "!");
    //           break;
    //       default:
    //       System.out.println("The number is: " + number);
    //   }
    //  }

    // int number= 10;
    //  int x = 9;

    //public void printBackwards( int number,int x) {
    // for (int i = number; i >= x; i--) {
    //     System.out.println(i);

    // }


    //  }


    //  1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    //  Metoda sa verifice numrul primit,
    //  si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    //  Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void printNumbersTo100(int x, int number) {
        for (int i = number; i <= x; i++) {
            System.out.println(i);
        }

    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void printNumbers(int y, int number) {
        for (int i = number; i >= y; i--) {
            System.out.println(i);
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void printToNumber(int z, int t) {
        for (int i = z; i <= t; i++) {
            System.out.println(i);
        }
        for (int i = t; i <= z; i++) {
            System.out.println(i);
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).

    public void printSmallToBig(int q, int w) {
        for (int i = q; i < w; i++) {
            System.out.println(i);
        }
        for (int i = w; i < q; i++) {
            System.out.println(i);

        }

    }
//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void printEvenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Numarul: " + i + " este par.");
            }
        }
    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void printOddNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Numarul:" + i + "este impar");
            }
        }
    }

    // 7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int sumaTotala() {
        int suma = 0;
        for (int i = 0; i <= 100; i++) {
            suma = suma + i;
        }
        return suma;

    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
    // La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int sumaEvenNumber() {
        int suma1 = 0;
        int numar = 60;

        if (numar % 2 == 0) {
            for (int i = numar; i <= 100; i++) {
                suma1 = suma1 + i;

            }

        }
        return suma1;
    }

    //Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //*******
    //******
    //*****
    //****
    //***
    //**
    //*
    public static void printStars() {
        for (int i = 7; i > 0; i--) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    public void printCount(int i) {
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 100);

    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
// pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void printCountDown(int f) {
        do {
            System.out.println(f);
            f--;
        }
        while (f >= -100);
    }

    //Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void printBig(int s, int p) {
        do {
            System.out.println(s);
            s++;
        }
        while (s < p);
        do {
            System.out.println(p);
            p++;
        }
        while (p < s);
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void printSmall(int h, int l) {
        do {
            System.out.println(h);
            h++;
        } while (h < l);
        do {
            System.out.println(l);
            l++;
        } while (l < h);
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void printPNumbers() {
        int i = 0;
        do {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } while (i <= 100);
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void printINumbers() {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        } while (i <= 100);

    }

    //7.Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala,
    // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda,
    // pentru a numara toate numerele din interval.
    public void printSum() {
        int sum = 0;
        int x = 111;
        int count = 0;
        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum / count);

    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar,
    // si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void printDividedNumbers(int o, int l) {
        int sum = o + l;
        int media = sum / 2;
        do {
            System.out.println(media);

        }
        while (media / 7 == 0);
    }

    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    public void printFibbonacci() {
        int i = 1, f = 0, e = 1;

        while (i <= 20) {
            System.out.println(f);
            int sum = f + e;
            f = e;
            e = sum;
            i++;
        }
    }

    //10. Creati o metoda numita CozaLozaWoza.
    public void printCozaLozaWoza() {
        int n = 1;
        do {

            //se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
            if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
                System.out.print(" " + "CozaLozaWoza" + ", ");
            }
            //se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
            else if (n % 3 == 0 && n % 5 == 0) {
                System.out.print(" " + "CozaLoza" + " ,");
            }
            //se va afisa WozaLoza pentru multiplu de 5 SI 7
            else if (n % 5 == 0 && n % 7 == 0) {
                System.out.print(" " + "wozaLoza" + ", ");
            }
            //se va afisa CozaWoza pentru multiplu de 3 SI 7
            else if (n % 3 == 0 && n % 7 == 0) {
                System.out.print(" " + "cozaWoza" + ", ");
            }
            //se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
            else if (n % 3 == 0) {
                System.out.print(" " + "coza" + " ,");
            }
            //se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
            else if (n % 5 == 0) {
                System.out.print(" " + "loza" + ", ");
            }
            //se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
            else if (n % 7 == 0) {
                System.out.print(" " + "woza" + ", ");
            } else {
                System.out.print(" " + n + " ,");
            }
            n++;
        } while (n <= 110);
    }
}






