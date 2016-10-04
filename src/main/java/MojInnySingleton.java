/**
 * Created by lucek on 04.10.2016.
 */
public class MojInnySingleton {
    private static final MojInnySingleton INSTANCE=new MojInnySingleton();
    public static MojInnySingleton getInstance() {return INSTANCE;}

    private MojInnySingleton(){};
}
