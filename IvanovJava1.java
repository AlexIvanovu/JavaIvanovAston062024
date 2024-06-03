import java.util.Scanner;

public class IvanovJava1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 2.1.1.");
        System.out.println("Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:");
        System.out.println("сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: a > b, a < b или a = b");
        System.out.println("Введите число a");
        double a = scan.nextDouble();
        System.out.println("Введите число b");
        double b = scan.nextDouble();
        if (a>b) {
            System.out.println(a + " > " + b);
        } else if (a<b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }
}
