package main;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int max_speed;
    protected Engine engine;

    public Vehicle(String type, String manufacturer, String model, int max_speed, Engine engine){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.max_speed = max_speed;
        this.engine = engine;
    }


    public String get_type() {
        return type;
    }

    public String get_manufacturer() {
        return manufacturer;
    }

    public String get_model() {
        return model;
    }

    public int get_speed() {
        return max_speed;
    }

    public void print_specs() {
        System.out.println(type + ": " + manufacturer + " " + model);
        System.out.println("Moottori: " + engine.get_name() + " " + engine.get_power() + "kwH");
        System.out.println("Huippunopeus: " + max_speed + "km/h");
        System.out.println("");
    }

}
