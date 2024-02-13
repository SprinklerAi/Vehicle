package main;

public class Engine {
    private String name;
    private int power;

    public Engine(String name, int power){
        this.name = name;
        this.power = power;
    }

    public String get_name() {
        return name;
    }

    public int get_power() {
        return power;
    }
}
