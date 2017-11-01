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
public class Analyst {
    private String name;
    private String initials;
    private History history;

    public Analyst(String name, String initials, History history) {
        this.name = name;
        this.initials = initials;
        this.history = history;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the initials
     */
    public String getInitials() {
        return initials;
    }

    /**
     * @param initials the initials to set
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * @return the history
     */
    public History getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(History history) {
        this.history = history;
    }

    public void setname(String brandon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
