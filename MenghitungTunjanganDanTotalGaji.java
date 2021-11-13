
import java.util.Scanner;

/*
 * Tugaslabpbo
 */

/**
 *
 * @author Raisulwathan_2008107010081
 *         Muhammad Suhail Haritsah_2008107010079
 */
public class MenghitungTunjanganDanTotalGaji {

    /**
     * @param args  command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Input = new Scanner (System.in);
        
        String Status;
        String Jabatan;
        
        int Gaji_Pokok;
        int Tunjangan_Status;
        int Tunjangan_Anak;
        int Anak;
        int Tunjangan_Khusus;
        
        System.out.println("Masukkan Jabatan Anda = ");
        Jabatan = Input.nextLine();
        
        System.out.println("Masukkan Status Anda = ");
        Status = Input.nextLine();
        
        System.out.println("Masukkan Jumlah Anak Anda = ");
        Anak = Input.nextInt();
        
        //jabatan
        if (Jabatan.equals("Manager")) {
        Gaji_Pokok = 1500000;
        
    }   else if (Jabatan.equals("Sekretaris")) {
        Gaji_Pokok = 1100000;
        
    }   else if (Jabatan.equals("Bendahara")) {
        Gaji_Pokok = 900000;
        
    }   else if (Jabatan.equals("Personal")){
        Gaji_Pokok = 700000;
        
    }   else {
        Gaji_Pokok = 600000;
    }
        //Status
        if (Status.equals("Kawin")){
        Tunjangan_Status = Gaji_Pokok * 10 / 100;
        
    }   else {
        Tunjangan_Status = 0;
    }
        //Anak
        if (Anak == 1) {
        Tunjangan_Anak = Gaji_Pokok * 2 / 100;
        
    }   else if (Anak == 2){
        Tunjangan_Anak = Gaji_Pokok * 4 / 100;
        
    }   else if (Anak > 3){
        Tunjangan_Anak = Gaji_Pokok * 7 / 100;
        
    }   else {
        Tunjangan_Anak = 0;
    }
        //Tunjangan Khusus
        if (Jabatan.equals("Manager")){
        Tunjangan_Khusus = Gaji_Pokok * 20 / 100;
        
    }   else {
        Tunjangan_Khusus = 0;
        
        
    }
        int Total_Gaji = Gaji_Pokok + Tunjangan_Status + Tunjangan_Anak + Tunjangan_Khusus;
        System.out.println("Total Gaji Anda Adalah = " + Total_Gaji);
        
        
        
        
        
       
    }
    
}
