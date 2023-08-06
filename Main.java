public class Main {
    public static void main(String[] args) {
        // Membangun objek Persegi dengan Builder
        Persegi persegi = new PersegiBuilder()
            .setSisi(5.0)
            .build();

        // Membangun objek Segitiga dengan Builder
        Segitiga segitiga = new SegitigaBuilder()
            .setAlas(6.0)
            .setTinggi(4.0)
            .setSisiA(5.0)
            .setSisiB(5.0)
            .setSisiC(7.0)
            .build();

        // Menggunakan objek Persegi dan Segitiga yang sudah dibangun
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
