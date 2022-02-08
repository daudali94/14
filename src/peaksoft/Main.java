package peaksoft;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    Class class1 = new Class(2,"soz",new int[] {1,2,3,4,5,6,7,8,9});
    System.out.println(class1.getNomer()+" "+class1.getSoz()+" "+ Arrays.toString(class1.getMassiv()));
    }
}
