package pbo;

import java.util.Scanner;

public class ContainerBeraksi {
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);
    ContainerInfo[] containers = new ContainerInfo[1];
    
    for (int i = 0; i < containers.length; i++){
        try {
        System.out.println("");
        System.out.println("Masukkan data container ke-" + (i+1));
            System.out.println("HURUF BESAR");

        System.out.print("Apa isi Box Container : ");
            String isiBox = scanner.nextLine();
            
        System.out.println("a. CK = 20.000 KG");
        System.out.println("b. CS = 27.000 KG");
        System.out.println("c. CB = 30.000 KG");
        System.out.print("Kode Berat Box        : ");
            String berat = scanner.nextLine();
            
        System.out.println("a.HY = HYUNDAI");
        System.out.println("b.DO = DONFANG");
        System.out.println("c.HA = HAMBURG");
            System.out.print("Merk Container    : ");
            String merk = scanner.nextLine();
            
        System.out.print("Warna : ");
            String warna = scanner.nextLine();
            
            containers[i] = new ContainerInfo(isiBox, merk, berat, warna);
        } finally {
                System.out.println("PENGISIAN FORM BOX CONTAINER SUKSES");
                  }
        }
    
    for (int i = 0; i < containers.length; i++) {
            System.out.println("");
            System.out.println("==============================");
            System.out.println("Data Container ke-" + (i+1));
            System.out.println(containers[i].tampilanInfo());

            System.out.println("Kode Box   : " +containers[i].getKodeIsiBox());
            System.out.println("Kode Merk  : " +containers[i].getKodemerk());
            System.out.println("Berat Box  : " +containers[i].getKodeBerat());
            System.out.println("Kode Box   : " +containers[i].getWarna());
            
            System.out.println("Kode Kontainer Untuk Pengiriman : "+containers[i].getKodeIsiBox()+containers[i].getKodemerk()+containers[i].getWarna());    
            System.out.println("==============================");
    }
    
        System.out.println("#SUKSES#");    
    }       
}
