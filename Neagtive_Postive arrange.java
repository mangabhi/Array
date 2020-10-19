//Move all negative elements to end in order with extra space allowed
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //int k=1;
	    int n=8; //sc.nextInt();
	    int arr[]=new int[n];
        int temp[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){//3 1 2 4
                
                temp[j++]=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]<0){//3 1 2 4
                
                temp[j++]=arr[i];
            }
    
        }        
        for(int i=0;i<n;i++){
        System.out.print(temp[i]+" ");
        }
	
}
}
