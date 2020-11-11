/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenghitungIpk;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class MenghitungIpk {
 public static void main (String[] args) {
     String nama, semester, jurusan;
     
     Scanner scanner = new Scanner (System.in);
     
     System.out.print("Nama : ");
     nama = scanner.nextLine ();
     System.out.print("Semester : ");
     semester = scanner.nextLine ();
     System.out.print("Jurusan : ");
     jurusan = scanner.nextLine ();
     System.out.print("Nilai OOP : ");
     int nilaioop = scanner.nextInt();
     System.out.print("Nilai Basis Data : ");
     int nilaibd = scanner.nextInt();
     System.out.print ("Nilai Jaringan Komputer : ");
     int nilaijk = scanner.nextInt ();
     
     int ip, totalnilaiimk;
     totalnilaiimk = nilaioop + nilaibd + nilaijk;
     ip = totalnilaiimk / 3;
     
     System.out.println("===================================");
     System.out.println("Nama : "+nama);
     System.out.println("Semester : "+semester);
     System.out.println("Jurusan : "+jurusan);
     System.out.println("Nilai OOP : "+nilaioop);
     System.out.println("Nilai Basis Data :"+nilaibd);
     System.out.println("Nilai Jaringan Komputer :"+nilaijk);
     System.out.println("Total Nilai Mata Kuliah :"+totalnilaiimk);
     System.out.println("Indeks Prestasi :"+ip);
     
     String predikat;
     if (ip > 81 && ip <100) {
         predikat = "&&";
     }
     
 }   
}
