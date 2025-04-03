public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
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
        this.maxLiczbaMiejsc = 100;
    }

    int getDostepneMiejsca() {
        return this.dostepneMiejsca;
    }

    void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = 0;
    }

    double getCena() {
        return this.cena;
    }

    void setCena(double cena) {
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }


}
