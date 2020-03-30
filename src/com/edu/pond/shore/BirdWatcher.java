package com.edu.pond.shore;

import com.edu.pond.swan.Swan;


public class BirdWatcher
{
    public void watchBird()
    {
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);

        Swan swan = new Swan();
        swan.floatInWater();
        System.out.println(swan.text);
    }
}
