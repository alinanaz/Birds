package com.birds;

public class Appl {
    public static void main(String[] args) {

        Birds eagle = new FlyingBirds("brown ",3);

        Birds swallow = new FlyingBirds("grey ",5);

        Birds chicken = new NonFlyingBirds("black ", 1);

        Birds penguin = new NonFlyingBirds("black and white ", 2);


   String[] birds = {"eagle", "swallow", "chicken","penguin"};
    for (int i = 0; i < 4; i ++)
        System.out.println(birds[i]);


        System.out.println( eagle.toSting());
        eagle.fly();
        System.out.println(swallow.toSting());
        swallow.fly();
        System.out.println( chicken.toSting());
        chicken.fly();
        System.out.println( penguin.toString());
        penguin.fly();
    }}

