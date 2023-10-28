/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Truck {

    private final int capacity = 10000;
    private Waste[] storage;

    public Truck(Waste[] storage) {
        this.storage = storage;
    }

    public int getCapacity() {
        return capacity;
    }

    public Waste[] getStorage() {
        return storage;
    }

    public void setStorage(Waste[] storage) {
        this.storage = storage;
    }

}
