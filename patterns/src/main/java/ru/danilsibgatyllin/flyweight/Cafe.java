package ru.danilsibgatyllin.flyweight;

public class Cafe {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        TeaShop teaShop = new TeaShop(teaMaker);

        teaShop.takeOrder("Indian",1);
        teaShop.takeOrder("Asian",2);

        teaShop.serve();
    }
}
