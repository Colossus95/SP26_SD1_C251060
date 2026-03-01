import java.util.*;

public class Cwork1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int x = input.nextInt();

        int[] arr = new int[x];

        System.out.println("Enter array elements:");

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array elements are:");

        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }

        input.close(); 
    }
}
