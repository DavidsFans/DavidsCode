/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author David
 */
public class Array {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int u =10;
    int array_sort[];
    //random methods to 10array value's from 0-100
    array_sort = new int[u];
    for(int x=0;x<array_sort.length;x++){
    array_sort[x]= (int)(Math.random()*100);
    }
//list of odd and even numbers
List<Integer> odd = new ArrayList<Integer>();
List<Integer> even = new ArrayList<Integer>();
//array sort
for (int i : array_sort) {
    if ((i & 1) == 1) {
        odd.add(i);
    } else {
        even.add(i);
    }
}
//sort numbers "format"
Collections.sort(odd);
Collections.sort(even);
System.out.println("Odd:" + odd);
System.out.println("Even:" + even);
}
    
  
    
    
    }
    
