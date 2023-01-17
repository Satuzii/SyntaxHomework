package class5;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your country: Turkiye, UK, USA, India or Afghanistan");
        String country = sc.nextLine();

        if (country.equalsIgnoreCase("Turkiye")) {

            System.out.println("You have select Turkish");

            System.out.println("Lütfen notunuzu girin");
            int not = sc.nextInt();

            if  (not >= 90) {System.out.println("Puanınız "+not+". Notunuz A sınıfıdır");}
            else if(not >=70 && not < 90 ) {System.out.println("Puanınız "+not+". Notunuz B sınıfıdır");}
            else if (not >= 50 && not <= 70) {System.out.println("Puanınız "+not+". Notunuz C sınıfıdır");}
            else {System.out.println("Puanınız "+not+". Notunuz C sınıfıdır");}
        }

        if (country.equalsIgnoreCase("UK") || country.equalsIgnoreCase("USA")) {

            System.out.println("You have select English");

            System.out.println("Enter your grade");
            int not = sc.nextInt();

            if  (not >=90) {System.out.println("Your Score is "+not+". Your grade is grade A");}
            else if(not >=70 && not < 90 ) {System.out.println("Your Score is "+not+". Your grade is grade B");}
            else if (not >= 50 && not <= 70) {System.out.println("Your Score is "+not+". Your grade is grade C");}
            else if (not >= 0 && not <= 50){System.out.println("Your Score is "+not+". Your grade is grade D");}
            else {System.out.println("Your Score is "+not+". It is not acceptable");}
        }

        if (country.equalsIgnoreCase("India")) {

            System.out.println("You have select Hindi");

            System.out.println("आप किस ग्रेड में हैं");
            int not = sc.nextInt();

            if  (not >= 90) {System.out.println("आपका स्कोर "+not+" है। आपका ग्रेड ग्रेड A है");}
            else if(not >=70 && not < 90 ) {System.out.println("आपका स्कोर "+not+" है। आपका ग्रेड ग्रेड B है");}
            else if (not >= 50 && not <= 70) {System.out.println("आपका स्कोर "+not+" है। आपका ग्रेड ग्रेड C है");}
            else if (not >= 0 && not <= 50){System.out.println("आपका स्कोर "+not+" है। आपका ग्रेड ग्रेड D है");}
            else {System.out.println("आपका स्कोर "+not+". स्वीकार्य नहीं है");}
        }

        if (country.equalsIgnoreCase("Afghanistan")) {

            System.out.println("You have selected Pashto");

            System.out.println("مهرباني وکړئ خپل درجه داخل کړئ");
            int not = sc.nextInt();

            if  (not >=90) {System.out.println("ستاسو درجه A درجه ده"+not+".ستاسو نمره ده");}
            else if(not >=70 && not < 90 ) {System.out.println("ستاسو درجه د B درجه ده "+not+".ستاسو نمره ده");}
            else if (not >= 50 && not <= 70) {System.out.println("ستاسو درجه د C درجه ده "+not+".ستاسو نمره ده");}
            else if (not >= 0 && not <= 50){System.out.println("ستاسو درجه د D درجه ده "+not+".ستاسو نمره ده");}
            else {System.out.println("تاسو رد شوي یاست "+not+".ستاسو نمره ده");}

        }
    }
}