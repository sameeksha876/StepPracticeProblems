package Week03_04;

import java.util.*;

public class Q5 {

    // Linear search first occurrence
    static int linearFirst(String arr[], String target){

        int comparisons=0;

        for(int i=0;i<arr.length;i++){

            comparisons++;

            if(arr[i].equals(target)){

                System.out.println("Linear comparisons: "+comparisons);
                return i;
            }
        }

        return -1;
    }

    // Linear search last occurrence
    static int linearLast(String arr[], String target){

        int index=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i].equals(target))
                index=i;
        }

        return index;
    }

    // Binary search
    static int binarySearch(String arr[], String target){

        int low=0;
        int high=arr.length-1;

        int comparisons=0;

        while(low<=high){

            comparisons++;

            int mid=(low+high)/2;

            if(arr[mid].equals(target)){

                System.out.println("Binary comparisons: "+comparisons);
                return mid;
            }

            if(arr[mid].compareTo(target)<0)
                low=mid+1;

            else
                high=mid-1;
        }

        return -1;
    }

    // Count occurrences
    static int countOccurrences(String arr[],String target){

        int count=0;

        for(String s:arr){

            if(s.equals(target))
                count++;
        }

        return count;
    }

    public static void main(String args[]){

        String logs[]={"accB","accA","accB","accC"};

        System.out.println("First occurrence: "+linearFirst(logs,"accB"));

        System.out.println("Last occurrence: "+linearLast(logs,"accB"));

        Arrays.sort(logs);

        System.out.println("Binary search index: "+binarySearch(logs,"accB"));

        System.out.println("Count: "+countOccurrences(logs,"accB"));
    }
}