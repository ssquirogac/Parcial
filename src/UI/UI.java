/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Datos.Cash;
import Servicios.ServiciosCompañia;
import Datos.ShareAsset;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class UI {
    
    public static void main(String arg[]) throws FileNotFoundException{
        ServiciosCompañia servicios = new ServiciosCompañia();
        Scanner seleccion = new Scanner(System.in);
        System.out.println("Opciones");
        System.out.println("1. Cargar Archivo.");
        System.out.println("2. Listar Assets.");
        System.out.println("3. Ver valor total en el mercado de Stock y DividentStock con Symbol Google o Samsung.");
        System.out.println("4. Ver valor total en el mercado y beneficios de todos los Assets.");
        System.out.println("");
        int opcion = -1;
        boolean indicador = true;
        
        while(indicador){
            ArrayList<Cash> cash=null;
            ArrayList<ShareAsset> shareAssets= null;
            opcion = seleccion.nextInt();
            switch(opcion){
                case 1:
                    servicios.cargarArchivo();
                    System.out.println("Se ha cargado el archivo 'datos.txt'");
                break;
                case 2:
                    System.out.println("Assets:");
                    System.out.println(servicios.listarAssets());
                break;
                case 3:
                    System.out.println("Valor Total Mercado Stock y DividentStock para Google o Samsumg:");
                    System.out.println(servicios.valorTotalMercadoStocksDivStocks(shareAssets));
                break;
                case 4:
                    System.out.println("Valor Total Mercado Assets:");
                    System.out.println(servicios.valorTotalMercadoAsset(shareAssets, cash));
                    System.out.println("Beneficio Total Assets:");
                    System.out.println(servicios.beneficioTotalAsset(shareAssets));
                break;
                default:
                    System.out.println("Opcion Invalida");
            }
        }
    }
}
