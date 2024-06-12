import java.util.Scanner;
class binarydecimal{
    public static void main(String[] args) {
        System.out.println("Welcome to Electricty bill management");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of Unit Consumed");
        int a =sc.nextInt();
        System.out.println("Enetr the number of Unit Consumed");
        int b =sc.nextInt();
        double totalbill=Billconsumption(unitconsumed);
        System.out.println("Total Bill = "+totalbill);
    }
    public static double Billconsumption(int unitconsumed){
        double totalbill= 0;
        if( unitconsumed <100){
            totalbill=unitconsumed*1.5;
        }
        else if (unitconsumed >100 && unitconsumed==300){
            totalbill=100*1.5+(unitconsumed - 100) *2.5;
        }
        else {
            totalbill = 100*1.5 +200*2.5 +(unitconsumed - 300) * 3.5;
        }
        return totalbill;
    }
}