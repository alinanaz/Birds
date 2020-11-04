package com.birds;

public class FlyingBirds extends Birds {
public FlyingBirds(String feathers, int layEggs){
    super(feathers, layEggs);
}
    @Override
    public void fly() {
        System.out.println ("This bird can fly");}

    @Override
    public String toSting() {
        return "The color of feather is " + super.feathers + " and can lay " + super.layEggs + " eggs ";
    }


}
