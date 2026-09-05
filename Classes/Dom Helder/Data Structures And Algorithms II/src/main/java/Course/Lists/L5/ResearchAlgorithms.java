package Course.Lists.L5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ResearchAlgorithms {
    static Scanner kIn = new Scanner(System.in);

    // q1
    void addName(ArrayList<String> names) {
        while (true) {
            System.out.println("Inform an name to add");
            String userInput = kIn.nextLine();
            if (userInput.equalsIgnoreCase("STOP")) return;
            names.add(userInput);
        }
    }

    // q2
    public void printList(ArrayList<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }

    // q3
    boolean sequentialSearch(ArrayList<String> names, String name) {
        for (String str : names) {
            if (str.equalsIgnoreCase(name)) return true;
        }
        return false;
    }

    //q4
    boolean BinarySearch(ArrayList<String> names, String name) {
        int p1 = 0;
        int p2 = names.size();
        int mid;

        Collections.sort(names);

        while (p1 < p2) {
            mid = (p1 + p2) / 2;
            int compareTo = names.get(mid).compareToIgnoreCase(name);

            if (compareTo == 0) {
                return true;
            } else if (compareTo < 0) {
                p1 = mid + 1;
            } else {
                p2 = mid - 1;
            }
        }
        return false;
    }

    // q3
    boolean removeWithSequentialSearch(ArrayList<String> names, String name) {
        for (String str : names) {
            if (str.equalsIgnoreCase(name)) names.remove(str);
        }
        return false;
    }

    //q6
    void removeWithBinarySearch(ArrayList<String> names, String name) {
        int p1 = 0;
        int p2 = names.size();
        int mid;

        Collections.sort(names);

        while (p1 < p2) {
            mid = (p1 + p2) / 2;
            int compareTo = names.get(mid).compareToIgnoreCase(name);

            if (compareTo == 0) {
				names.remove(mid);
            } else if (compareTo < 0) {
                p1 = mid + 1;
            } else {
                p2 = mid - 1;
            }
        }
    }

    //q7
    boolean recursiveSequentialSearch(int[] nums, int num, int position){
        if (position == nums.length){
            return false;
        }

        if (nums[position] == num){
            return true;
        }

        return recursiveSequentialSearch(nums , num, position+1);
    }
    //q7

    boolean recursiveBinarySearch(ArrayList<Integer> nums, int num, int p1, int p2){
        Collections.sort(nums);
        int mid = (p1+p2)/2;
        if (p1 > p2){
            return false;
        }

        if (nums.get(mid) == num){
            return true;
        }else if (nums.get(mid) < num){
            return recursiveBinarySearch(nums , num, mid+1, p2);
        }else {
            return recursiveBinarySearch(nums , num, p1, mid-1);
        }
    }

}
