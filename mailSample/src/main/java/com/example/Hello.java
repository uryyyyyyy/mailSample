package com.example;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

class Hello {
    public static void main(String[] args) throws EmailException {
        System.out.println("Hello World");
        sendEmail();
    }

    private static void sendEmail() throws EmailException {

        Email email = new SimpleEmail();
        email.setHostName("127.0.0.1");
        email.setSmtpPort(1025);
//        email.setAuthenticator(new DefaultAuthenticator("username", "password"));
//        email.setSSLOnConnect(true);
        email.setFrom("uryyyyyyy@gmail.com");
        email.setSubject("TestMail");
        email.setMsg("This is a test mail ... :-)");
        email.addTo("koki305@gmail.com");
        email.send();
    }
}
