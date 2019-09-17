public class Main {

    public static void main(String[] args) {
        // Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        String salut = "Hello";
        String nume = "Carmen";
        System.out.println(salut);
        System.out.println(nume);

        // 2. Printati rezultatul sumei a doua numere(orice numere).
        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula
        int a = 40;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a / b );

        //4.Printati rezultatul urmatoarelor operatiuni:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        int c = -5;
        int d = 8;
        int e = 6;
        int f =55;
        int g =9;
        int h =-3;
        int i = 5;
        int j =20;
        int k =15;
        int l =3;
        int m =2;
        System.out.println( c + d * e);
        System.out.println((f +g) % g );
        System.out.println( j + h * i / d);
        System.out.println( i + k / l * m - d % l);

    };}