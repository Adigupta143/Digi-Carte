/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.dto;

/**
 *
 * @author ADI
 */
public class Menu {
    private String foodid;
     private String foodName;
     
     private String description;
     private String Category;
     private int Price;
     private String offer;
     private Integer quantity;
     
     public Menu(){}

    public Menu(  String foodid,String foodName, String description, String Category, Integer Price, String offer,int quantity) {
        this.foodid=foodid;
        this.foodName = foodName;
        this.description = description;
        this.Category = Category;
        this.Price = Price;
        this.offer = offer;
        this.quantity=quantity;
        
    }

    public String getFoodid() {
        return foodid;
    }

    /**
     * @param foodid the foodid to set
     */
    public void setFoodid(String foodid) {
        this.foodid = foodid;
    }
    /**
     * @return the itemName
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    /**
     * @return the offer
     */
    public String getOffer() {
        return offer;
    }

    /**
     * @param offer the offer to set
     */
    public void setOffer(String offer) {
        this.offer = offer;
    }

    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    
     
     
    
    
}
