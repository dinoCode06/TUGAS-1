
/*Nama  : Aldino Jonathan 
  Nim   : 13020240089 
  Kelas : A3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.Console;

public class Bacakar {
/**
* @param args
* @throws IOException
*/
public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
/* Kamus */
char cc; int bil;
InputStreamReader isr = new
InputStreamReader(System.in);
BufferedReader dataIn = new BufferedReader(isr);
// atau
BufferedReader datAIn = new BufferedReader(new
InputStreamReader(System.in));
/* Algoritma */
System.out.print ("hello\n");
System.out.print("baca 1 karakter : ");
//perintah baca karakter cc
cc =dataIn.readLine().charAt(0);
System.out.print("baca 1 bilangan : ");
//perintah baca bil
bil =Integer.parseInt(datAIn.readLine());
/*String kar = JOptionPane.showInputDialog("Karakter 1
: "); System.out.println(kar);*/
//JOptionPane.showMessageDialog(null,"hello");
System.out.print (cc +"\n" +bil+"\n");
System.out.print ("bye \n");

/* Tambahkan program membaca/input data
menggunakan Class Scanner, Class Console dan Class
JOptionPane */

// ==================== SCANNER ====================
Scanner sc = new Scanner(System.in);
System.out.print("Input karakter (Scanner): ");
char cc2 = sc.next().charAt(0);
System.out.print("Input bilangan (Scanner): ");
int bil2 = sc.nextInt();
System.out.println("Hasil Scanner: " + cc2 + " " + bil2);

// ==================== CONSOLE ====================
Console cons = System.console();
if (cons != null) {
    String kar3 = cons.readLine("Input karakter (Console): ");
    String bil3 = cons.readLine("Input bilangan (Console): ");
    System.out.println("Hasil Console: " + kar3 + " " + bil3);
} else {
    System.out.println("Console tidak tersedia (biasanya di IDE)");
}

// ==================== JOPTIONPANE ====================
String kar4 = JOptionPane.showInputDialog("Input karakter (JOptionPane): ");
String bil4 = JOptionPane.showInputDialog("Input bilangan (JOptionPane): ");
JOptionPane.showMessageDialog(null, "Hasil JOptionPane: " + kar4 + " " + bil4);

}
}