package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println(y);
        }else if (-3 < x) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println(y);
        }else {
            y = 420;
            System.out.println(y);
        }

    }
}


//4.Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x. Для этого числа, по формуле выше, необходимо вычислить значение y и вывести его в консоль, используя метод System.out.println().
//
//        (Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно, чтобы считать из консоли число x).
//
//        *Пояснение.
//        Формула для вычисления значения y содержит две составляющие - набор выражений для вычисления значения y и условие, при котором то или иное выражение “срабатывает”. Выполнение того или иного условия зависит от значения x. Например, если x = 100, будет использовано самое первое выражение. С помощью него, используя значение x будет вычислено значение y.
//        y = (100^2 - 10) / (100 + 7) = 93.3644859813
