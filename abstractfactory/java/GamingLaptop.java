package abstractfactory.java;

class GamingLaptop implements Laptop {
    @Override
    public void assemble() {
        System.out.println("Gaming Laptop: i9 CPU, RTX GPU, 32GB RAM");
    }
}
