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
public class Company {
    private Investor investors;
    private Analyst analysts;
    private String symbol;
    private int shares;
    private float sharesPrice;
    
    public Company(Investor investors,Analyst analysts,String symmbol,int shares,float sharesPrice){
        this.analysts=analysts;
        this.investors=investors;
        this.shares=shares;
        this.sharesPrice=sharesPrice;
        this.symbol=symbol;
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

    /**
     * @return the analysts
     */
    public Analyst getAnalysts() {
        return analysts;
    }

    /**
     * @param analysts the analysts to set
     */
    public void setAnalysts(Analyst analysts) {
        this.analysts = analysts;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the shares
     */
    public int getShares() {
        return shares;
    }

    /**
     * @param shares the shares to set
     */
    public void setShares(int shares) {
        this.shares = shares;
    }

    /**
     * @return the sharesPrice
     */
    public float getSharesPrice() {
        return sharesPrice;
    }

    /**
     * @param sharesPrice the sharesPrice to set
     */
    public void setSharesPrice(float sharesPrice) {
        this.sharesPrice = sharesPrice;
    }
    
}
