import java.util.Scanner;

public class IvanovJava3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 2.2.");
        System.out.println("Введите строку №1");
        String a = scan.nextLine();
        System.out.println("Введите строку №2");
        String b = scan.nextLine();
        if (a.equals(b)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
