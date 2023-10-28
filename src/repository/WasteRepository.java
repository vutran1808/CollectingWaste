/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.DaoCollectingWaste;
import model.Waste;

/**
 *
 * @author ASUS
 */
public class WasteRepository implements IWasteRepository{

    @Override
    public void collectWaste(Waste[] storage) {
        DaoCollectingWaste.Instance().WasteCollecting(storage);
    }
}
