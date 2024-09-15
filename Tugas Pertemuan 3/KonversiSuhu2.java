/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KonversiSuhu;

/**
 *
 * @author iilha
 */
class KonversiSuhu2 extends KonversiSuhu1 {
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celciusToReamur(celcius);
    }
}