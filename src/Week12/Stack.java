package Week12;

public interface Stack{
   void push(int data);
   boolean empty();
   int pop();
   int peek();

   int size();

   int search(int id);

   void remove(int id);

   int get(int id);
}