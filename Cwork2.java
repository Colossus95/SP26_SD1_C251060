import java.util.*;

public class Cwork2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int largest_number = arr[0];   // FIX

        for (int i = 1; i < x; i++) {
            if (arr[i] > largest_number) {
                largest_number = arr[i];
            }
        }

        System.out.println("Largest Number : " + largest_number);

        input.close();
    }
}
