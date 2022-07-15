package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        MusicBand band1 = new MusicBand("geefseyf",1970, list);
        MusicBand band2 = new MusicBand("geyf",2000,list);
        band1.getMembers();


        MusicBand.transferMembers(band1,band2);
        System.out.println(band1);
        System.out.println(band2);
    }
}
