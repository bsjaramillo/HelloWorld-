/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author BJ
 */
public class StockMarket {
    private float stockCapital;
    private float shares;
    private Investor investors;
    
    public StockMarket(float stockCapital,float shares,Investor investors){
        this.investors=investors;
        this.shares=shares;
        this.stockCapital=stockCapital;
    }

    /**
     * @return the stockCapital
     */
    public float getStockCapital() {
        return stockCapital;
    }

    /**
     * @param stockCapital the stockCapital to set
     */
    public void setStockCapital(float stockCapital) {
        this.stockCapital = stockCapital;
    }

    /**
     * @return the shares
     */
    public float getShares() {
        return shares;
    }

    /**
     * @param shares the shares to set
     */
    public void setShares(float shares) {
        this.shares = shares;
    }

    /**
     * @return the investors
     */
    public Investor getInvestors() {
        return investors;
    }

    /**
     * @param investors the investors to set
     */
    public void setInvestors(Investor investors) {
        this.investors = investors;
    }
}
