package perpustakaan;

public class BukuDipinjam extends Buku{
    public BukuDipinjam(String judul,int lama) {
        super(judul);
        this.lama=lama;
    }

    public int lama;
    
    // public BukuDipinjam(int lama) {
    //     this.lama = lama;
    // }
}
