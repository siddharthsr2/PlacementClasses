//Write a code in javato count the digit of of number given by the user
import java.util.Scanner;
class count_number {
    public static void main(String[] args) {
        System.out.print("Eneter a number");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int digitCount=a.length();
        System.out.println(digitCount);
    }
}
