/**
 * Created by lucek on 04.10.2016.
 */
public class FabrykaPracownikow {

    public static Pracownik stworzPracownika(String imie, String nazwisko, int stazPracy){
        if (stazPracy<3){
            return new Niedoswiadczony(imie,nazwisko,stazPracy);
        }
        else return new Doswiadczony(imie,nazwisko,stazPracy);
    }
}
