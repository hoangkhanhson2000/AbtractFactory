package design.pattern.AbtractFactory;

import design.pattern.AbtractFactory.factory.BaseComputerFactory;
import design.pattern.AbtractFactory.factory.Config1Factory;
import design.pattern.AbtractFactory.factory.Config2Factory;
import design.pattern.AbtractFactory.factory.computer.Computer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class AbtractFactoryApplication {

    public static void main(String[] args) {

        SpringApplication.run(AbtractFactoryApplication.class, args);
        BaseComputerFactory computerFactory = new Config1Factory();
        BaseComputerFactory computerFactory1 = new Config2Factory();

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
//        Computer laptop = computerFactory.createComputer("laptop");
//        System.out.println("_______________________________________");
//        Computer pc = computerFactory1.createComputer("pc");
//        System.out.println("_______________________________________");

        String type = "";


        System.out.println("Please choose Configuration:");
        System.out.println("input 1 to Build RAM 8gb SSD 512gb CPU i7");
        System.out.println("input 2 to Build RAM 4gb SSD 256gb CPU i5");

        String a = "";
        try {
            a = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        switch (a) {
            case "1" -> {
                System.out.println("Please Enter Your Type:(laptop/pc)");
                try {
                    type = dataIn.readLine();
                } catch (IOException e) {
                    System.out.println("Error!");
                }
                Computer cp = computerFactory1.createComputer(type);
            }
            case "2" -> {
                System.out.println("Please Enter Your Type:(laptop/pc)");
                try {
                    type = dataIn.readLine();
                } catch (IOException e) {
                    System.out.println("Error!");
                }
                Computer cp1 = computerFactory.createComputer(type);
            }
            default -> throw new IllegalArgumentException("No selection.");
        }
    }

}
