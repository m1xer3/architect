package ru.danilsibgatyllin.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;


public class StationList{

    protected List<RadioStation> stations = new ArrayList<>();

    protected Integer counter =0;

    public void addStation (RadioStation station){
        stations.add(station);
    }

    public void removeStation(RadioStation station){
        this.stations.stream()
                .filter(stationInStream -> stationInStream.equals(station))
                .forEach(stationInStream -> stations.remove(stationInStream));
    }

    public Integer count(){
        return stations.size();
    }

    public RadioStation current(){
        return stations.get(counter);
    }

    public Integer key(){
        return this.counter;
    }

    public void next(){
        this.counter++;
    }

    public void rewind(){
        this.counter=0;
    }

    public boolean valid(){
        return stations.get(counter)!=null;
    }

}
