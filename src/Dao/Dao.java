/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Datos.Asset;
import Datos.Cash;
import Datos.DividentStock;
import Datos.Stock;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Dao {
    
    public Cash cargarCash(Scanner sc){
        Cash cash = null;
        int amount = sc.nextInt();
        return cash;
    }
    
    public Stock cargarStock(Scanner sc){
        Stock stock = null;
        String symbol = sc.next().trim();
        int totalCost = sc.nextInt();
        int currentPrice = sc.nextInt();
        int totalShares = sc.nextInt();
        return stock;
    }
    
    public DividentStock cargarDividentStock(Scanner sc){
        DividentStock dividentStock = null;
        String symbol = sc.next().trim();
        int totalCost = sc.nextInt();
        int currentPrice = sc.nextInt();
        int totalShares = sc.nextInt();
        int dividends = sc.nextInt();
        return dividentStock;
    }
    
    public String decript(String cadena){
        
        String retorno = "";
        char[] newCadena = cadena.toCharArray();
        for(int i = 0; i<newCadena.length; i++){
            int cast =(int) newCadena[i];
            int formula = (cast-3)%255;
            retorno += (char)formula;
        }
        return retorno;
    }
    
    public Asset cargarAsset(Scanner sc){
        Asset asset = null;
        String Acum = sc.next().trim();
        if(decript(Acum).equals("CASH")){
            asset = cargarCash(sc);
        }if(decript(Acum).equals("STOCK")){
            asset = cargarStock(sc);
        }if(decript(Acum).equals("DIVIDENTSTOCK")){
            asset = cargarDividentStock(sc);
        }
        return asset;
    }
    
    public ArrayList<Asset> cargarArchivo() throws FileNotFoundException{
        Scanner sc = new Scanner(new File("datos.txt"));
        sc.useDelimiter(",");
        ArrayList<Asset> assets = new ArrayList<Asset>();
        while(sc.hasNext()){
            assets.add(cargarAsset(sc));
        }
        return assets;
    }
}
