package ru.danilsibgatyllin.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaShop {
    private TeaMaker teaMaker;
    private Map<Integer,Tea> order;

    public TeaShop(TeaMaker teaMaker) {
        this.teaMaker = teaMaker;
        order=new HashMap<>();
    }

    public void takeOrder(String teaName,Integer table){
        this.order.put(table,teaMaker.makeTea(teaName));
    }

    public void serve(){
        order.forEach((table, tea) -> System.out.println("Serve table " + table + " tea name" + tea.getTeeName()));
    }
}
