/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class UI {
    
    private Scanner sc;
    
    public UI(){
        this.sc = new Scanner(System.in);
    }
    
    public void UI(){
        System.out.println("Nombre del archivo: ");
        String archivo = sc.next();
    }
}
