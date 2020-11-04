package com.birds;

public class NonFlyingBirds extends Birds{
    public NonFlyingBirds(String feathers, int layEggs){
        super(feathers, layEggs);
    }
    @Override public void fly(){
        System.out.println("This bird can't fly");}

    @Override
    public String toSting() {
        return "The color of feather is " + super.feathers + " and can lay " + super.layEggs+ " eggs";
    }






}



