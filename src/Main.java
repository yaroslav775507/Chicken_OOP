import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Chicken chicken = new Chicken(in.nextLine(),Integer.parseInt(in.nextLine()));
            if (chicken.getAge() <= 12){
                int egg = (int) chicken.productPerDay();
                System.out.println("Chicken " + chicken.getName() + " (age " + chicken.getAge() + ") can produce " + egg + " eggs per day.");
            }
            else {
                System.out.println("Chicken " + chicken.getName() +
                        " (age " + chicken.getAge() + ") can produce " +
                        chicken.productPerDay() + " eggs per day.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}