import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру воздуха:");
        int tempreture = sc.nextInt();
        String str1 = "На улице холодно, нужно надеть шапку";
        String str2 = "Сегодня тепло, можно идти без шапки";

        if (tempreture < 5) {
            System.out.println(str1);
        }
         else if  (tempreture > 5) {
            System.out.println(str2);
        } else System.out.println("как хочешь");


    }
}
