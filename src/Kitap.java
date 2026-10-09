public class Kitap {
 private String isbn;
    private String kitapAdi;
    private String yazar;

    public Kitap(String isbn, String kitapAdi, String yazar) {
        this.isbn = isbn;
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
    }

    public String getIsbn() { return isbn; }
    public String getKitapAdi() { return kitapAdi; }
    public String getYazar() { return yazar; }
}    

