package Model;

import Interface.Salarie;

import java.util.ArrayList;
import java.util.List;

public class Equipe  implements Salarie {


    private final List<Salarie> listSalarie = new ArrayList<Salarie>();

    public Equipe(){}



    @Override
    public void work() {

        listSalarie.forEach( x -> x.work());

    }

    @Override
    public void meeting() {
        listSalarie.forEach( x -> x.meeting());
    }

    @Override
    public void deplacement() {
        listSalarie.forEach( x -> x.deplacement());
    }

    public List<Salarie> getListSalarie() {
        return listSalarie;
    }
}
