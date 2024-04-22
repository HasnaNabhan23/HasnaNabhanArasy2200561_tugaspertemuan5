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

//prosedur untuk menuliskan hasil penjumlahan deret tambah
public class nomor1 {
    static void deret(int nilaiN){
        int hasil =0;
        
        //proses
        for(int i = 1;i<=nilaiN;i++){
            hasil = hasil + i;
            System.out.print(i+" ");
            if(i != nilaiN){
                System.out.print("+ ");
            }
        }
        //output
        System.out.println("= "+hasil);
    }

    public static void main(String[] args) {
        
        //deklarasi
        Scanner keyboard = new Scanner(System.in);
        int n;

        //input data
        System.out.print("Masukan nilai N : ");
        n = keyboard.nextInt();

        //pemanggil prosedur
        deret(n);
    }
}
    
