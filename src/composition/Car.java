package composition;

public class Car {
	Engine obj;
    void carInfo()
    {
       obj = new Engine();
       obj.engineInfo();
       System.out.println("Car info");
    }
}
