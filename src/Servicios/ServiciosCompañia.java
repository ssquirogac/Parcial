/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Dao.Dao;
import Datos.Asset;
import Datos.Cash;
import Datos.ShareAsset;
import Datos.Compañia;
import Datos.DividentStock;
import Datos.MutualFund;
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
    
    public double valorTotalMercadoStocksDivStocks(ArrayList<ShareAsset> shareAssets){
       double c=0;
       for(int i=0; i<shareAssets.size();i++){
        if((shareAssets.get(i) instanceof Stock)||(shareAssets.get(i) instanceof DividentStock)){
          if(shareAssets.get(i).getSymbol().equals("GOOGLE")||shareAssets.get(i).getSymbol().equals("SAMSUMG")){
            c+=shareAssets.get(i).getMarketValue();
          } 
        }    
       }
       return c;
    }
    
    public double valorTotalMercadoAsset(ArrayList<ShareAsset> shareAssets, ArrayList<Cash> cash){
      double c=0;
      for(int i=0; i<shareAssets.size();i++){
        c+=shareAssets.get(i).getMarketValue();
      }
      for(int i=0; i<cash.size(); i++){
        c+=cash.get(i).getMarketValue();
      }
      return c;
    }
    
    public double beneficioTotalAsset(ArrayList<ShareAsset> shareAssets){
      double c=0;
      for(int i=0; i<shareAssets.size();i++){
        c+=shareAssets.get(i).getProfit();
      }
      return c;
    }
}
