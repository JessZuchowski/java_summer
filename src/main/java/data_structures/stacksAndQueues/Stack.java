package data_structures.stacksAndQueues;

public class Stack {
//    //declare top and temporary nodes
//    public SQNode top;
//    public SQNode temp;
//
//    public Stack() {
//        //set top to null
//        this.top = null;
//    }
//
//    //PUSH METHOD
//    public void push(int value) {
//        //make new node
//        SQNode newNode = new SQNode(value);
//        //if stack is null, make new value the top
//        if (this.top == null) {
//            this.top = newNode;
//            //make next node null
//            newNode.next = null;
//        }
//      //else, insert new value to new node
//      else {
//          newNode.next = this.top;
//          this.top = newNode;
//        }
//    }
//
//    //POP METHOD
//    //remove node from top of stack and return value
//    public SQNode pop() {
//        if (top == null) {
//            //make temp null node
//            SQNode temp = null;
//            //set top to next node
//            top = top.next;
//            temp.next = null;
//        }
//        //return value of popped node
//        return temp;
//    }
//
//    //PEEK METHOD
//    public SQNode peek() {
//        //return value of top node
//        return top;
//    }
}
