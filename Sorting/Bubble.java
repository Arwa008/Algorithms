package Sort1;
import java.util.*;

public class Bubble {  
  public static void main(String[] args) { 
    int i; 
    Scanner in = new Scanner(System.in);
    System.out.print("Enter No. of integers to sort : ");
    i=in.nextInt();
    int[] array = new int[i];
    System.out.print("Enter integers to sort : ");
    for(i = 0; i < array.length; i++){  
        array[i]=in.nextInt();
        System.out.println(); 
    }
    bubble_srt_Des(array, array.length);  
    bubble_srt_asc(array, array.length);  

    }

public static void bubble_srt_Des( int a[], int n ){
       System.out.println("Descending Oreder :");
       int i, j,t=0,u=1;   
       for(i = 0; i < n; i++){
           System.out.print("\nIteration : "+u+"\n");
           u=u+1;
             for(j = 1; j < (n-i); j++){
                if(a[j-1] < a[j]){
                  System.out.print(a[j-1]+ " "+a[j]+" -> ");
                  t = a[j-1];
                  a[j-1]=a[j]; 
                  a[j]=t;
                  System.out.print(a[j-1]+ " "+a[j]);
                  System.out.println();
                }
             }
       }
       System.out.println();
       System.out.println("Values after the sort:");  
       for(i = 0; i <n; i++) 
         System.out.print(a[i]+"  "); 
       System.out.println(); 
       System.out.println("PAUSE"); 
       System.out.println("-----------------------"); 

}
    public static void bubble_srt_asc( int a[], int n ){
       System.out.println("Ascending Oreder :");
       int i, j,t=0,u=1;   
       for(i = 0; i < n; i++){
           System.out.print("\nIteration : "+u+"\n");
           u=u+1;
             for(j = 1; j < (n-i); j++){
                if(a[j-1] > a[j]){
                  System.out.print(a[j-1]+ " "+a[j]+" -> ");
                  t = a[j-1];
                  a[j-1]=a[j]; 
                  a[j]=t;
                  System.out.print(a[j-1]+ " "+a[j]);
                  System.out.println();
                }
             }
       }
       System.out.println();
       System.out.println("Values after the sort:");  
       for(i = 0; i <n; i++) 
         System.out.print(a[i]+"  "); 
       System.out.println(); 
       System.out.println("PAUSE"); 
       System.out.println("-----------------------"); 

}
}
