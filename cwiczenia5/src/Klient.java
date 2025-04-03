import java.util.ArrayList;

public class Klient {

    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    String getImie() {
        return this.imie;
    }

    void setImie(String imie) {
        this.imie = imie;
    }

    String getNazwisko() {
        return this.nazwisko;
    }

    void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    String getEmail() {
        return this.email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    ArrayList<Wydarzenie> getListaRezerwacji() {
        return this.listaRezerwacji;
    }

    void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public Klient(String imie, String nazwisko, String email, ArrayList<Wydarzenie> listaRezerwacji) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = listaRezerwacji;
    }


}
