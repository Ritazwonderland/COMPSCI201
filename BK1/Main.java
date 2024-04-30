package BK1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Map Text:");
        Map mainMap = new Map();
        mainMap.fillArrayMap();
        /*
        mainMap.practiceFillMap();
        mainMap.printMapToConsole();
        System.out.println();
        mainMap.tiles[1].checkAndMove("down",mainMap);
        mainMap.printMapToConsole();
        System.out.println();
        8?
         */
        mainMap.playNTimes(1000);


    }
}