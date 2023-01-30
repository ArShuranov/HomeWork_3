import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        String str = "Если возраст человека равен ";
        String str1 = ", то он совершеннолетний";
        String str2 = ", то он не достиг совершеннолетия, нужно немного подождать";

        if (age >= 18) {
            System.out.println(str + age + str1);
        } else {
            System.out.println(str + age + str2);
        }


    }

}
