package day12.task4;

import day12.task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist members : a.getMembers())
            b.getMembers().add(members);
        a.getMembers().clear();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name=" + name +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

}
