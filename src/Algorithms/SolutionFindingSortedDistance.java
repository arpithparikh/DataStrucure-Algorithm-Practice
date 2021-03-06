// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import sun.rmi.log.LogInputStream;

import java.util.*;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{



    public static void main(String args[]){


        List<List<Integer>> allLocations =new ArrayList<List<Integer>>(); ;

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list2.add(3);
        list2.add(4);
        list3.add(1);
        list3.add(-1);

        allLocations.add(list);
        allLocations.add(list2);
        allLocations.add(list3);

        System.out.print(allLocations.toString());

        Solution s = new Solution();


        System.out.print(s.closestLocations(3,allLocations,2).toString());
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> closestLocations(int totalCrates,
                                         List<List<Integer>> allLocations,
                                         int truckCapacity)
    {
        // WRITE YOUR CODE HERE
        //1. Sort the List by modify comparator mathod 
        //2. loop through it till the truck capacity
        List<List<Integer>> resultSet =  new ArrayList<List<Integer>>();


        Map<Double,List<Integer>> map = new HashMap<Double, List<Integer>>();


        allLocations.forEach(list ->{


            double square = Math.pow(list.get(0),2) + Math.pow(list.get(1),2);
            double squareRoot = Math.sqrt(square);
            map.put(squareRoot,list);

        });

        Iterator it = map.keySet().iterator();

        Vector v = new Vector(map.keySet());
        Collections.sort(v);

        it = v.iterator();


        while(truckCapacity > 0){

            Double listIndex = (Double) it.next();

            System.out.print(listIndex);

            resultSet.add((map.get(listIndex)));

            truckCapacity -- ;
        }

    return resultSet;    }







    // METHOD SIGNATURE ENDS
}
