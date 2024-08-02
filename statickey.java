class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand +" : "+ price +" : "+ name);
    }
}
public class statickey {
    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price=1500;
        Mobile.name ="Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price=1700;
        Mobile.name="Phone";

        obj1.show();
        obj2.show();
    }
}
