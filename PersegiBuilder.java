class PersegiBuilder {
    private double sisi;

    public PersegiBuilder setSisi(double sisi) {
        this.sisi = sisi;
        return this;
    }

    public Persegi build() {
        return new Persegi(sisi);
    }
}