/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.sql.Blob;
import javax.servlet.http.Part;

/**
 *
 * @author GAGAN
 */
public class OrgBean implements Serializable{
    
   private String orgid;
   private String name;
   private String email;
   private String contact_no;
   private String address;
   private String info;
   private  Part img1;
   private Part img2;
   private Part img3;
   private Blob image1;
   private Blob image2;
   private Blob image3;
   private boolean furniture;
   private boolean clothes;
   private boolean utensils;
   private boolean electronics;
   private boolean accessories;
   
   public OrgBean()
   {
       
   }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Part getImg1() {
        return img1;
    }

    public void setImg1(Part img1) {
        this.img1 = img1;
    }

    public Part getImg2() {
        return img2;
    }

    public void setImg2(Part img2) {
        this.img2 = img2;
    }

    public Part getImg3() {
        return img3;
    }

    public void setImg3(Part img3) {
        this.img3 = img3;
    }

    public Blob getImage1() {
        return image1;
    }

    public void setImage1(Blob image1) {
        this.image1 = image1;
    }

    public Blob getImage2() {
        return image2;
    }

    public void setImage2(Blob image2) {
        this.image2 = image2;
    }

    public Blob getImage3() {
        return image3;
    }

    public void setImage3(Blob image3) {
        this.image3 = image3;
    }

    
    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }

    public boolean isClothes() {
        return clothes;
    }

    public void setClothes(boolean clothes) {
        this.clothes = clothes;
    }

    public boolean isUtensils() {
        return utensils;
    }

    public void setUtensils(boolean utensils) {
        this.utensils = utensils;
    }

    public boolean isElectronics() {
        return electronics;
    }

    public void setElectronics(boolean electronics) {
        this.electronics = electronics;
    }

    public boolean isAccessories() {
        return accessories;
    }

    public void setAccessories(boolean accessories) {
        this.accessories = accessories;
    }
    

}