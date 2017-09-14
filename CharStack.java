public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack
  public CharStack(){
    //PRE:
    //POS:
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }//CharStack

  public void push(char element){
    //PRE:
    //POS:
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }//push

 public char peek (){
	return s[top];
  }//peek

  public char pop (){
    //PRE:
    //POS:
    //TAS: remove and return the item on the top of the stack
   top --;
     return s[top+1];
  }//pop

  public boolean isEmpty(){
    //PRE:
    //POS:
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
    if(top == -1){
      return true;  
    }else
    return false;
    
  }//isEmpty

  public boolean isFull(){
	if (top == MAX_CAP -1) {
		return true;
		}else return false;
  }// isFull

 public String toString() {
   String space = "";
  for(int a =0; a <top+1; a++){
    System.out.print(s[a]);
  }//for loop
  return space;
 }//toString

}
