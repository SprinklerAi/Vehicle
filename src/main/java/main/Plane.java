package main;

public class Plane extends Vehicle {
    protected static final Engine plane_engine = new Engine("Suihkumoottori", 500);
    public Plane(String manufacturer, String model, int max_speed){
        super("Lentokone", manufacturer, model, max_speed, plane_engine);
    }
    

    public void fly(){
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }
}
