package factoryMethod;

// Concrete Products
public class GamingLaptop implements Laptop {
    @Override
    public void assemble() {
        System.out.println("Assembling Gaming Laptop with RTX GPU, i9 CPU, 32GB RAM");
    }
}
