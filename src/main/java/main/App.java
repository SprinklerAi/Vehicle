package main;

import java.util.ArrayList;
import java.util.Scanner;
/* Viikkotehtävä 6
 * Atilla Eminli
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        boolean exit = false;

        while (!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if(sc.hasNextInt()) {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        if(sc.hasNextInt()){
                            int type_choice = sc.nextInt();

                            switch (type_choice) {
                                case 1:
                                    System.out.println("Anna kulkuneuvon valmistaja:");
                                    String car_manufacturer = sc.next();

                                    System.out.println("Anna kulkuneuvon malli:");
                                    String car_model = sc.next();

                                    System.out.println("Anna kulkuneuvon huippunopeus:");
                                    int car_max_speed = sc.nextInt();

                                    vehicles.add(new Car(car_manufacturer, car_model, car_max_speed));
                                    break;
                                    
                                case 2:
                                    System.out.println("Anna kulkuneuvon valmistaja:");
                                    String plane_manufacturer = sc.next();

                                    System.out.println("Anna kulkuneuvon malli:");
                                    String plane_model = sc.next();

                                    System.out.println("Anna kulkuneuvon huippunopeus:");
                                    int plane_max_speed = sc.nextInt();
                                    vehicles.add(new Plane(plane_manufacturer, plane_model, plane_max_speed));
                                    break;

                                case 3:
                                    System.out.println("Anna kulkuneuvon valmistaja:");
                                    String ship_manufacturer = sc.next();

                                    System.out.println("Anna kulkuneuvon malli:");
                                    String ship_model = sc.next();

                                    System.out.println("Anna kulkuneuvon huippunopeus:");
                                    int ship_max_speed = sc.nextInt();

                                    vehicles.add(new Ship(ship_manufacturer, ship_model, ship_max_speed));
                                    break;
                                    
                                default:
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("List of Vehicles:");
                        for (Vehicle vehicle : vehicles) {
                            vehicle.print_specs();
                        }
                        break;
                    
                    case 3:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Car) {
                                Car car = (Car) vehicle;
                                car.drive();
                            }
                        }
                        break;
                    
                    case 4:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Plane) {
                                Plane plane = (Plane) vehicle;
                                plane.fly();
                            }
                        }
                        break;

                    case 5:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Ship) {
                                Ship ship = (Ship) vehicle;
                                ship.sail();
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }




            } else {
                System.out.println("Syöte oli väärä");
                break;
            }
        }
    }
}
