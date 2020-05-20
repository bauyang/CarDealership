package CarDealership;

public class Car extends Vehicle {
    
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color){
        super (VIN, wholesaleCost, retailPrice, modelYear,make, model,color);
    }

    @Override
    public double getTargetMargin() {
        return super.getTargetMargin()-1000;
        //use the getTargetMargin method as its define in our superclass (vehicle)
    }
}