import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость автомобиля:");
        int speed = sc.nextInt();
        String str1 = "Если скорость " + speed + ", то придется заплатить штраф";
        String str2 = "Если скорость " + speed + ", то можно ездить спокойно";

        if (speed > 60) {
            System.out.println(str1);
        } else System.out.println(str2);

    }
}
