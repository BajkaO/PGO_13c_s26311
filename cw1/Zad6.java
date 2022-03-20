package cw1;

/*
Utwórz tablicę arr z 10 losowo generowanych liczb całkowitych od 100 do 1000.
Napisz metodę, która przyjmuje arr jako parametr i zwraca posortowaną tablicę liczb od
najmniejszej do największej.
Napisz metodę, która drukuje tablicę.
Dane wyjściowe powinny wyglądać następująco:
Generated array: [500, 100, 400, 200, 300, 550, 350, 150, 450, 250]
Sorted array: [100, 150, 200, 250, 300, 350, 400, 450, 500, 550]
*/

public class Zad6 {

    private int[] tablica = new int[10];
    int max = 1000;
    int min = 100;
    int range = max - min + 1;


    public static void main(String[] args) {
        Zad6 Tab1 = new Zad6();
        Tab1.losoweLiczbyTab();
        System.out.print("Generated array: ");
        Tab1.printArray();

        System.out.print("Sorted array:    ");
        Tab1.sortujTab();
        Tab1.printArray();
    }



    public void losoweLiczbyTab(){

        for(int i = 0; i < tablica.length; i++){
            tablica[i] = (int)(Math.random()*range)+min;
        }
    }
    public void printArray(){
        for(int i = 0; i < tablica.length; i++){
            System.out.print("| " + tablica[i] + " ");
        }
        System.out.println("|");}
    public void zamiana(int a, int b){
        int temp = tablica[a];
        tablica[a] = tablica[b];
        tablica[b] = temp;}


    public void sortujTab(){
        for (int i = 0; i< tablica.length; i++){
            int min = i;
            for (int j = i; j < tablica.length; j++){
                if (tablica[min]> tablica[j]){
                    min = j;
                }
            }
            zamiana(i,min);
        }
    }



}
