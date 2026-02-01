//8. WAP to check whether Array contain duplicate or not . 
import java.util.Scanner;

class DuplicateArray8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] == a[j]) {
                    found = true;
                }
            }
        }

        if (found)
            System.out.println("Duplicate present");
        else
            System.out.println("No duplicate");
    }
}
