package day1;

public class Task6 {
    public static void main(String[] args) {
        int i = 1;
        int k = 3;
        while (i <= 9) {
            System.out.println(i + " x " + k + " = " + (i * k));
            i++;
        }
    }
}


//6. Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while), выведите в консоль таблицу умножения для этой цифры в следующем формате:
//        1 x k = …
//        2 x k = …
//        3 x k = …
//        ……
//        9 x k = …
//
//
//        Пример:
//        k = 3
//
//        Вывод в консоль:
//        1 x 3 = 3
//        2 x 3 = 6
//        3 x 3 = 9
//        ……
//        9 x 3 = 27
