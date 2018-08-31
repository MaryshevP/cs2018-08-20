package by.it.pmaryshev.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int rez;
        switch (month) {
            case 1:
                rez = day;
                System.out.println(rez);
                break;
            case 2:
                rez = 31 + day;
                System.out.println(rez);
                break;
            case 3:
                rez = 31 + 28 + day;
                System.out.println(rez);
                break;
            case 4:
                rez = 31 + 28 + 31 + day;
                System.out.println(rez);
                break;
            case 5:
                rez = 31 + 28 + 31 + 30 + day;
                System.out.println(rez);
                break;
            case 6:
                rez = 31 + 28 + 31 + 30 + 31 + day;
                System.out.println(rez);
                break;
            case 7:
                rez = 31 + 28 + 31 + 30 + 31 + 30 + day;
                System.out.println(rez);
                break;
            case 8:
                rez = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
                System.out.println(rez);
                break;
            case 9:
                rez = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
                System.out.println(rez);
                break;
            case 10:
                rez = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
                System.out.println(rez);
                break;
            case 11:
                rez = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
                System.out.println(rez);
                break;
            case 12:
                rez = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + day - 1;
                System.out.println(rez);
                break;
        }
    }
}

