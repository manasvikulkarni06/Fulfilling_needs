/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Blob;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.servlet.http.Part;

/**
 *
 * @author GAGAN
 */
public class DonationsBean {
    
    private int donation_id;
    private String donorid;
    private String donorname;
    private String donoremail;
    private String donorno;
    private String orgid;
    private String orgname;
    Blob image;
    Part img;
    private String rec_date;
    private String rec_time;
    private String commodity;
    private LocalDate date;
    private LocalTime time;
    private int amount;
    
    public String getDonorid() {
        return donorid;
    }

    public String getDonoremail() {
        return donoremail;
    }

    public void setDonoremail(String donoremail) {
        this.donoremail = donoremail;
    }

    public String getDonorno() {
        return donorno;
    }

    public void setDonorno(String donorno) {
        this.donorno = donorno;
    }

    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
    public void setDonorid(String donorid) {
        this.donorid = donorid;
    }

    public String getDonorname() {
        return donorname;
    }

    public void setDonorname(String donorname) {
        this.donorname = donorname;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public Part getImg() {
        return img;
    }

    public void setImg(Part img) {
        this.img = img;
    }

    public String getRec_date() {
        return rec_date;
    }

    public void setRec_date(String rec_date) {
        this.rec_date = rec_date;
    }

    public String getRec_time() {
        return rec_time;
    }

    public void setRec_time(String rec_time) {
        this.rec_time = rec_time;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public int getDonation_id() {
        return donation_id;
    }

    public void setDonation_id(int donation_id) {
        this.donation_id = donation_id;
    }
    
    
}
