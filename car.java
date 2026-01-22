public class car {

    int modelyear;
    int mileage;

    public static void main(String[] args) {
        car c1 = new car();
        c1.modelyear = 2012;
        c1.mileage = 19;

        car c2 = new car();
        c2.modelyear = 2008;
        c2.mileage = 20;

        System.out.println("Car 1 Model Year: " + c1.modelyear + ", Mileage: " + c1.mileage + " km/l");
        System.out.println("Car 2 Model Year: " + c2.modelyear + ", Mileage: " + c2.mileage + " km/l");
    }
}
