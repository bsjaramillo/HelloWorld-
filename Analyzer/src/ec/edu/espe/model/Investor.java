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
public class Investor {
    private int sharesNumber;
    private float sharesPricePurchase;
    private float sharesPriceSale;
    private Analyst analysts;
    private StockMarket market;
    
    public Investor (int sharesNumber,float sharesPricePurchase,float sharesPriceSale,Analyst analysts,StockMarket market){
        this.sharesNumber=sharesNumber;
        this.sharesPricePurchase=sharesPricePurchase;
        this.sharesPriceSale=sharesPriceSale;
        this.analysts=analysts;
        this.market=market;
    }
    /**
     * @return the sharesNumber
     */
    public int getSharesNumber() {
        return sharesNumber;
    }

    /**
     * @param sharesNumber the sharesNumber to set
     */
    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    /**
     * @return the sharesPricePurchase
     */
    public float getSharesPricePurchase() {
        return sharesPricePurchase;
    }

    /**
     * @param sharesPricePurchase the sharesPricePurchase to set
     */
    public void setSharesPricePurchase(float sharesPricePurchase) {
        this.sharesPricePurchase = sharesPricePurchase;
    }

    /**
     * @return the sharesPriceSale
     */
    public float getSharesPriceSale() {
        return sharesPriceSale;
    }

    /**
     * @param sharesPriceSale the sharesPriceSale to set
     */
    public void setSharesPriceSale(float sharesPriceSale) {
        this.sharesPriceSale = sharesPriceSale;
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
     * @return the market
     */
    public StockMarket getMarket() {
        return market;
    }

    /**
     * @param market the market to set
     */
    public void setMarket(StockMarket market) {
        this.market = market;
    }
    
}
