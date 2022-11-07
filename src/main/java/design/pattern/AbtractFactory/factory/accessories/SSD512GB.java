package design.pattern.AbtractFactory.factory.accessories;

public class SSD512GB implements SSD{

    public  SSD512GB() {
        prepareSSD();

    }

    @Override
    public void prepareSSD() {
        System.out.println("Setup SDD 512gb");
    }
}
