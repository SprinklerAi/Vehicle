package main;

public class Ship extends Vehicle {
    protected static final Engine ship_engine = new Engine("Wärtsilä Super", 1000);
    public Ship(String manufacturer, String model, int max_speed){
        super("Laiva", manufacturer, model, max_speed, ship_engine);
    }
    

    public void sail(){
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }
}