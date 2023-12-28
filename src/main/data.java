package main;

import java.util.Random;

public class data {
    public static Random rand=new Random();
    public static int r;
    public static int i1=0;
    public static int i2=0;
    public static int get(){
        String t1= ui.t1.getText();
        String t2= ui.t2.getText();
        i1= Integer.parseInt(String.valueOf(t1));
        i2= Integer.parseInt(String.valueOf(t2));
        if (i2>=i1) {
            r= rand.nextInt(i2 - i1 + 1) + i1;
        }
        return  r;
    }
}
