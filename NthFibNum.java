import java.util.Scanner;

public class NthFibNum {

    public static void getNthEvenFibNum(int n){
        int first = 0;
        int second = 1;
        int next;
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            next = first + second;
            first = second;
            second = next;
            if (first % 2 == 0) {
                count++;
                if (count == n) {
                    System.out.println(count + "'th even fibonacci number is: " + first);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth value to get fibonacci number: ");
        int n = sc.nextInt();

        getNthEvenFibNum(n);
    }
}
