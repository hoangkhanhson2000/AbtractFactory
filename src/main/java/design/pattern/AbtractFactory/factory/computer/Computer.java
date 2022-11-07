package design.pattern.AbtractFactory.factory.computer;

    public interface Computer {
   void addComputerAccessories();

   default void buildComputer() {

        System.out.println("computer is built.");

    }


}