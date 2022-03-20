package cw1;

public class Zad4 {

    /*Utwórz program, który drukuje „Hello World!” 10 razy. Użyj pętli while, do-while i for.*/

    public static void main(String[] args) {

        int counter =0;
        while(counter < 10)
        {
            System.out.println("Hello world");
            counter++;
        }
        System.out.println();
        counter = 0;
        do {
            System.out.println("Hello world");
            counter++;
        }while (counter < 10);

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
    }



}
