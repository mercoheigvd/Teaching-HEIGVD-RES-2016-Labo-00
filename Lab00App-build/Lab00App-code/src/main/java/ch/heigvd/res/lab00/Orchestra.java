package ch.heigvd.res.lab00;

import javax.management.Query;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Romain on 02.03.2016.
 */
public class Orchestra {
    LinkedList<IInstrument> instruments;

    public Orchestra(){
        instruments = new LinkedList();
    }

    public int getNumberOfInstruments() {
        return instruments.size();
    }

    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }

    public List<String> makeMusic() {
        List<String> music = new LinkedList();

        for(IInstrument i : instruments){
            music.add(i.play());
        }

        return music;
    }
}
