import java.util.Scanner;

public class ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите три числа, через \"enter\"");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else System.out.println(three);
    }

}

