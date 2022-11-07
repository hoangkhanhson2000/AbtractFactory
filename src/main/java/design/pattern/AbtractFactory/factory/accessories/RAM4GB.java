package design.pattern.AbtractFactory.factory.accessories;

public class RAM4GB implements RAM {
    public  RAM4GB() {
        prepareRAM();
    }

    @Override
    public void prepareRAM() {

            System.out.println("Setup RAM 4gb");

    }
}
