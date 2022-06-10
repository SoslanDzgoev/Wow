package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Мартин Мартин", 22));
        members.add(new MusicArtist("Мартин Мартин2", 33));
        members.add(new MusicArtist("Мартин Мартин3", 44));
        members.add(new MusicArtist("Мартин Мартин4", 55));
        MusicBand band1 = new MusicBand("Jack", 1999, members);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Фридрих5", 22));
        members2.add(new MusicArtist("Фридрих6", 33));
        members2.add(new MusicArtist("Фридрих7", 44));
        members2.add(new MusicArtist("Фридрих8", 55));
        MusicBand band2 = new MusicBand("Joe", 2000, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
