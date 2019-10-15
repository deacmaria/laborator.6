package lab3;

public class main {
    public static void main(String[] args) {

        int x= 7;
        int y= 10;
        int z= 11;
        int t= 7;
        int number=6;

        System.out.println("Exercitiul 1: ");
        Calculator myCalc = new Calculator();
        System.out.println("Suma din calculator este : " + myCalc.sum(1,7));

        System.out.println("Exercitiul 2");
        System.out.println("Rezultatul scaderii este: " + myCalc.substract(x,y));

        System.out.println("Exercitiul 3");
        System.out.println("Rezultatul scaderii este: " +myCalc.divided(x ,y));

        System.out.println("Exercitiul 4");
        System.out.println("Rezultatul inmultirii este:"+ myCalc.multiply(x,y));

        System.out.println("Exercitiul 5");
        System.out.println("Rezultatul mediei aritmetice este:"+myCalc.media(x,y,z));

        System.out.println("Exercitiul 6");
        System.out.println("Restul impartirii a doua numere este:" + myCalc.rest(x,y));

        System.out.println("Exercitiul 7");
        System.out.println("Distanta in metrii este:"+ myCalc.inchToMeters(y));




        LogicalOp op = new LogicalOp();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Exercitiul 3");
        System.out.println("Cel mai mare numar este:");
        System.out.println(op.checkBiggerNumber(x,y));
        System.out.println();
        System.out.println("Exercitiul 4");
        System.out.println(op.comparisonText("FastTrack"));
        System.out.println();
        System.out.println("Exercitiul 5");
        System.out.println(op.equalText("fast",x));
        System.out.println();
        System.out.println("Exercitiul 6");
        System.out.println(op.compareNumber(x));
        System.out.println();
        System.out.println("Exercitiul 7");
        System.out.println(op.compareNumberWithAnother(x));
        System.out.println();
        System.out.println("Exercitiul 10");
        System.out.println(op.isEligibleToVote(x));
        System.out.println();
        System.out.println("Exercitiul 11");
        System.out.println(op.theBiggestNumber(x,y,z));
        System.out.println();
        System.out.println("Exercitiul 9");
        System.out.println(op.isNumberEven(x));
        System.out.println();
        System.out.println("Exercitiul 8");
        op.switchMethod(5);












   }

}