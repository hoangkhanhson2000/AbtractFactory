package design.pattern.AbtractFactory.factory.accessories;

public class CPUi5 implements CPU{

    public  CPUi5() {
        prepareCPU();

    }

    @Override
    public void prepareCPU() {
        System.out.println("Setup CPUi5");
    }
}
