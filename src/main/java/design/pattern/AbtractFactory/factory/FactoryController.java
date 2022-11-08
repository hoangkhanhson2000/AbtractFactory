package design.pattern.AbtractFactory.factory;


import design.pattern.AbtractFactory.factory.computer.Computer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {

    @GetMapping("/computer/{computer-type}")
    public String getComputerConfig1(@PathVariable("computer-type") String computer) throws Exception {
        BaseComputerFactory computerFactory1 = new Config2Factory();
        BaseComputerFactory computerFactory = new Config1Factory();

        Computer cp1 = computerFactory1.createComputer(computer);
        Computer cp = computerFactory.createComputer(computer);

        return computer;

    }


}
