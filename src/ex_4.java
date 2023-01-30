import java.util.Scanner;

public class ex_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст человека:");
        int age = sc.nextInt();

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");


        }
    }
}
