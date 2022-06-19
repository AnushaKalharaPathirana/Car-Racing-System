import java.util.Scanner;

//ceate the class
public class InsertionSort{

public static void Sort(int a[]){

//Operation for insertaion_Sort
int n=a.length,i,j,p,temp;
for (i = 1;i < n; i++){

/*Move ahead comaparing elements of array that finding greater
value of current position*/

for (j=i-1; j >=0 && a[j+1]<a[j]; j--){
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
                                     }
                }
             }

// A utility function print array of size n
public static void printarray(int a[]){
for(int i=0; i < a.length; i++){

System.out.print(a[i]+" ");
                              }
                                   }

public static void main(String[] args){
//Driver code
int n, res,i;
int option;
Scanner s = new Scanner(System.in);
System.out.println("");
System.out.print("Provide the Total Number of cars Participating in the Race:" +'\n'+ "Enter - ");
n = s.nextInt();
System.out.println("");
int a[] = new int[n];
System.out.println("Enter Unique Numbers of "+n+" Cars ");
System.out.println("");
for( i=0; i < n; i++){
a[i] = s.nextInt();
                    }

// Dispaly entered numbers
System.out.println("");
System.out.println( "Entered Car List Before Sorting ");
printarray(a);
Sort(a);

System.out.println("");
//Display sorted numbers
System.out.println( "\nEntered Car List After Sorting");
printarray(a);
System.out.println("");
System.out.println("");
     }
 }
