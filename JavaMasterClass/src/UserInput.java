import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int age,year;

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        name = sc.nextLine();

        System.out.println("Enter Your Year of Birth: ");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            year = sc.nextInt();

            age = 2022 - year;

            if (age >= 0 && age <= 100) {
                System.out.println("Your Name is " + name + " And you are " + age + " Years Old");
            } else {
                System.out.println("Invalid Age"+ age);
            }
        }
        else{
            System.out.println("Error!! Unable to Parse Integer");
        }
    }
}