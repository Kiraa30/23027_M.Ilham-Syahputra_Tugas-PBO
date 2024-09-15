/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KonversiSuhu;

/**
 *
 * @author iilha
 */
public class DemoKonversiSuhu {
public static void main(String[] args) {
        KonversiSuhu1 konversiSuhu1 = new KonversiSuhu1();
        
        double suhuCelcius = 100;
        double fahrenheit = konversiSuhu1.celciusToFahrenheit(suhuCelcius);
        double reamur = konversiSuhu1.celciusToReamur(suhuCelcius);
        
        System.out.println("Suhu dalam Celcius: " + suhuCelcius);
        System.out.println("Konversi ke Fahrenheit: " + fahrenheit);
        System.out.println("Konversi ke Reamur: " + reamur);
        
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();
        
        double suhuFahrenheit = 212;
        double reamurDariFahrenheit = konversiSuhu2.fahrenheitToReamur(suhuFahrenheit);
        
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Konversi ke Reamur: " + reamurDariFahrenheit);
    }
}