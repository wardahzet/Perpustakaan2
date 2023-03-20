package perpustakaan;

import java.util.ArrayList;

public class PeminjamanManager {
    public void save(ArrayList<BukuDipinjam> bukuDipinjamCollection) {
        Peminjaman peminjaman = new Peminjaman();
        for (BukuDipinjam bukuDipinjam : bukuDipinjamCollection) {
            peminjaman.daftarBuku.add(bukuDipinjam);
        }
    }
}
