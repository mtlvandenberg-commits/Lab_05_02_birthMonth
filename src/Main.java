
import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    int birthMonth = 0;
    String trash = "";

    System.out.print("Enter your birth month (1-12): ");

    if  (in.hasNextInt()) {
        birthMonth = in.nextInt();
        in.nextLine();
        if (birthMonth >0 && birthMonth< 12) {
            System.out.println("Your birth month is " + birthMonth);
        }else {
            trash =in.nextLine();
            System.out.println("You entered an incorrect month value " + trash);
            System.out.println("Run the program again and enter a valid month (1 - 12)");
        }
    }else {
        trash =in.nextLine();
        System.out.println("You entered an incorrect month value " + trash);
        System.out.println("Run the program again and enter a valid month (1 - 12)");

    }
}
