package perpustakaan;

import java.util.ArrayList;

public class PeminjamanController {
    
    public void showFormPeminjaman() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }

    public void cariBuku(String buku) {
        
    }

    @SuppressWarnings("unchecked")
    public void pinjam(ArrayList<BukuDipinjam> bukuDipinjam) {
         
    }
    
}
