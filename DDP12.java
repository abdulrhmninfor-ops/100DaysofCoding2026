import java.util.Scanner;
public class DDP12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Barang: ");
        String barang = input.nextLine();
        
        System.out.print("Harga satuan: ");
        short hargaPcs = input.nextShort();
        
        System.out.print("Jumlah beli: ");
        int Qty = input.nextInt();
        
        
        System.out.print("harga satuan: ");
        short  hargaSatuan= input.nextShort();
        
        System.out.print("jumlah dibeli : ");
        int jumlahDibeli = input.nextInt();
        
        
        System.out.print("uang bayar: ");
        long uangBayar = input.nextLong();
        
        System.out.print("total bayar : ");
        long totalHarga = input.nextLong();
        
        
    
        System.out.println("==================================");
        System.out.println("\t RESI BELANJA");
        System.out.println("==================================");
        System.out.println("Barang \t\t:" + barang);
        System.out.println("harga/pcs \t:Rp" + hargaPcs);
        System.out.println("Qty \t\t:" + Qty);
        System.out.println("-----------------------------------");
        
        System.out.println("Total harga \t:Rp" + (hargaSatuan*jumlahDibeli));
        System.out.println("Uang bayar \t:Rp" + uangBayar);
        System.out.println("kembalian \t:Rp" + (uangBayar-totalHarga));
        System.out.println("==================================");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
