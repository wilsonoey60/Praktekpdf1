import java.util.Scanner;
import java.io.*;
class Praktekpdf1205 {
  public static void main(String[ ] args) {
    Scanner Lingkaran = new Scanner(System.in);
    System.out.print("Jari-jari =");
    double phi = 3.14;
    double Jari = Lingkaran.nextInt();
    double Luas = (phi*Jari*Jari);
    System.out.println("Luas lingkaran =" +Luas);        
  }
}