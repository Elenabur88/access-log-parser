import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Введите первое число:");
    int number = new Scanner(System.in).nextInt();
    System.out.println("Введите второе число:");
        int numberTwo = new Scanner(System.in).nextInt();
    int firstNumber = 5;
    int secondNumber = 10;
    double quotient = (double) firstNumber/secondNumber;
    int sum = firstNumber+secondNumber;
    int difference = secondNumber-firstNumber;
    int multiplication = firstNumber*secondNumber;
    System.out.println ("Сумма двух чисел:" + sum);
System.out.println ("Разность двух чисел:" + difference);
System.out.println ("Произведение двух чисел:" + multiplication);
System.out.println("Частное двух чисел:" + quotient);
    }
}