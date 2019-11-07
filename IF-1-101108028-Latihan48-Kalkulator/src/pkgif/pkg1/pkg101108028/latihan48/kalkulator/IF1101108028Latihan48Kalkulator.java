/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg101108028.latihan48.kalkulator;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Kalkulator

 */
public class IF1101108028Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        
        //output
        System.out.println("VALUE 1 = " + calc.getValue1());
        System.out.println("VALUE 2 = " + calc.getValue2());
        calc.setNameProject();
        calc.setNoteProject("This Project shown you how to manage method in java");
        System.out.println("Result Add is = " + calc.add(calc.getValue1(),calc.getValue2()));
        System.out.println("Result Minus is = " + calc.minus(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Multiple is = " + calc.multiplication(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Division is = " + calc.division(calc.getValue1(), calc.getValue2()));
    }
    
}
