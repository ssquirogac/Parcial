/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Sebastian
 */

public class DividentStock extends Stock{
    
    protected double dividends;

    public DividentStock(double dividends, int totalShares, String symbol, double totalCost, double CurrentPrice) {
        super(totalShares, symbol, totalCost, CurrentPrice);
        this.dividends = dividends;
    }

    public double getDividends() {
        return dividends;
    }

    public void setDividends(double dividends) {
        this.dividends = dividends;
    }
    
    @Override
    public double getMarketValue(){
        return this.getMarketValue()+this.dividends;
    }
    
    @Override
    public double getProfit(){
        return (this.totalShares*this.currentPrice)-this.totalCost;
    }
}
