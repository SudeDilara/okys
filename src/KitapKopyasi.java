public class KitapKopyasi {
    private int kopyaId;
    private String durum; // "Rafta", "Ödünçte" vb.
    private Kitap kitap; // Kitap sınıfı ile ilişki (Composition/Association)

    public KitapKopyasi(int kopyaId, String durum, Kitap kitap) {
        this.kopyaId = kopyaId;
        this.durum = durum;
        this.kitap = kitap;
    }

    public int getKopyaId() { return kopyaId; }
    public String getDurum() { return durum; }
    public void setDurum(String durum) { this.durum = durum; }
    public Kitap getKitap() { return kitap; }
}