package abstractfactory.java;

interface ComputerFactory {
    Laptop createLaptop();

    Accessory createAccessory();
}
