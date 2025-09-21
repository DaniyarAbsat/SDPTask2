package factoryMethod;

// Client
public class MainFactory {
    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();

        Laptop gaming = factory.createLaptop("gaming");
        gaming.assemble();

        Laptop office = factory.createLaptop("office");
        office.assemble();
    }
}
