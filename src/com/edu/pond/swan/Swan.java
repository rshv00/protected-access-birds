package com.edu.pond.swan;

import com.edu.pond.shore.Bird;


public class Swan extends Bird
{
    public void swim()
    {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim()
    {
        Swan swan = new Swan();
        swan.floatInWater();
        System.out.println(swan.text);
    }

    public void helpOtherBirdSwim()
    {
        Bird other = new Swan();
        // other.floatInWater(); // does not compile
        // System.out.println(other.text); // does not compile
    }
}
