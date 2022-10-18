package Clothes.src;

import Clothes.src.Footwear.NikeFootwear;
import Clothes.src.Jackets.GucciJacket;
import Clothes.src.Trousers.BalmainTrousers;

public class Man implements ManIn{
    private String name;
    private GucciJacket jacket;
    private NikeFootwear footwear;
    private BalmainTrousers trousers;


    public Man(String name, GucciJacket jacket, NikeFootwear footwear, BalmainTrousers trousers){
        this.name = name;
        this.jacket = jacket;
        this.footwear = footwear;
        this.trousers = trousers;
    }
    public Man(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public BalmainTrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(BalmainTrousers trousers) {
        this.trousers = trousers;
    }

    public GucciJacket getJacket() {
        return jacket;
    }

    public void setJacket(GucciJacket jacket) {
        this.jacket = jacket;
    }

    public NikeFootwear getFootwear() {
        return footwear;
    }

    public void setFootwear(NikeFootwear footwear) {
        this.footwear = footwear;
    }
    @Override
    public void ClouthOn() {
        footwear.footwear_on();

        jacket.jacket_on();

        trousers.trousers_on();


    }

    @Override
    public void ClouthOff() {
        footwear.footwear_off();
        jacket.jacket_off();
        trousers.trousers_off();
    }

    public static void main(String[] args) {
       GucciJacket gucciJacket = new GucciJacket();
       NikeFootwear nikeFootwear = new NikeFootwear();
       BalmainTrousers balmainTrousers = new BalmainTrousers();
       Man man = new Man("Joe", gucciJacket, nikeFootwear, balmainTrousers);
       String manName = man.getName();
       System.out.println(manName);
       //man.ClouthOn();
        man.ClouthOff();



    }
}
