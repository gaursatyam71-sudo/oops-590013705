//5. Declare the variable above the main method and access it inside main by creating an object of the class.
class AccessVariable5 {

    
    int number = 65;

    public static void main(String[] args) {

        AccessVariable5 myObject = new AccessVariable5();

        System.out.println("The value of number is: " + myObject.number);
    }
}
