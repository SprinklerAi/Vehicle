package main;

public class Car extends Vehicle {
    protected static final Engine car_engine = new Engine("V8", 200);

    public Car(String manufacturer, String model, int max_speed){
        super("Auto", manufacturer, model, max_speed, car_engine);
    }
    

    public void drive(){
        System.out.println(manufacturer + " " + model +" paahtaa tietä eteenpäin!");
    }
}
