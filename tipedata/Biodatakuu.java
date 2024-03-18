/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipedata;

/**
 *
 * @author Huawei
 */
public class Biodatakuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nim = "2355201025";
        String nama = "Muhammad Hendra Satria";
        Double BB = 65.5;
        int umur = 19;
        char goldar = '0';
        boolean lakilaki = true;

        System.out.println("=============================");
        System.out.println("=          BIODATA          =");
        System.out.println("=============================");
        System.out.println("NIM         : " + nim);
        System.out.println("NAMA        : " + nama);
        System.out.println("BERAT BADAN : " + BB);
        System.out.println("UMUR        : " + umur);
        System.out.println("GOLDAR      : " + goldar);
        if (lakilaki == true) {
            System.out.println("GENDER      : Laki-Laki");
        }
    }

}
