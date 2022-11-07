package design.pattern.AbtractFactory.factory.accessories;

public class RAM8GB implements RAM {

    public  RAM8GB() {
        prepareRAM();
    }

    @Override
    public void prepareRAM() {
        System.out.println("Setup RAM 8gb");

    }
}
