class Base10 {
    int x = 45;
}

class Derived extends Base10 {
    int x = 67;

    void show() {
        System.out.println("Value using this: " + this.x);
        System.out.println("Value using super: " + super.x);
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.show();
    }
}
