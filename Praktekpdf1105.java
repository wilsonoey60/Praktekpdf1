import java.util.Scanner;
import java.io.*;
class Praktekpdf1105 {
  public static void main(String[ ] args) {
    Scanner Celsius = new Scanner(System.in);
    System.out.print("Celsius =");
    double celsius = Celsius.nextInt();
    double fahrenheit = ((celsius*9/5)+32);
    System.out.println("Fahrenheit =" +fahrenheit);        
  }
}