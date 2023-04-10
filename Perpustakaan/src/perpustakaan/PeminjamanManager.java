package perpustakaan;

import java.util.ArrayList;

public class PeminjamanManager {
    Peminjaman peminjaman;
    
    PeminjamanManager(){
        peminjaman = new Peminjaman();
    }
    
    public boolean saves(ArrayList<BukuDipinjam> bukuDipinjamCollection) {
        if(bukuDipinjamCollection.size()+peminjaman.daftarBuku.size() <= 10) {
            for (BukuDipinjam bukuDipinjam : bukuDipinjamCollection) {
                if(bukuDipinjamCollection.contains(bukuDipinjam)) continue;
                peminjaman.daftarBuku.add(bukuDipinjam);
            }
            return true;
        }
        return false;
    }
}
