import java.util.Scanner;

public class SwappingWithoutThirdVariable {

    public static void swapNumbers(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping: \n num1: " + num1 + "\n num2: " + num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Before swapping: \n num1: " + num1 + "\n num2: " + num2);

        swapNumbers(num1, num2);

    }
}
