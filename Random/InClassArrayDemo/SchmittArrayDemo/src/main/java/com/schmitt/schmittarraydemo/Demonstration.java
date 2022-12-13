package com.schmitt.schmittarraydemo;

public final class Demonstration
{
    public static void demo()
    {
        
        String[] names = {"Bill", "Susan", "Steven", "Jean"};
        double[] prices = {2.0, 2.55, 3.2, 1.23, 4.99, 2.22};
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
        
        int k = 0;
        
        while(k <= 10)
        {
            System.out.println(k);
            k++;
        }
        
        for (String x : names) {
            System.out.println(x); 
        }
        
        System.out.println("\n");
        int y = 0;
        
        while(y < names.length)
        {
            System.out.println(names[y]);
            y++;
        }
    }
}
