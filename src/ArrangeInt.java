import java.util.Scanner;

public class ArrangeInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Enter number 1: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter number 3: ");
        num3 = scanner.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers( double num1, double num2, double num3){
        double temp;
        if(num1 > num2 ) {
            temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if (num1 > num3){
            temp = num3;
            num3 = num1;
            num1 = temp;
        }
        if (num2 > num3){
            temp = num3;
            num3 = num2;
            num2 = temp;
        }

        System.out.printf("Numbers after sorted: %f\t%f\t%f", num1, num2, num3);
    }
}
