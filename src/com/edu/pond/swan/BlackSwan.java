package com.edu.pond.swan;

public class BlackSwan extends Swan
{
    public void swim()
    {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherBlackSwanSwim()
    {
        BlackSwan blackSwan = new BlackSwan();
        blackSwan.floatInWater();
        System.out.println(blackSwan.text);
    }
}
