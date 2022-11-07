package design.pattern.AbtractFactory.factory;

import design.pattern.AbtractFactory.factory.accessories.CPU;
import design.pattern.AbtractFactory.factory.accessories.RAM;
import design.pattern.AbtractFactory.factory.accessories.SSD;

public abstract class BaseAccessoriesFactory {
    public abstract SSD createSDD();
    public abstract RAM createRAM();
    public abstract CPU createCPU();

}
