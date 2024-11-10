/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.dto;

/**
 *
 * @author ADI
 */
public class OrderSummary {
    private String userId;
    private String itmName;
    private String totalItem;
    private float payment;
    
    public OrderSummary(){}

    public OrderSummary(String userId, String itmName, String totalItem, float payment) {
        this.userId = userId;
        this.itmName = itmName;
        this.totalItem = totalItem;
        this.payment = payment;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the itemName
     */
    public String getItmName() {
        return itmName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItmName(String itmName) {
        this.itmName = itmName;
    }

    /**
     * @return the totalItem
     */
    public String getTotalItem() {
        return totalItem;
    }

    /**
     * @param totalItem the totalItem to set
     */
    public void setTotalItem(String totalItem) {
        this.totalItem = totalItem;
    }

    /**
     * @return the payment
     */
    public float getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(float payment) {
        this.payment = payment;
    }
    
    
    
}
