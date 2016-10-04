/**
 * Created by lucek on 04.10.2016.
 */
public class Doswiadczony extends Pracownik  {

    public Doswiadczony(String imie, String nazwisko, int stazPracy){
        super(imie,nazwisko,stazPracy);
    }

    public String getInfo(){
        return "Doświadczony";
    }


}
