package Materi_Class;

import java.io.*;

public class Tambah {
    private Integer pilih;
 
    public void proses()throws IOException{
        int bill=0,
            bil2=0,
            hasil=0;
        
        DataInputStream in = new DataInputStream(System.in);
        
        try {
            System.out.println("Masukan Bilangan 1 = ");
            bill = Integer.valueOf(in.readLine());
            
            System.out.println("Masukan Bilangan 2 = ");
            bil2 = Integer.valueOf(in.readLine());
            
                      
            hasil = bill + bil2;
            
        }
        catch (Exception e) {}
        System.out.println("Tambah Kedua Bilangan = " + hasil);
        System.out.println("============================");        
        System.out.println("=====Menu Program=====");
          System.out.println("======================");
          System.out.println("1. Proses Tambah      ");
          System.out.println("2. Proses Kurang      ");
          System.out.println("3. Proses Kali        ");
          System.out.println("4. Proses Bagi        ");
          System.out.println("======================");
          
          try{
             System.out.println("Masukan Pilihan       ");
             pilih = Integer.valueOf(in.readLine());
          }
          
          catch(IOException err){}
          
          switch(pilih){
              case 1 :
              System.out.println("======================");
              System.out.println("1. Proses Tambah      ");
              System.out.println("======================");
              Tambah penjumlahan = new Tambah();
              penjumlahan.proses();
              break;
            
              case 2 :
              System.out.println("======================");
              System.out.println("2. Proses Kurang      ");
              System.out.println("======================");
              Kurang pengurangan = new Kurang();
              pengurangan.proses();
              break;  
               
              case 3 :
              System.out.println("======================");
              System.out.println("3. Proses Kali      ");
              System.out.println("======================");
              Kali perkalian = new Kali();
              perkalian.proses();
              break;   
                  
              case 4 :
              System.out.println("======================");
              System.out.println("4. Proses Bagi      ");
              System.out.println("======================");
              Bagi pembagian = new Bagi();
              pembagian.proses();
              break;    
        }
    }

}

