/**
 * Created by lucek on 04.10.2016.
 */
public class Niedoswiadczony extends Pracownik {

    public Niedoswiadczony(String imie, String nazwisko, int stazPracy){
        super(imie,nazwisko,stazPracy);

    }

    public String getInfo(){
        return "niedoświadczony";
    }


}
