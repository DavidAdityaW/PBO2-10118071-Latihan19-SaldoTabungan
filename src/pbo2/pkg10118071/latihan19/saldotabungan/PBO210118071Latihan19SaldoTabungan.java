/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan19.saldotabungan;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     perhitungan saldo tabungan   
 * 
 */
public class PBO210118071Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        // variabel untuk menyimpan input dari user
        int saldoAwal, saldo, bunga, lama;
        
        System.out.print("Saldo Awal \t : Rp. ");
        saldoAwal = input.nextInt();
        System.out.print("Bunga/Bulan(%) \t : ");
        bunga = input.nextInt();
        System.out.print("Lama(Bulan) \t : ");
        lama = input.nextInt();
        
        saldo = saldoAwal * bunga / 100 + saldoAwal;
        System.out.println();
        
        for (int i = 1; i <= lama; i++) {
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldo);
            saldo = saldo * bunga / 100 + saldo;
        }
    }
    
}
