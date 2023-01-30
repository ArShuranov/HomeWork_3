import java.util.Scanner;

public class ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст ребенка:");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        }
    }
}
