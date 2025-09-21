package abstractfactory.java;

class OfficeComputerFactory implements ComputerFactory {
    @Override
    public Laptop createLaptop() {
        return new OfficeLaptop();
    }

    @Override
    public Accessory createAccessory() {
        return new OfficeHeadset();
    }
}
