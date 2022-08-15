package Week12;

import java.util.Vector;

public interface Stack{
    int push(int data);
   boolean empty();
   int pop();
   int peek();

   int size();

   int search(int id);

   void remove(int id);

   int get(int id);
}