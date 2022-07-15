package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("HUDhsdfu",1996);
        MusicBand band2 = new MusicBand("HUDfdsfu",1995);
        MusicBand band3 = new MusicBand("HUDhufd",1993);
        MusicBand band4 = new MusicBand("HUDfdshu",1991);
        List bandMus = new ArrayList<>();
        bandMus.add(band1);
        bandMus.add(band2);
        bandMus.add(band3);
        bandMus.add(band4);
        groupsAfter2000(bandMus);
        System.out.println(groupsAfter2000(bandMus));


    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> musicBands) {
//        musicBands.add(new MusicBand("Hdwudh",2007));
//        musicBands.add(new MusicBand("Hdwudx",1976));
//        musicBands.add(new MusicBand("Hdwudf",1960));
//        musicBands.add(new MusicBand("Hdwudw",2018));

        return musicBands;
    }
}
