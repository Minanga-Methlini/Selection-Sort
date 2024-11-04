/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsorttest;
import java.util.Arrays;

/**
 *
 * @author Minanga Methlini
 */
public class SelectionSortTest {

    Integer [] a;
    
    public  SelectionSortTest (Integer[] a){
        
        this.a = a;
     }
    
    public void selectionSort (Integer[] a){
        
        int n = a.length;
        for (int i = 0; i < n - 1; i++){
            // ee wty aithi ekkena hithgnnawa eya thma kotm kiyl 
            // phla ekt anuwa i thma kotm kiyl hithnw
            int min_idx = i;
            
           for (int j = i + 1; j < n; j++) {
               if (a[j] < a [min_idx]){
                  min_idx = j;
               }
               System.out.println(
                       "i = "
                       + (i)
                       + "; J = "
                       + (j)
                       + "; Current Minimum = "
                       + a[min_idx] 
                       + ";"
                       + Arrays.deepToString(a));
           }
           swap(i, min_idx);
        }
    }
    
  
    public void swap (int i, int j){
        //method
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } 
    
    
        
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Integer[] a = {76,6,107,92,21,23,5,9,8,8143};
     
    SelectionSortTest sorter = new SelectionSortTest(a);
    System.out.println("Array before sorting:" + Arrays.deepToString(a));
        
    sorter.selectionSort(a);
    
    System.out.println("Array after sorting:" + Arrays.deepToString(a));
    }
}
    
    



