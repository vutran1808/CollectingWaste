/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import common.ScannerFactory;
import model.Dump;
import model.Truck;
import model.Waste;

/**
 *
 * @author ASUS
 */
public class DaoCollectingWaste {

    private static DaoCollectingWaste instance = null;

    ScannerFactory sc;

    public DaoCollectingWaste() {
        sc = new ScannerFactory();
    }

    public static DaoCollectingWaste Instance() {
        synchronized (DaoCollectingWaste.class) {
            if (instance == null) {
                instance = new DaoCollectingWaste();
            }
        }
        return instance;
    }

    public void WasteCollecting(Waste[] storage) {
        int n = sc.getInt("The number of stations: ", "Invalid");
        storage = new Waste[n];
        for (int i = 0; i < storage.length; i++) {
            int kg = sc.getInt("Amount of garbage(kg) at station " + (i + 1) + ": ", "Must enter a number!");
            storage[i] = new Waste(kg);
        }
        System.out.println("Total amount of wastes: " + currentValue(storage) + " kg");
        GotoDump(new Truck(storage));
    }

    public int currentValue(Waste[] storage) {
        int total = 0;
        for (Waste i : storage) {
            total += i.getQuantity();
        }
        return total;
    }

    public void GotoDump(Truck truck) {
        Dump dump = new Dump(truck.getStorage());
        int numTruck = Math.ceilDiv(currentValue(dump.getWastes()), truck.getCapacity()) + 1;
        System.out.println("The number of truck go to the Dump: " + numTruck);
        int collectTimes = dump.getWastes().length;
        System.out.println("Collect times: " + collectTimes);
        int dumpCost = 57000 * numTruck;
        System.out.println("Dump cost: " + dumpCost + " VND");
        int transport = ((numTruck * 30) + (collectTimes * 8)) * (120000 / 60);
        System.out.println("Transport cost: " + transport + " VND");
        System.out.println("Total cost: " + (dumpCost + transport) + " VND");
    }
}
