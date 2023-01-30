import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество людей в поезде:");
        int count = sc.nextInt();

        if (count < 60) {
            System.out.println("В вагоне " + (60 - count) + " свободных сидячих мест и " + 42 + " свободных стоячих мест");
        } else if (count >= 60 && count < 102) {
            System.out.println("В вагоне 0 сидячих мест и " + (102 - count) + ", свободных стоячих мест");
        } else {
            System.out.println("Свободных мест нет!");
        }
    }
}

