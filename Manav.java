/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manav;

import java.util.Scanner;

/**
 *
 * @author Emre
 */
public class Manav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Armut Kaç Kilo ? : ");
        armut=input.nextDouble();
        toplam+=(armut*2.14);
        System.out.print("Elma Kaç Kilo ? : ");
        elma=input.nextDouble();
        toplam+=(elma*3.67);
        System.out.print("Domates Kaç Kilo ? : ");
        domates=input.nextDouble();
        toplam+=(domates*1.11);
        System.out.print("Muz Kaç Kilo ? : ");
        muz=input.nextDouble();
        toplam+=(muz*0.95);
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican=input.nextDouble();
        toplam+=(patlican*5);
        
        System.out.println("Toplam Tutar : "+toplam+" TL");
    }
    
}
