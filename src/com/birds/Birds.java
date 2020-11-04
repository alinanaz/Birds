package com.birds;
public abstract class Birds {
    public abstract void fly();
    public abstract String toSting();
    public String feathers;
    public int layEggs;
    public Birds(String feathers, int layEggs){
        this.feathers =feathers;
        this.layEggs =layEggs;
    }

    public String getFeathers() {
        return feathers;
    }
    public void setFeathers(String feathers) {
        this.feathers = feathers;}
    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }


}

