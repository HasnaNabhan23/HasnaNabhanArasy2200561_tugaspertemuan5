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

//fungsi untuk menampilkan banyaknya bilangan ganjil dari batasAwal dan batasAkhir yang diinput
public class nomor2 {
    static int jumBilGanjil(int a,int b){ 
        int jumlah = 0;
        for(int i = a;i<=b;i++) {
            if(i % 2 == 1){
                jumlah = jumlah + 1;
            }
        }
        return jumlah;
    }
    
    public static void main(String[] Args) {
       
        //deklarasi
        Scanner keyboard = new Scanner(System.in);
        int batasAwal,batasAkhir;

        //input data
        System.out.print("masukan batas awal : ");
        batasAwal = keyboard.nextInt();
        System.out.print("masukan batas akhir : ");
        batasAkhir = keyboard.nextInt();

        //output
        System.out.println("Jumlah bilangan ganjil yaitu "+jumBilGanjil(batasAwal, batasAkhir));
    } 
}
