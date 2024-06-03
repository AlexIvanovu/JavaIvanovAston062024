import java.util.Scanner;

public class IvanovJava2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 2.1.2.");
        System.out.println("Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:");
        System.out.println("совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль");
        System.out.println("Введите число a");
        double a = scan.nextDouble();
        System.out.println("Введите число b");
        double b = scan.nextDouble();
        double c = a + b;
        System.out.println("Результат сложения чисел " + " a " + " и " + " b " + " (a+b)");
        System.out.println(c);
        double d = a - b;
        System.out.println("Результат вычитания чисел " + " a " + " и " + " b " + " (a-b)");
        System.out.println(d);
        double e =  a / b;
        System.out.println("Результат деления чисел " + " a " + " и " + " b " + " (a/b)");
        System.out.println(e);
        double f = a * b;
        System.out.println("Результат умножения чисел " + " a " + " и " + " b " + " (a*b)");
        System.out.println(f);
    }
}
