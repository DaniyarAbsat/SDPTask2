package factoryMethod;

public class OfficeLaptop implements Laptop {
    @Override
    public void assemble() {
        System.out.println("Assembling Office Laptop with Integrated GPU, i5 CPU, 16GB RAM");
    }
}
