/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Compañia {
    
    protected ArrayList<Asset> assets;

    public ArrayList<Asset> getAssets() {
        return assets;
    }
    
    public void addAssets(Asset asset){
        this.assets.add(asset);
    }
}
