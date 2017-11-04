import business.BMW;
import business.Ford;
import business.IComponent;
import pattern.*;

import java.util.Scanner;

public class Driver {


    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("---------W-E-L-C-O-M-E---------------");
        System.out.println("---A-K-E-T-Z-A-S--C-A-R--S-A-L-E----");
        System.out.println("-------------------------------------");

        System.out.println("Choose a car you wish to purchase:");
        System.out.println("1 - Ford");
        System.out.println("2 - BMW");
        System.out.println("Enter car number");

        Scanner sc = new Scanner(System.in);
        int carNo = sc.nextInt();

        IComponent car = null;
        switch (carNo){
            case 1:
                car = new Ford();
                break;

            case 2:
                car = new BMW();
                break;

            default:
                System.out.println("Please select any of the two options listed below:");
                System.out.println("1 - Ford");
                System.out.println("2 - BMW");
                System.out.println("Enter car number");

        }

        System.out.println("Would you like to add any extras to your car?");

        int extras = -1;
        do{
            System.out.println("Choose any of the following:");
            System.out.println("1 - Bluetooth");
            System.out.println("2 - Air Conditioning");
            System.out.println("3 - Petrol");
            System.out.println("4 - Diesel");
            System.out.println("5 - Ciritione");
            System.out.println("Press 0 for the price and the see the extras");

            extras = sc.nextInt();

            switch(extras){
                case 1:
                    car = new Bluetooth(car);
                    break;

                case 2:
                    car = new AirCon(car);
                    break;

                case 3:
                    car = new Petrol(car);
                    break;

                case 4:
                    car = new Diesel(car);
                    break;

                case 5:
                    car = new Ciritione(car);
                    break;
            }

        }while(extras != 0);

        //print out data
        System.out.println(car.getDescription());
        System.out.println("Total price £" + car.getPrice());

    }
}
