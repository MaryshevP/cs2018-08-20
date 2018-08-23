package by.it.pmaryshev.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter variable a:");
        int a = sc.nextInt();
        System.out.println("Enter variable b:");
        int b = sc.nextInt();

        int Sum = a + b;

        System.out.println("DEC:"+ a + "+" + b + "=" + Sum);

        String bin_a = Integer.toBinaryString(a);
        String bin_b = Integer.toBinaryString(b);
        String bin_Sum = Integer.toBinaryString(a+b);
        System.out.println("BIN:"+ bin_a + "+" + bin_b + "=" + bin_Sum);

        String hex_a = Integer.toHexString(a);
        String hex_b = Integer.toHexString(b);
        String hex_Sum = Integer.toHexString(a+b);
        System.out.println("HEX:"+ hex_a + "+" + hex_b + "=" + hex_Sum);

        String octal_a = Integer.toOctalString(a);
        String octal_b = Integer.toOctalString(b);
        String octal_Sum = Integer.toOctalString(a+b);
        System.out.println("OCT:"+ octal_a + "+" + octal_b + "=" + octal_Sum );

    }


}
