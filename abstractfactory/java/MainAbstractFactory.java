package abstractfactory.java;

public class MainAbstractFactory {
    public static void main(String[] args) {
        ComputerFactory gamingFactory = new GamingComputerFactory();
        Laptop gamingLaptop = gamingFactory.createLaptop();
        Accessory gamingMouse = gamingFactory.createAccessory();

        gamingLaptop.assemble();
        gamingMouse.use();

        ComputerFactory officeFactory = new OfficeComputerFactory();
        Laptop officeLaptop = officeFactory.createLaptop();
        Accessory officeHeadset = officeFactory.createAccessory();

        officeLaptop.assemble();
        officeHeadset.use();
    }
}
