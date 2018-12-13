/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array;
import java.util.Arrays; 
/**
 *
 * @author David
 */
public class NextArray {
    
    public static void main(String[] args) {
        int u =10;
    int array_sort[];
    array_sort = new int[u];
    for(int x=0;x<array_sort.length;x++){
    array_sort[x]= (int)(Math.random()*100);
    }
    
    //array sort method for ascendin order
    Arrays.sort(array_sort); 
    System.out.printf("%s", Arrays.toString(array_sort)); 
    }  
    
}
