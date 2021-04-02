//Muhammad Reziq Darusman
//20090127
//2B
package Tugas;
import java.util.Scanner;
public class No1{
    public static void main ( String[]args){
        String data [] = {"Galileo, ","arcimedes, ", "khasarismi, ","aljabar, ", "Muhammad Reziq Darusman,","tesla"};
        String key;
        Scanner ketik = new Scanner(System.in);
        
        System.out.println("masukan data yang dicari");
        key = ketik.nextLine();
        System.out.println();
        
        System.out.print ("isi data adalah: ");
        for (int i=0; i< data.length; i++){
            System.out.print(data [i] + " ");
        }
        System.out.println ("");
        for (int i =0; i<= data.length; i++) {
            if (key.equalsIgnoreCase (data[i])){
                System.out.print ("data "+key+" berada pada indeks ke "+ i);
                break;
            }
        }
        System.out.println ("\n");
        System.out.println();
        
    }
}

