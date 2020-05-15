package vehicleShowroom;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {
        int visitor = 30;
        int count = 0, count1 = 0;

        ArrayList<NormalVehicle> normalVehicleList = new ArrayList();
        ArrayList<SportsVehicle> sportsVehicleList = new ArrayList();
        ArrayList<HeavyVehicle> heavyVehicleList = new ArrayList();

        NormalVehicle n1 = new NormalVehicle("Audi R3", "A", 500, 40);
        normalVehicleList.add(n1);
        NormalVehicle n2 = new NormalVehicle("Audi A8", "B", 450, 34);
        normalVehicleList.add(n2);
        NormalVehicle n3 = new NormalVehicle("Jeep Gladiator", "C", 560, 50);
        normalVehicleList.add(n3);
        NormalVehicle n4 = new NormalVehicle("Toypta Gr Supra", "B", 380, 40);
        normalVehicleList.add(n4);

        SportsVehicle s1 = new SportsVehicle("GTR", "A", 500, 40, "Turbo 1");
        sportsVehicleList.add(s1);
        SportsVehicle s2 = new SportsVehicle("GTR R2", "B", 450, 34, "Turbo 2"); // input B engineType but output A engineType (oil). according to requiremets.
        sportsVehicleList.add(s2);
        SportsVehicle s3 = new SportsVehicle("GTR R32", "C", 500, 40, "Turbo 3"); //input C engineType but output A engineType (oil). according to requiremets.
        sportsVehicleList.add(s3);
        SportsVehicle s4 = new SportsVehicle("GTR", "A", 500, 40, "Turbo 4");
        sportsVehicleList.add(s4);

        HeavyVehicle h1 = new HeavyVehicle("Volvo", "C", 600, 50, 1000);
        heavyVehicleList.add(h1);
        HeavyVehicle h2 = new HeavyVehicle("Volvo2", "C", 620, 55, 2000);
        heavyVehicleList.add(h2);

        System.out.println("The Category of Normal vehicle : ");
        for (NormalVehicle n : normalVehicleList) {
            n.getVehicleDetails();
            System.out.println();

        }

        System.out.println("The Sports Vehicle List : ");

        for (SportsVehicle s : sportsVehicleList) {
            s.getVehicleDetails();
            System.out.println();
            count++;

        }

        System.out.println("The Heavy Vehicle List : ");

        for (HeavyVehicle h : heavyVehicleList) {
            h.getVehicleDetails();
            System.out.println();

        }
        visitor = visitor + (count * 20);
        System.out.println("Details of Expected Visitor : " + visitor);

        // After Removing Vehicle...
        normalVehicleList.remove(n1);
        sportsVehicleList.remove(s1);
        heavyVehicleList.remove(h1);

        for (NormalVehicle n : normalVehicleList) {
            n.getVehicleDetails();
            System.out.println();

        }

        System.out.println("The Sports Vehicle List : ");

        for (SportsVehicle s : sportsVehicleList) {
            s.getVehicleDetails();
            System.out.println();
            count1++;

        }

        System.out.println("The Heavy Vehicle List : ");

        for (HeavyVehicle h : heavyVehicleList) {
            h.getVehicleDetails();
            System.out.println();

        }

        visitor = visitor - ((count - count1) * 20);
        System.out.println("Details of Expected Visitor : " + visitor);

    }

}
