package design.pattern.AbtractFactory.factory;

import design.pattern.AbtractFactory.factory.accessories.*;

public class Config2AccessoriesFactory extends BaseAccessoriesFactory {
    @Override
    public SSD createSDD() {
        return new SSD512GB();
    }

    @Override
    public RAM createRAM() {
        return new RAM8GB();
    }

    @Override
    public CPU createCPU() {
        return new CPUi7();
    }
}
