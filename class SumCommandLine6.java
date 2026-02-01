//6. WAP to calculate sum of elements in an array using command line arguments
class SumCommandLine6 {

    public static void main(String[] args) {

        int sum = 0;

        // Convert each command-line argument to integer and add
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        // Print the result
        System.out.println("Sum of array elements = " + sum);
    }
}
