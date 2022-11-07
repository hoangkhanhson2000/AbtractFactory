package design.pattern.AbtractFactory.factory.accessories;

public class CPUi7 implements CPU{

    public  CPUi7() {

        prepareCPU();

    }

    @Override
    public void prepareCPU() {
        System.out.println("Setup CPUi7");
    }
}
