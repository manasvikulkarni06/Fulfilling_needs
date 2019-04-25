/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.MydbConnection;
import dto.DonationsBean;
import dto.OrgBean;
import dto.UserBean;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.Part;

/**
 *
 * @author GAGAN
 */
public class UserDAO {
    
   public int userRegister(UserBean user)
    {
        int res=0;
        try
        {
        Connection con=MydbConnection.getDbConnection();
            PreparedStatement pst=con.prepareStatement("Insert into user_details values(?,?,?,?,?,?)");
            pst.setString(1,user.getUserid());
            pst.setString(2,user.getName());
            pst.setString(3,user.getPassword());
            pst.setString(4,user.getContact_no());
            pst.setString(5,user.getEmail());
            pst.setString(6,user.getAddress());
            
            int count=pst.executeUpdate();
            if(count>0)
                res=1;
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return res;
        
    }
   
   public int isUserValid(UserBean user)
   {
       int res=0;
       try
       {
           Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from user_details where userid=? and password=?");
           pst.setString(1,user.getUserid());
           pst.setString(2,user.getPassword());
           ResultSet rs=pst.executeQuery();
           if(rs.isBeforeFirst())
           {
               res=1;
           }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       return res;
   }
   
   public UserBean getUserDetails(String userid)
   {
       
          UserBean ob=new UserBean();
   
      try
      {
      Connection con=MydbConnection.getDbConnection();
      PreparedStatement pst=con.prepareStatement("Select * from user_details where userid=?");
      pst.setString(1,userid);
      ResultSet rs=pst.executeQuery();
      while(rs.next())
      {
          ob.setUserid(userid);
          ob.setContact_no(rs.getString("contact_no"));
          ob.setName(rs.getString("name"));
          ob.setEmail(rs.getString("email"));
          ob.setAddress("address");
      }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      return ob;
       }
       
       public int setDonationDetails(DonationsBean ob)
       {
           Part img=ob.getImg();
           Date rec_date=Date.valueOf(ob.getRec_date());
           Time rec_time=Time.valueOf(ob.getRec_time());
           int res=0;
           try
        {
            Connection con=MydbConnection.getDbConnection();
            PreparedStatement pst=con.prepareStatement("Insert into donation_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            InputStream com_img=img.getInputStream();
            pst.setInt(1,ob.getDonation_id());
            pst.setString(2,ob.getDonorid());
            pst.setString(3,ob.getDonorname());
            pst.setString(4,ob.getDonoremail());
            pst.setString(5,ob.getDonorno());
            pst.setString(6,ob.getOrgid());
            pst.setString(7,ob.getOrgname());
            pst.setBlob(8,com_img);
            pst.setDate(9,rec_date);
            pst.setTime(10,rec_time);
            pst.setString(11,ob.getCommodity());
            pst.setBoolean(12,false);
            pst.setString(13,null);
            int count=pst.executeUpdate();
            if(count>0)
                res=1;
            
        }
        catch(Exception e)
        {
            res=0;
            return res;
        } 
           
           return res;
       }
       
       public int setMoneyDonation(DonationsBean ob)
       {
            int res=0;
           try
        {
            LocalDate date=ob.getDate();
           Date rec_date=Date.valueOf(date);
           LocalTime time=ob.getTime();
           Time rec_time=Time.valueOf(time);
            Connection con=MydbConnection.getDbConnection();
            PreparedStatement pst=con.prepareStatement("Insert into donation_details values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1,ob.getDonation_id());
            pst.setString(2,ob.getDonorid());
            pst.setString(3,ob.getDonorname());
            pst.setString(4,ob.getDonoremail());
            pst.setString(5,ob.getDonorno());
            pst.setString(6,ob.getOrgid());
            pst.setString(7,ob.getOrgname());
            pst.setString(8,null);
            pst.setDate(9,rec_date);
            pst.setTime(10,rec_time);
            pst.setString(11,ob.getCommodity());
            pst.setBoolean(12,true);
            pst.setInt(13,ob.getAmount());
            int count=pst.executeUpdate();
            if(count>0)
                res=1;
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        return res;   
       }
       
       public DonationsBean getDonationDetails(int donation_id)
       {
           DonationsBean ob=new DonationsBean();
           
           try
      {
      Connection con=MydbConnection.getDbConnection();
      PreparedStatement pst=con.prepareStatement("Select * from donation_details where donation_id=?");
      pst.setInt(1,donation_id);
      ResultSet rs=pst.executeQuery();
      while(rs.next())
      {
          Date d=rs.getDate("rec_date");
          ob.setRec_date(String.valueOf(d));
          Time t=rs.getTime("rec_time");
          ob.setRec_time(String.valueOf(t));
          ob.setOrgname(rs.getString("orgname"));
          ob.setDonoremail(rs.getString("donoremail"));
          ob.setAmount(rs.getInt("amount"));
          ob.setDonorno(rs.getString("donorno"));
      }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
           
           return ob;
       }
       public List getAllDonations(String donorid)
       {
       ArrayList<DonationsBean>donation_list=new ArrayList<DonationsBean>();
         try
      {
          Connection con=MydbConnection.getDbConnection();
           PreparedStatement pst=con.prepareStatement("Select * from donation_details where donorid=? and status=1");
           pst.setString(1,donorid);
           ResultSet rs=pst.executeQuery();
           while(rs.next())
           {
              DonationsBean don=new DonationsBean();
              don.setDonation_id(rs.getInt("donation_id"));
              don.setOrgname(rs.getString("orgname"));
              don.setRec_date(rs.getDate("rec_date").toString());
              don.setRec_time(rs.getString("rec_time").toString());
              don.setCommodity(rs.getString("commodity"));
              donation_list.add(don);
            }
      }
       catch(Exception e)
         {
           e.printStackTrace();
         }
         return donation_list;
   }
       }
