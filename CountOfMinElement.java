import java.util.Scanner;

public class CountOfMinElement {

    public static void printArray(int size, int[] array) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    public static void getMinimumCount(int size, int[] array) {
        int min = array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                count++;
            }
        }
        System.out.println(min + " appear " + count + " times");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        printArray(size, array);
        getMinimumCount(size, array);
    }
}
