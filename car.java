import java.util.*;
class car{

public static void main(String[]args){

//declare two stack
  Stack s1 = new Stack();
  Stack s2 = new Stack();

  System.out.println("");

//Push data for round 0ne
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the first place in the first round of the race");
  String F1 = input.nextLine();
  s1.push(F1);
  System.out.println("");

  System.out.println("Enter the second place in first round of the race");
  String F2 = input.nextLine();
  s1.push(F2);
  System.out.println("");

  System.out.println("Enter the third place in first round of the race");
  String F3 = input.nextLine();
  s1.push(F3);
  System.out.println("");

  System.out.println("Enter the fourth place in first round of the race");
  String F4 = input.nextLine();
  s1.push(F4);
  System.out.println("");

  System.out.println("Enter the Fifth place in first round of the race");
  String F5 = input.nextLine();
  s1.push(F5);
  System.out.println("");

  System.out.println("Enter the Six place in first round of the race");
  String F6 = input.nextLine();
  s1.push(F6);
  System.out.println("");

  System.out.println("");
  System.out.println("..........................................................");

//pop data for round one
  System.out.println("");
  System.out.println(" 6th place - " + s1.pop() + " eliminated from the Race!!");
  System.out.println("");
  System.out.println(" Eligible List for the second round(starting order)");
  System.out.println("");
  System.out.println(" 5th place - " + "" + s1.pop() + "*");
  System.out.println(" 4th place - " + "" + s1.pop() + "*");
  System.out.println(" 3rd place - " + "" + s1.pop() + "*");
  System.out.println(" 2nd place - " + "" + s1.pop() + "*");
  System.out.println(" 1St place - " + "" + s1.pop() + "*");

  System.out.println("");

  System.out.println("");

//push data for round two
  System.out.println("Enter the first place in second round of the race");
  String S1 = input.nextLine();
  s2.push(S1);
  System.out.println("");

  System.out.println("Enter the second place in second round of the race");
  String S2 = input.nextLine();
  s2.push(S2);
  System.out.println("");

  System.out.println("Enter the third place in second round of the race");
  String S3 = input.nextLine();
  s2.push(S3);
  System.out.println("");

  System.out.println("Enter fourth place in second round of the race");
  String S4 = input.nextLine();
  s2.push(S4);
  System.out.println("");

  System.out.println("Enter the Fifth place in second round of the race");
  String S5 = input.nextLine();
  s2.push(S5);
  System.out.println("");

  System.out.println("");
  System.out.println("..........................................................");
  System.out.println("");

//pop data for round two
  System.out.println(" 5th place - " + s2.pop() + " Disqualified for the Final Race!!");
  System.out.println("");
  System.out.println(" Eligible List for the Final Round(starting order)");
  System.out.println("");
  System.out.println(" 4th place " + "" + s2.pop() + "*");
  System.out.println(" 3rd place " + "" + s2.pop() + "*");
  System.out.println(" 2nd place " + "" + s2.pop() + "*");
  System.out.println(" 1st place " + "" + s2.pop() + "*");

  System.out.println("");
  System.out.println(" <<<<<<<<<<<<<<<<<<<<<< Final Round >>>>>>>>>>>>>>>>>>>>>>> ");
  System.out.println("");

     Queue q = new Queue();

     Scanner inputs = new Scanner(System.in);
     System.out.println("Enter the 4th place in final round of the race ");
     String P1 = inputs.nextLine();
     q.enqueue(P1);
     System.out.println("");

     System.out.println("Enter the 3rd place in final round of the race ");
     String T1 = inputs.nextLine();
     q.enqueue(T1);
     System.out.println("");

     System.out.println("Enter the 2nd place in final round of the race ");
     String M1 = inputs.nextLine();
     q.enqueue(M1);
     System.out.println("");

     System.out.println("Enter the 1st place in final round of the race ");
     String L1 = inputs.nextLine();
     q.enqueue(L1);
     System.out.println("");
     System.out.println("");
     System.out.println("");

           //print the Queue element
    System.out.println("4th place ( Not compete for a medal)  ");   q.dequeue();

       System.out.println("");
         System.out.println("");

     System.out.println("  **** Winners of Final Round **** ");
       System.out.println("");
         System.out.println("");

      System.out.println(" 3rd Runners up (Brounce medal) - " + "" + q.front.key + "*");
       System.out.println("");

      q.dequeue();

     System.out.println(" 2nd Runners up (Silver medal) - " + "" + q.front.key + "**");
       System.out.println("");


     System.out.println(" Winner (Gold medal) - " + "" + q.rear.key + "***");
       System.out.println("");
       System.out.println("");
       System.out.println("");


                                            }
                       }
