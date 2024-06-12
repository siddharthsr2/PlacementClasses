//write a java program to determine the type of triangle based on length of its sides
//equilateral - if all side are same
//isosceles - two sides are same
//scalene - all three sides are different
//not a triangle - they give side do not satisfy triangle theorem

import java.util.Scanner;
public class TriangleProperty {
    public static void main(String[] args) {
        System.out.println("Find triangle properties");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the side A");
        int a = sc.nextInt();

        System.out.println("Enetr the side B");
        int b = sc.nextInt();

        System.out.println("Enetr the sideC");
        int c = sc.nextInt();

        if (a==b && b==c && c==a){
            System.out.println("The triangle is Equilateral");
        }
        else if (a==b || b==c || c==a){
            System.out.println("The triangle is Isosceles");
        }
        else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Not a triangle");
        }
        else{
            System.out.println("The triangle is Scalene");
        }

    }
}
