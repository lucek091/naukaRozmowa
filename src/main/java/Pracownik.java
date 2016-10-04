/**
 * Created by lucek on 04.10.2016.
 */
public abstract class Pracownik {

    private String imie;
    private String nazwisko;
    private int stazPracy;

    public Pracownik(String imie, String nazwisko, int stazPracy){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.stazPracy=stazPracy;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public int getStazPracy(){
        return stazPracy;
    }

    public void setStazPracy(int lat){
        stazPracy+=lat;
    }

    public abstract String getInfo();
}
