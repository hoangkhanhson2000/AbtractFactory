package design.pattern.AbtractFactory.factory;

import design.pattern.AbtractFactory.factory.computer.Computer;

public abstract class BaseComputerFactory {

    public abstract Computer createComputer(String type);
  


}
