public class Kullanici {
    private int kullaniciId;
    private String adSoyad;
    private String eposta;

    public Kullanici(int kullaniciId, String adSoyad, String eposta) {
        this.kullaniciId = kullaniciId;
        this.adSoyad = adSoyad;
        this.eposta = eposta;
    }

    public int getKullaniciId() { return kullaniciId; }
    public String getAdSoyad() { return adSoyad; }
    public String getEposta() { return eposta; }
}