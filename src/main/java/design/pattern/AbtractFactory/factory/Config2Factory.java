package design.pattern.AbtractFactory.factory;

import design.pattern.AbtractFactory.factory.computer.Computer;
import design.pattern.AbtractFactory.factory.computer.Laptop;
import design.pattern.AbtractFactory.factory.computer.PC;

public class Config2Factory extends BaseComputerFactory {

    @Override
    public Computer createComputer(String type) {
        Computer computer;
        BaseAccessoriesFactory accessoriesFactory = new Config2AccessoriesFactory();
        switch (type.toLowerCase()) {
            case "laptop":
                computer = new Laptop(accessoriesFactory);
                break;
            case "pc":
                computer = new PC(accessoriesFactory);
                break;

            default:
                throw new IllegalArgumentException("No such computer.");
        }

        computer.addComputerAccessories();
        computer.buildComputer();
        return computer;
    }


}
