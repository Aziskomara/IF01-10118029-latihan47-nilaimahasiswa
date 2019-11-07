/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan nilai mahasiswa
 */
public class IF0110118029Latihan47Nilaimahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        
        nilai nilai = new nilai();
        
        System.out.print("QUIZ : ");
        nilai.setQuis(scanner1.nextDouble());
        System.out.print("UTS : ");
        nilai.setUts(scanner2.nextDouble());
        System.out.print("UAS : ");
        nilai.setUas(scanner3.nextDouble());
        
        System.out.println("");
        System.out.println("Nilai Akhir = "+nilai.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
    }
    
}
