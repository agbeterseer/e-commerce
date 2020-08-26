/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utill;

import java.util.Properties;
import javax.mail.*;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 *
 * @author JPT TERSOO AGBE
 */
public class EmailSenderl {
     private String HOST;
    private String USER;
    private String PASSWORD;
    private String PORT;
    private String FROM;
    private String TO;
    private String STARTTLS;
    private String AUTH;
    private String DEBUG;
    private String SOCKET_FACTORY;
    private String SUBJECT;
    private String TEXT;
    String returnmsg;

    public EmailSenderl(String HOST, String USER, String PASSWORD, String PORT, String FROM, String TO, String STARTTLS, String AUTH, String DEBUG, String SOCKET_FACTORY, String SUBJECT, String TEXT) {
        this.HOST = HOST;
        this.USER = USER;
        this.PASSWORD = PASSWORD;
        this.PORT = PORT;
        this.FROM = FROM;
        this.TO = TO;

        this.STARTTLS = STARTTLS;
        this.AUTH = AUTH;
        this.DEBUG = DEBUG;
        this.SOCKET_FACTORY = SOCKET_FACTORY;
        this.SUBJECT = SUBJECT;
        this.TEXT = TEXT;
    }

    public synchronized String send() {
        //Use Properties object to set environment properties
        Properties props = new Properties();

        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.user", USER);

        props.put("mail.smtp.auth", AUTH);
        props.put("mail.smtp.starttls.enable", STARTTLS);
        props.put("mail.smtp.debug", DEBUG);

        props.put("mail.smtp.socketFactory.port", PORT);
        props.put("mail.smtp.socketFactory.class", SOCKET_FACTORY);
        props.put("mail.smtp.socketFactory.fallback", "false");

        try {

            //Obtain the default mail session
            Session session = Session.getDefaultInstance(props, null);
            session.setDebug(true);

            //Construct the mail message
            MimeMessage message = new MimeMessage(session);
            //message.setText(TEXT);
            message.setContent(TEXT, "text/html");
            message.setSubject(SUBJECT);
            message.setFrom(new InternetAddress(FROM));
            message.addRecipient(RecipientType.TO, new InternetAddress(TO));
            message.saveChanges();

            //Use Transport to deliver the message
            Transport transport = session.getTransport("smtp");
            transport.connect(HOST, USER, PASSWORD);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            returnmsg =  "Transaction details were sent to your email";
        } catch (Exception e) {
            returnmsg = "could not send mail: "+e.getMessage();
            e.printStackTrace();
        }
        return returnmsg;
    }

}
