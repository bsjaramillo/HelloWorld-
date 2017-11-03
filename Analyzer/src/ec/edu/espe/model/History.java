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
public class History {
    private String symbol;
    private int sharesNumberPurchase;
    private int sharesNumberSales;
    private String timePurchase;
    private float pricePurchase;
    private float tariffPF;
    private String timeSale;
    
    public History(String symbol,int sharesNumberPurchase,int sharesNumberSales,String timePurchase,float pricePurchase,float tariffPF,String timeSale){
        this.pricePurchase=pricePurchase;
        this.sharesNumberPurchase=sharesNumberPurchase;
        this.sharesNumberSales=sharesNumberSales;
        this.symbol=symbol;
        this.tariffPF=tariffPF;
        this.timePurchase=timePurchase;
        this.timeSale=timeSale;
    }

    public History() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the sharesNumberPurchase
     */
    public int getSharesNumberPurchase() {
        return sharesNumberPurchase;
    }

    /**
     * @param sharesNumberPurchase the sharesNumberPurchase to set
     */
    public void setSharesNumberPurchase(int sharesNumberPurchase) {
        this.sharesNumberPurchase = sharesNumberPurchase;
    }

    /**
     * @return the sharesNumberSales
     */
    public int getSharesNumberSales() {
        return sharesNumberSales;
    }

    /**
     * @param sharesNumberSales the sharesNumberSales to set
     */
    public void setSharesNumberSales(int sharesNumberSales) {
        this.sharesNumberSales = sharesNumberSales;
    }

    /**
     * @return the timePurchase
     */
    public String getTimePurchase() {
        return timePurchase;
    }

    /**
     * @param timePurchase the timePurchase to set
     */
    public void setTimePurchase(String timePurchase) {
        this.timePurchase = timePurchase;
    }

    /**
     * @return the pricePurchase
     */
    public float getPricePurchase() {
        return pricePurchase;
    }

    /**
     * @param pricePurchase the pricePurchase to set
     */
    public void setPricePurchase(float pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    /**
     * @return the tariffPF
     */
    public float getTariffPF() {
        return tariffPF;
    }

    /**
     * @param tariffPF the tariffPF to set
     */
    public void setTariffPF(float tariffPF) {
        this.tariffPF = tariffPF;
    }

    /**
     * @return the timeSale
     */
    public String getTimeSale() {
        return timeSale;
    }

    /**
     * @param timeSale the timeSale to set
     */
    public void setTimeSale(String timeSale) {
        this.timeSale = timeSale;
    }
}
