package design.pattern.AbtractFactory.factory.computer;

import design.pattern.AbtractFactory.factory.BaseAccessoriesFactory;

public class Laptop extends Computer {
    BaseAccessoriesFactory accessoriesFactory;

    public Laptop(BaseAccessoriesFactory accessoriesFactory) {

        this.accessoriesFactory = accessoriesFactory;
    }

    @Override
    public void addComputerAccessories() {
        System.out.println("build Accessories for Laptop");
        accessoriesFactory.createCPU();
        accessoriesFactory.createRAM();
        accessoriesFactory.createSDD();


    }
}
