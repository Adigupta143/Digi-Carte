/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hib.dto;

/**
 *
 * @author ADI
 */
public class Chef {
    private String chefId;
    private String chefName;
    private String pass;
    private String section;
    private String post;
    
    public Chef(){}

    public Chef(String chefId, String chefName, String pass, String section, String post) {
        this.chefId = chefId;
        this.chefName = chefName;
        this.pass = pass;
        this.section = section;
        this.post = post;
    }

    /**
     * @return the chefId
     */
    public String getChefId() {
        return chefId;
    }

    /**
     * @param chefId the chefId to set
     */
    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    /**
     * @return the chefName
     */
    public String getChefName() {
        return chefName;
    }

    /**
     * @param chefName the chefName to set
     */
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }
    
    
}
