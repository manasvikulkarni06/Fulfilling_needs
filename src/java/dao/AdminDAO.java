/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author GAGAN
 */
public class AdminDAO {
    
     public void sendMail(String recepient)
    {
        try{
            String host ="smtp.gmail.com" ;
            String user = "fulfillingtheneeds@gmail.com";
            String pass = "Fulfill@123";
            String to = recepient;
            String from = "fulfillingtheneeds@gmail.com";
            String subject = "Donation at Fulfilling_Needs";
            String messageText = "Thank you for your support. We ensure that your donations are being channeled to the program and organizaion of your choice, and hope for similar support from you in future.\n\nRegards\nTeam Fulfilling_Needs";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
