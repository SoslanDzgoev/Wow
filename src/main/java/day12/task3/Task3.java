package day12.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("Группа", 1992);
        MusicBand musicBand2 = new MusicBand("Группа2", 1993);
        MusicBand musicBand3 = new MusicBand("Группа3", 1994);
        MusicBand musicBand4 = new MusicBand("Группа4", 1995);
        MusicBand musicBand5 = new MusicBand("Группа5", 1996);

        MusicBand musicBand6 = new MusicBand("Группа6", 2006);
        MusicBand musicBand7 = new MusicBand("Группа7", 2007);
        MusicBand musicBand8 = new MusicBand("Группа8", 2008);
        MusicBand musicBand9 = new MusicBand("Группа9", 2009);
        MusicBand musicBand10 = new MusicBand("Группа10", 2010);

        List<MusicBand> list = new ArrayList<>();
        list.add(musicBand);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);
        list.add(musicBand10);
        System.out.println(list);
        System.out.println(groupsAfter2000(list));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(p -> p.year < 2000).collect(Collectors.toList());
    }
}
