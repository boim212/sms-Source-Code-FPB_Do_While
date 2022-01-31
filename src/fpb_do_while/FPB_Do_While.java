/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpb_do_while;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class FPB_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int nilai, angkaA, angkaB;
        Scanner input = new Scanner(System.in);
        
        
        
        do
        {
            System.out.print  ("Masukkan Integer A = ");
            angkaA = input.nextInt();
            System.out.print  ("Masukkan Integer B = ");
            angkaB = input.nextInt();
            System.out.println("");
        }
        while(angkaA <= 0 || angkaB <= 0);
        
        System.out.printf ("Nilai Awal A = %d B = %d %n",angkaA, angkaB);
            if (angkaA != angkaB)
            {
                while ( angkaA != angkaB)
                {
                    System.out.println("Karena A != B, Hitung Ulang A atau B");
                        if (angkaA > angkaB)
                        {
                            System.out.println("A Lebih Besar Daripada B, Maka hitung A = A - B ");
                            System.out.println("");
                            nilai = angkaA - angkaB;
                            angkaA = nilai;
                            System.out.printf  ("Nilai A = %d Nilai B = %d ", nilai,angkaB);
                            System.out.println("");
                        }
                        
                        else
                        {
                        System.out.println("B Lebih Besar Daripada A, Maka hitung B = B - A ");
                        System.out.println("");
                        nilai = angkaB - angkaA;
                        angkaB = nilai;
                        System.out.printf  ("Nilai A = %d Nilai B = %d ", angkaA, nilai);
                        System.out.println("");
                        }
                }
                angkaA = angkaB;
                nilai = angkaA;
                System.out.printf ("Nilai A = %d , NilaiB = %d %n", angkaA, angkaB);
                System.out.println("Jadi FPB A Dan B = " + nilai);
            }
            else
            {
                angkaA = angkaB;
                nilai = angkaA;
                System.out.printf ("Nilai A = %d , NilaiB = %d %n", angkaA, angkaB);
                System.out.println("Jadi FPB A Dan B = " + nilai);
            }
    }
}
