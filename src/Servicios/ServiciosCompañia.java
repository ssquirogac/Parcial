/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Dao.Dao;
import Datos.Asset;
import Datos.ShareAsset;
import Datos.Compañia;
import Datos.DividentStock;
import Datos.Stock;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class ServiciosCompañia {
    
    private Compañia compañia;
    private Dao dao;
    
    public ServiciosCompañia(){
        this.compañia = new Compañia();
    }
    
    public void cargarArchivo() throws FileNotFoundException{
        dao.cargarArchivo();
    }
    
    public ArrayList<Asset> listarAssets(){
        return this.compañia.getAssets();
    }
    
    public double valorTotalMercado(Stock stock, DividentStock divStock){
        if(stock.symbol.equals("GOOGLE")&&divStock.symbol.equals("GOOGLE")){
            int c = 0;
            for(int i=0; i<this.compañia.getAssets().size(); i++){
                
            }
        }
    }
}
