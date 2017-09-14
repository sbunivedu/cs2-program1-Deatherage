 import java.util.Scanner;
 
public class converter{

 
 
  public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }//isoperand

  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }//isoperator
  
   public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
   }//precedenceOrder
  
  public static void main (String[] args) {
     CharStack stack = new CharStack();
     Scanner scan = new Scanner(System.in);
    System.out.print("Please input your infix notation : ");
    String input = scan.nextLine();
    for(int z = 0; z < input.length(); z++){
      char current = input.charAt(z);
      if ( isOperand(current) ){
        System.out.print(current);
      }//if for operands
      
      else if ( isOperator(current) ){
        while( stack.isEmpty() != true && isOperator(stack.peek()) && precedenceOrder(stack.peek()) >= precedenceOrder(current)){
          System.out.print(stack.pop());
          
        }
        stack.push(current);
      }//if for operators
      
      else if (current == '(' ){
        stack.push(current); 
          }//for left parenth
      
      else if (current == ')'){
        while(stack.peek() != '('){
          System.out.print(stack.pop());
        }//while
        stack.pop();
      }//if for right parenth
      
    }//forloop
    while(stack.isEmpty()== false ){
        System.out.print(stack.pop());
      }//while
    System.out.println();
    
    
  }//main
  
 }//class