package org.example;

import org.example.email.GEmailSender;
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
        String text="sending email using java without less secure app";

        GEmailSender gEmailSender= new GEmailSender();
        boolean b=gEmailSender.sendEmail(to,from,subject,text);
        if(b){
            System.out.println("email is  successfully sent");
        }
        else {
            System.out.println("email is not sent successfully");
        }
    }
}
