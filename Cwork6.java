import java.util.*;

public class Cwork6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }

        int y = input.nextInt();
        boolean found = false;

        for (int i = 0; i < x; i++) {
            if (arr[i] == y) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + y + " has been found");
        } else {
            System.out.println("Element " + y + " has not been found");
        }

        input.close();
    }
}
