//MOVE ALL ZERO IN RIGHT SIDE OF AN ARRAY
import java.util.*;
class Main{
public static void moveZero(int []arr,int n){
int count=0;
for(int i=0;i<n;i++){
  if(arr[i]>0){
  arr[count++]=arr[i];
  }
}
while(count<n){
arr[count++]=0;
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
}
moveZero(arr,n);
for(int i=0;i<n;i++){
  System.out.print(arr[i]+" ");
}
}
}






//MOVE ALL ZERO IN RIGHT SIDE OF AN ARRAY
//Using traveral swaping in single case 
import java.util.*;
class Main{
public static void moveZero(int []arr,int n){
int count=0;
int temp;
for(int i=0;i<n;i++){
  if(arr[i]>0){
   temp=arr[count];//swap
   arr[count]=arr[i];
   arr[i]=temp;
   count=count+1; 
}
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
}
moveZero(arr,n);
for(int i=0;i<n;i++){
  System.out.print(arr[i]+" ");
}
}
}
