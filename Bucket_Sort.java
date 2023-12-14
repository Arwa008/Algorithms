package Sort1;
import java.util.*;
public class Bucket{
static double[] arr = {1.0,7.0,3.5,5.0,7.9,8.2,8.0};
    static int n=arr.length;
    static   ArrayList <Double>[] buckets = new ArrayList[n];
    
    static public double findMax(){
        double max = arr[0];
    for(int i=0;i<n;i++){
    for (int k = 0; k < arr.length; k++) {
        if (arr[k] > max)
            max = arr[k];      
    }
    }
      return max;
    }
     public  void EmptyBuckets(){ 
            for (int i = 0; i < n; i++)  
            buckets[i] = new ArrayList<Double> ();   
            System.out.println("the empty buckets ");
            for (int i = 0; i < n; i++)  
            System.out.println("["+i+"] --> "+buckets[i]);
     }
    // Add elements into the buckets
      public  void AddElementsToBuckets(){
          int x;
    for (int j = 0; j < n; j++) {
        if(arr[j]<1){
            x=(int) (arr[j]*n);
            buckets[x].add(arr[j]);
        }
        else if(arr[j]>=1){
        x=(int) (arr[j]*n/(findMax()+1));
         buckets[x].add(arr[j]);
    }
    }
     System.out.println(" Add elements into the buckets");
            for (int i = 0; i < arr.length; i++)   
            System.out.println("["+i+"] --> "+buckets[i]);
      }
       public void SortBuckets(){
      double temp;
      int  previousIndex;
           System.out.println("Sorted Buckets : ");
     for(int i=0;i<n;i++){
       for(int index = 1; index < buckets[i].size(); index++){
        temp = buckets[i].get(index);
        previousIndex = index - 1;
         while((buckets[i].get(previousIndex) > temp) && (previousIndex > 0)){
            buckets[i].set((previousIndex+1), buckets[i].get(previousIndex));
            previousIndex-=1;
        }
        if(buckets[i].get(previousIndex) > temp){
            buckets[i].set((previousIndex+1), buckets[i].get(previousIndex));
           buckets[i].set((previousIndex+1), temp);
        }else{
           buckets[i].set((previousIndex+1), temp);
        }  
    }
         System.out.println("["+i+"]-->"+buckets[i]);
    }
    }
       public void SortedArray(){
          int index = 0; 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < buckets[i].size(); j++) { 
                arr[index++] = buckets[i].get(j); 
            } 
       }
         System.out.print("Sorted Array is : ");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
           System.out.println("");
       }
     public static void main(String[] args) {
         System.out.print("Array to be sorted : ");
         for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");   
         }
        System.out.println();  
        Bucket obj = new Bucket();
        obj.EmptyBuckets();
        obj.AddElementsToBuckets();
        obj.SortBuckets(); 
        obj.SortedArray();
  }   
     
  } 
