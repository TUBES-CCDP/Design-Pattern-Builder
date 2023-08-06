class SegitigaBuilder {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public SegitigaBuilder setAlas(double alas) {
        this.alas = alas;
        return this;
    }

    public SegitigaBuilder setTinggi(double tinggi) {
        this.tinggi = tinggi;
        return this;
    }

    public SegitigaBuilder setSisiA(double sisiA) {
        this.sisiA = sisiA;
        return this;
    }

    public SegitigaBuilder setSisiB(double sisiB) {
        this.sisiB = sisiB;
        return this;
    }

    public SegitigaBuilder setSisiC(double sisiC) {
        this.sisiC = sisiC;
        return this;
    }

    public Segitiga build() {
        return new Segitiga(alas, tinggi, sisiA, sisiB, sisiC);
    }
}
