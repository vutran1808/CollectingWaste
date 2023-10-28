/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Waste;
import repository.IWasteRepository;
import repository.WasteRepository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class WasteManageMent extends Menu {

    IWasteRepository mn;
    private Waste[] storage = null;
    static String[] mc = {"Collecting wastes", "Exit"};

    public WasteManageMent() {
        super("Waste Collecting Program", mc);
        mn = new WasteRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 ->
                mn.collectWaste(storage);
            case 2 ->
                System.exit(0);
        }
    }

}
