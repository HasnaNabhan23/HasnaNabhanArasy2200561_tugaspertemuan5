/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */

////prosedur untuk menuliskan hasil penjumlahan deret kali
public class nomor3 {
    static void perkalianN(int nilaiN){
        
        //deklarasi
        int hasil = 1;

        // Proses
       System.out.print(nilaiN+"! = ");
       for(int i=nilaiN;i>0;i--){
           hasil = hasil * i;
           System.out.print(i+" ");
           if(i > 1){
               System.out.print("* ");
           }
       }

       //output
       System.out.println("= "+hasil);
    }
    
    public static void main(String[] args) {
        
       // deklarasi variabel
       Scanner keyboard = new Scanner(System.in);
       int n;

       System.out.println("SOAL NOMOR 3 : MENGHITUNG N!");

       // input data
       System.out.print("Input nilai n : ");
       n = keyboard.nextInt();

       //panggil prosesdur
       perkalianN(n);
    }
}
