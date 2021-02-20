/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119056.irfanginanjar.pkg4;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class UASIF210119056IRFANGINANJAR4 {

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * TANGGAL  : 20-02-2021
 * NO SOAL  : 4
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String nama,warga,tujuan;
        
        System.out.print("Nama :");
        nama=input.nextLine();
        System.out.print("Kewarganegaraan :");
        warga=input.nextLine();
        System.out.print("Tujuan Wisata :");
        tujuan=input.nextLine();
        
        System.out.println("APLIKASI PENDATAAN WISATAWAN");
        System.out.println("============================");
        System.out.println("Nama :"+nama);
        System.out.println("Kewarganegaraan :"+warga);
        System.out.println("Tujuan Wisata :"+tujuan);
    }
    
}
