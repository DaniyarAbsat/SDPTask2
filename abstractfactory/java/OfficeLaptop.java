package abstractfactory.java;
class OfficeLaptop implements Laptop {
    @Override
    public void assemble() {
        System.out.println("Office Laptop: i5 CPU, Integrated GPU, 16GB RAM");
    }
}
