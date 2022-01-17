package ru.danilsibgatyllin.behavioral.iterator;

public class RadioApp {
    public static void main(String[] args) {

        StationList stationList = new StationList();

        stationList.addStation(new RadioStation(89f));
        stationList.addStation(new RadioStation(101f));
        stationList.addStation(new RadioStation(90f));
        stationList.addStation(new RadioStation(95f));


        System.out.println(stationList.current());
        System.out.println(stationList.current().getFrequency());
        stationList.next();
        stationList.next();
        System.out.println(stationList.current());
        System.out.println(stationList.current().getFrequency());

    }
}
