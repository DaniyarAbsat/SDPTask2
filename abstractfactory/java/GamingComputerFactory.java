package abstractfactory.java;
class GamingComputerFactory implements ComputerFactory {
    @Override
    public Laptop createLaptop() {
        return new GamingLaptop();
    }

    @Override
    public Accessory createAccessory() {
        return new GamingMouse();
    }
}
