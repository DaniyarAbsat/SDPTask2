package factoryMethod;

// Factory
public class LaptopFactory {
    public Laptop createLaptop(String type) {
        if (type.equalsIgnoreCase("gaming")) {
            return new GamingLaptop();
        } else if (type.equalsIgnoreCase("office")) {
            return new OfficeLaptop();
        }
        throw new IllegalArgumentException("Unknown laptop type: " + type);
    }
}
