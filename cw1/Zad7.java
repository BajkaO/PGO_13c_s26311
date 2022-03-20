package cw1;


/*Odczytaj liczbę od użytkownika i zapisz ją w zmiennej o nazwie n.
N powinno być co najmniej 5 i liczbą nieparzystą. Jeśli użytkownik wprowadzi błędnie,
poproś, aby spróbował ponownie, aż warunek zostanie spełniony.
Wydrukuj rysunek używając znaku * o rozmiarze n. Na przykład, jeśli n wynosi 5:
*****
** *
* * *
* **
*****
*/


import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {

        boolean sprawdz = false;
        do
    {
        int skanLiczba;
        System.out.print("Wprowadź liczbę nieparzystą, większą bądź równą 5: ");
        Scanner scan = new Scanner(System.in);
        skanLiczba = scan.nextInt();

        if (skanLiczba % 2 == 0 || skanLiczba < 5) {
            System.out.println("Liczba niespełnia wymagań, wprowadź ponownie.");
        } else {
            sprawdz = true;
            System.out.println("Twoja liczba spełnia wymagania, gratulacje!");
            for (int i = 0; i < skanLiczba; i++) {
                for (int j = 0; j < skanLiczba; j++) {
                    if (i == j || i == 0 || j == 0 || i == skanLiczba - 1 || j == skanLiczba - 1) {
                        System.out.print("* ");
                    } else System.out.print("  ");
                }
                System.out.println();
            }
        }

    } while(sprawdz=false);

}

}
