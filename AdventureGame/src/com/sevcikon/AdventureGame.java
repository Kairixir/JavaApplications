package com.sevcikon;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureGame {
    private static Map<Integer, Locations> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> temporaryExit = new HashMap<>();

        locations.put(0, new Locations(0, "A giant troll appears and smashes your face with his club",temporaryExit));

        temporaryExit = new HashMap<String , Integer>();
        temporaryExit.put("N", 5);
        temporaryExit.put("S", 4);
        temporaryExit.put("E", 3);
        temporaryExit.put("W", 2);
        locations.put(1, new Locations(1, "You are standing at the end of a road before a small brick building",temporaryExit));
        temporaryExit = new HashMap<String , Integer>();
        temporaryExit.put("N", 5);
        locations.put(2, new Locations(2, "You are at a top of the hill",temporaryExit));
        temporaryExit = new HashMap<String , Integer>();
        temporaryExit.put("W", 1);
        locations.put(3, new Locations(3, "You are inside a building, a well house for a small spring",temporaryExit));
        temporaryExit = new HashMap<String , Integer>();
        temporaryExit.put("E", 2);
        locations.put(4, new Locations(4, "You are in a valley beside a small stream",temporaryExit));
        temporaryExit = new HashMap<String , Integer>();
        temporaryExit.put("W", 2);
        temporaryExit.put("S", 1);
        locations.put(5, new Locations(5, "You are in the forest",temporaryExit));
        temporaryExit = new HashMap<String , Integer>();
        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int loc = 1;
        while (true) {

            System.out.println(locations.get(loc).getDescription());
            temporaryExit.remove("S");
//            System.out.println(exits.keySet());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");

            for (String exit : exits.keySet()) {
                                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();

            if (direction.length()>1){
                String[] words = direction.split(" ");
                    for (String word : words) {
                        if (vocabulary.containsKey(word)) {
                        direction=vocabulary.get(word);
                        break;
                        }
                    }
                }

            if (exits.containsKey(direction)) {
                loc=exits.get(direction);

            }else{
                System.out.println("You cannot go in that direction");

        }
    }

    }


}
