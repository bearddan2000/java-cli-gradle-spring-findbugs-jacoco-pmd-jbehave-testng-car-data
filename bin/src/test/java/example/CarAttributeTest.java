package example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.testng.Assert;

public class CarAttributeTest {

  example.service.CarService service;

  example.model.Car car;

  @When("Car created")
  public void createCar() {
     service = new example.service.CarServiceImpl();
     car = service.createCar();
  }

  @Then("Car price should be 0.0")
  public void checkPrice() {
    createCar();
     Assert.assertEquals(car.getPrice(), 0.0);
  }

  @Then("Car model should be test")
  public void checkModel() {
    createCar();
     Assert.assertEquals(car.getModel(), "test");
  }

  @Then("Car year should be 0")
  public void checkYear() {
    createCar();
     Assert.assertEquals(car.getYear(), 0);
  }

  @Then("Car make should be test")
  public void checkMake() {
    createCar();
    Assert.assertEquals(car.getMake(), "test");
  }

}
