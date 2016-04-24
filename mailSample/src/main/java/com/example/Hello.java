package com.example;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class Hello {
    public static void main(String[] args) throws EmailException {
        System.out.println("Hello World");
        sendSESEmail();
    }

    // for mailCacher
    private static void sendEmail() throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("127.0.0.1");
        email.setSmtpPort(1025);
        email.setFrom("uryyyyyyy@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("koki305@gmail.com");
        email.send();
    }

    //for SES
    private static void sendSESEmail() throws EmailException {
        String userName = System.getenv("USER_NAME");
        String password = System.getenv("PASSWORD");

        Email email = new SimpleEmail();
        email.setHostName("email-smtp.us-east-1.amazonaws.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(userName, password));
        email.setSSLOnConnect(true);
        email.setFrom("koki305@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("koki305@gmail.com");
        email.send();
    }
}
