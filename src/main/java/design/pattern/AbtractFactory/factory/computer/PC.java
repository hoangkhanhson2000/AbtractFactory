package design.pattern.AbtractFactory.factory.computer;

import design.pattern.AbtractFactory.factory.BaseAccessoriesFactory;

public class PC implements Computer {
    BaseAccessoriesFactory accessoriesFactory;

    public PC(BaseAccessoriesFactory accessoriesFactory) {

        this.accessoriesFactory = accessoriesFactory;
    }

    @Override
    public void addComputerAccessories() {
        System.out.println("build Accessories for Personal Computer");
        accessoriesFactory.createCPU();
        accessoriesFactory.createRAM();
        accessoriesFactory.createSDD();

    }
}
