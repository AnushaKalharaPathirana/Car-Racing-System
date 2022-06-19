//Create the operation of stack
class Stack{

static final int MAX=1000;
int top;
String a[]= new String [MAX];

boolean isEmpty(){
  return (top <0);
}
Stack(){
  top=-1;
}
boolean push(String x)
{
if(top>=(MAX-1)){
  System.out.println("Stack Overflow");
  return false;
}
  else{
    a[++top]= x;

    return true;
  }
}
String pop(){
  if(top<0){
    System.out.println("Stack is Underflow");
    return "";
  }
  else{String x= a[top--]; return x;}
}

}
