/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.MydbConnection;
import dto.OrgBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAGAN
 */
public class OrgDAO {
    
    public List getOrganizations()
    {
         ArrayList<OrgBean>org_list=new ArrayList<OrgBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from organization_details");
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               OrgBean org=new OrgBean();
             org.setOrgid(rs.getString("orgid"));
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
             
             org_list.add(org);
           }
      }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return org_list;
    }
    
    public List getOrganizations_furniture()
    {
         ArrayList<OrgBean>org_list=new ArrayList<OrgBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from organization_details where furniture=?");
           pst.setBoolean(1,true);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               OrgBean org=new OrgBean();
             org.setOrgid(rs.getString("orgid"));
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
             
             org_list.add(org);
           }
      }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return org_list;
    }
    
    public List getOrganizations_utensils()
    {
         ArrayList<OrgBean>org_list=new ArrayList<OrgBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from organization_details where utensils=?");
           pst.setBoolean(1,true);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               OrgBean org=new OrgBean();
             org.setOrgid(rs.getString("orgid"));
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
             
             org_list.add(org);
           }
      }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return org_list;
    }
    
    public List getOrganizations_electronics()
    {
         ArrayList<OrgBean>org_list=new ArrayList<OrgBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from organization_details where electronics=?");
           pst.setBoolean(1,true);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               OrgBean org=new OrgBean();
             org.setOrgid(rs.getString("orgid"));
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
             
             org_list.add(org);
           }
      }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return org_list;
    }
    
    public List getOrganizations_accessories()
    {
         ArrayList<OrgBean>org_list=new ArrayList<OrgBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from organization_details where accessories=?");
           pst.setBoolean(1,true);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               OrgBean org=new OrgBean();
             org.setOrgid(rs.getString("orgid"));
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
             
             org_list.add(org);
           }
      }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return org_list;
    }
    
    public List getOrganizations_clothes()
    {
         ArrayList<OrgBean>org_list=new ArrayList<OrgBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from organization_details where clothes=?");
           pst.setBoolean(1,true);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
               OrgBean org=new OrgBean();
             org.setOrgid(rs.getString("orgid"));
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
             
             org_list.add(org);
           }
      }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return org_list;
    }
    
    public OrgBean getOrgDetails(String orgid)
    {
        OrgBean org=new OrgBean();
        try
        {
            Connection con=MydbConnection.getDbConnection();
            PreparedStatement pst=con.prepareStatement("Select * from organization_details where orgid=?");
            pst.setString(1,orgid);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
             org.setName(rs.getString("name"));
             org.setEmail(rs.getString("email"));
             org.setContact_no(rs.getString("contact_no"));
             org.setAddress(rs.getString("address"));
             org.setInfo(rs.getString("info"));
             org.setImage1(rs.getBlob("img1"));
             org.setImage2(rs.getBlob("img2"));
             org.setImage3(rs.getBlob("img3"));
             org.setFurniture(rs.getBoolean("furniture"));
             org.setClothes(rs.getBoolean("clothes"));
             org.setUtensils(rs.getBoolean("utensils"));
             org.setElectronics(rs.getBoolean("electronics"));
             org.setAccessories(rs.getBoolean("accessories"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return org;
    }
}
