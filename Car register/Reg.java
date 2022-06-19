import java.util.*;

/*Create the class*/
public class Reg{

  static void println(String string) {
      System.out.println(string);
  }

  static void print(String string) {
      System.out.print(string);
  }

public static void main(String[]args){

// Declare a stack
Stack<String> s1 = new Stack<String>();

//Assign a variable for an auto generated car number
String dtl = "00580";

Scanner input = new Scanner(System.in);
System.out.println("");
System.out.println("<<<<<<< Register the 1st car >>>>>>>");
System.out.println("");
System.out.println("Car number - " + dtl);
System.out.println("");
System.out.println("Enter Car Model,Diver & Sponsar");
System.out.println("");
String F1 = input.nextLine();
System.out.println("");

// push the car number and car details
s1.push( F1 + dtl);
System.out.println(" ** Car number - " + dtl + " Successfully registered for the race!! ** ");
String Blank1 = input.nextLine();

//Assign a variable for an auto generated car number
String dtl1 = "00590";

System.out.println("");
System.out.println("<<<<<<< Register the 2nd car >>>>>>>");
System.out.println("");
System.out.println("Car number - " + dtl1);
System.out.println("");
System.out.println("Enter Car Model,Diver & Sponsar");
System.out.println("");
String F2 = input.nextLine();
System.out.println("");

// push the car number and car details
s1.push( F2 + dtl1);
System.out.println(" ** Car number - " + dtl1 + " Successfully registered for the race ** ");
String Blank2 = input.nextLine();

//Assign a variable for an auto generated car number
String dtl2 = "00600";

System.out.println("");
System.out.println("<<<<<<< Register the 3rd car >>>>>>>");
System.out.println("");
System.out.println("Car number - " + dtl2);
System.out.println("");
System.out.println("Enter Car Model & Sponsar");
System.out.println("");
String F3 = input.nextLine();

System.out.println("");

// push the car number and car details
s1.push(F3 + dtl2);
System.out.println(" ** Car number - " + dtl2 + " Successfully registered for the race ** ");
String Blank3 = input.nextLine();

//Assign a variable for an auto generated car number
String dtl3 = "00610";

System.out.println("");
System.out.println("<<<<<<< Register the 4th car >>>>>>>");
System.out.println("");
System.out.println("Car number - " + dtl3);
System.out.println("");
System.out.println("Enter Car Model,Diver & Sponsar");
System.out.println("");
String F4 = input.nextLine();
System.out.println("");

// push the car number and car details
s1.push( F4 + dtl3);
System.out.println(" ** Car number - " + dtl3 + " Successfully registered for the race ** ");
String Blank4 = input.nextLine();
System.out.println("");

// Delete a car details
System.out.println("-----------------------------------------------------------------------");
s1.pop();
System.out.println(" Details of Car number - " + dtl3 + " Successfully Deleted from the race!! ");
System.out.println("-----------------------------------------------------------------------");

String Blank5 = input.nextLine();

//Assign a variable for an auto generated car number
String dtl4 = "00620";

System.out.println("");
System.out.println("<<<<<<< Register the 5th car >>>>>>>");
System.out.println("");
System.out.println("Car number - " + dtl4);
System.out.println("");
System.out.println("Enter Car Model,Diver & Sponsar");
System.out.println("");
String F5 = input.nextLine();
System.out.println("");

// push the car number and car details
s1.push( F5 + dtl4);
System.out.println(" ** Car number - " + dtl4 + " Successfully registered for the race ** ");
String Blank6 = input.nextLine();

//Assign a variable for an auto generated car number
String dtl5 = "00630";

System.out.println("");
System.out.println("<<<<<<< Register the 6th car >>>>>>>");
System.out.println("");
System.out.println("Car number - " + dtl5);
System.out.println("");
System.out.println("Enter Car Model,Diver & Sponsar");
System.out.println("");
String F6 = input.nextLine();
System.out.println("");

// push the car number and car details
s1.push( F6 + dtl5);
System.out.println(" ** Car number - " + dtl5 + " Successfully registered for the race ** ");
System.out.println("Car number - " + s1.peek());
System.out.println("");
String Blank7 = input.nextLine();

// Java code for linearly searching x in arr[]. If x
// is present then return its location, otherwise
// return -1
System.out.println("");
System.out.println("--------------------------------------------------------------------------------------");
System.out.println("");
System.out.println("");
System.out.println("  _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*  SEARCH CARS  *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*   ");

      int counter,item, array[];

      //To capture user input
Scanner inputs = new Scanner(System.in);
System.out.println("");
System.out.println("");

int num = 0;
System.out.println("How many numbers of cars have been registered:");
num = inputs.nextInt();

      //Creating array to store the all the numbers
array = new int[num];

System.out.println("");
System.out.println("Enter car numbers of " + num + " cars ");

      //Loop to store each numbers in array
System.out.println("");
for (counter = 0; counter < num; counter++) {
System.out.print("Enter no for index " + counter + " : ");
array[counter] = inputs.nextInt();
      }
System.out.println("");
System.out.println("Enter the car number you want to search for:");
item = inputs.nextInt();

for (counter = 0; counter < num; counter++){
if (array[counter] == item){
System.out.println("");
System.out.println("00"+item+" is found on index "+ counter);
  /*Item is found so to stop the search and to come out of the
  * loop use break statement.*/
           break;
         }

if (counter == num-1){
System.out.println("");
System.out.println(item + " is not found the registered list.");
System.out.println("");
System.out.println("");
                      }
                  }
      }
}
