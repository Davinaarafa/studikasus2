/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Latihanpbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner inp = new Scanner (System.in);
       int a=0, total=0, bil=7;
       while (bil!=0 ){
           a++;
           System.out.print(" Masukan bilangan ke-"+a+" : ");
           bil = inp.nextInt();
           total += bil;
           
       }
        System.out.print(" Total jumlah "+(a-1)+" bilangan : ");
        System.out.println(total);

        
    }
    
}