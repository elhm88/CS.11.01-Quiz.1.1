import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your first name: ");
        firstName = scanner.next();
        scanner.nextLine();

        System.out.println("Enter your favourite food: ");
        favouriteFood = scanner.nextLine();

        System.out.println("\nFirst name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);


    }

}