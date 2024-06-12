import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += Character.getNumericValue(a.charAt(i));
            System.out.println(sum);
        }
    }
}
