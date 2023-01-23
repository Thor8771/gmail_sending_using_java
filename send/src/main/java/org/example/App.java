package org.example;

import org.example.email.GEmailSender;

import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the email to send");
        String to=sc.nextLine();
        String from="shubhamkushwaha8709@gmail.com";
        String subject=" sending email using java";
        String text="sending email using with attachement2";
        File file=new File("D:\\auroraos.png");

        GEmailSender gEmailSender= new GEmailSender();
        boolean b=gEmailSender.sendEmailWithAttachement(to,from,subject,text,file);
        if(b){
            System.out.println("email is  successfully sent");
        }
        else {
            System.out.println("email is not sent successfully");
        }
        /*boolean b=gEmailSender.sendEmail(to,from,subject,text);
        if(b){
            System.out.println("email is  successfully sent");
        }
        else {
            System.out.println("email is not sent successfully");
        }*/
    }
}
