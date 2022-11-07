package design.pattern.AbtractFactory.factory.accessories;

public class SSD256GB implements SSD{

    public  SSD256GB() {

        prepareSSD();
    }

    @Override
    public void prepareSSD() {
        System.out.println("Setup SDD 256gb");
    }
}
