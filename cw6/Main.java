package cw6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        List<Function> functions = new ArrayList<>();
        functions.add(new LinearFunction(2, 4));
        functions.add(new SquareFunction(2, 0, -2.5));
        functions.add(new AbsoluteLinearFunction(2, 4));
        List<Fun> funList = new ArrayList<>(functions);
        System.out.println("Original functions");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f, -4, 0, 0.1))));
        functions.forEach(f -> f.increaseCoefficientsBy(1.2));
        System.out.println("Functions increased by 1.2");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f, -4, 0, 0.1))));
        functions.forEach(f -> f.decreaseCoefficientsBy(1.2));
        System.out.println("Functions decreased by 1.2");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f, -4, 0, 0.1))));

        /**
         * Możemy wykorzystać interfejs Fun dla obliczenia minimum dowolnej funkcji która zależy od x bez tworzenia klasy opakowywujacej tą funkcję.
         * Pierwszym argumentem przyjmowanym przez statyczną metodę Fun.minimum jest obiekt typu Fun.
         * Interfejs Fun posiada tylko jedną metodę do zaimplementowania, zatem jest interfejsem funkcyjnym.
         * Metoda ta przyjmuje argument x i zwraca wartość według określonego wzoru funkcji.
         * Możemy więc zapisać wyrażenie lambda, które jako argument przyjmuje x i zwraca wartość według wzoru.
         * Wywołanie metody f(x) z interfejsu Fun to wykonanie przekazanego wyrażenia lambda które zwraca określoną wartość.
         */
        System.out.println(df.format(Fun.minimum(x -> 2 * x * x * x - 40 * x, -4, 0, 0.1)));
    }
}
