public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca  = 0;
    private double cena;

    String getNazwa() {
        return this.nazwa;
    }

    void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    String getData() {
        return this.data;
    }

    void setData(String data) {
        this.data = data;
    }

    String getMiejsce() {
        return this.miejsce;
    }

    void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    int getMaxLiczbaMiejsc() {
        return this.maxLiczbaMiejsc;
    }

    void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    int getDostepneMiejsca() {
        return this.dostepneMiejsca;
    }

    void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    double getCena() {
        return this.cena;
    }

    void setCena(double cena) {
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.setCena(cena);
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.setCena(cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.setCena(cena);
        this.data = data;
        this.miejsce = miejsce;
    }

    public String toString() {
        return this.nazwa + this.data + this.miejsce;
    }

    public void zarezerwujMiejsce() {
        this.dostepneMiejsca++;
    }


}
