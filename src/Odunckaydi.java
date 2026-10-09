import java.util.Date;

public class Odunckaydi {
    private int islemId;
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;
    private Date alisTarihi;
    private Date teslimTarihi;

    public Odunckaydi(int islemId, Kullanici kullanici, KitapKopyasi kitapKopyasi, Date alisTarihi) {
        this.islemId = islemId;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.alisTarihi = alisTarihi;
        this.kitapKopyasi.setDurum("Oduncte");
    }

    public static void main(String[] args) {
        Kitap k1 = new Kitap("975-05", "Yaban", "Yakup Kadri");
        KitapKopyasi kopya1 = new KitapKopyasi(101, "Rafta", k1);
        Kullanici u1 = new Kullanici(1, "Sude Dilara", "sude@mail.com");

        Odunckaydi odunc = new Odunckaydi(1, u1, kopya1, new Date());

        System.out.println("--- Odunc Islemi Basarili ---");
        System.out.println("Kullanici: " + u1.getAdSoyad());
        System.out.println("Kitap: " + kopya1.getKitap().getKitapAdi());
        System.out.println("Kopya ID: " + kopya1.getKopyaId());
        System.out.println("Kitap Durumu: " + kopya1.getDurum());
    }
}
