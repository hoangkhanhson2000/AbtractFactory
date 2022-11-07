package design.pattern.AbtractFactory.factory;

import design.pattern.AbtractFactory.factory.accessories.*;

public class Config1AccessoriesFactory extends BaseAccessoriesFactory {
    @Override
    public SSD createSDD() {
        return new SSD256GB();
    }

    @Override
    public RAM createRAM() {
        return new RAM4GB();
    }

    @Override
    public CPU createCPU() {
        return new CPUi5();
    }
}
