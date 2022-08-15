package Week12;

public class StackIt implements Stack{
    private int[] stack = new int[10];
    private int count;
    private boolean empty = true;

    @Override
    public void push(int data){
        empty = false;
        stack[count] = data;
        count++;
    }

    @Override
    public boolean empty() {
        return empty;
    }

    @Override
    public int pop() {
        int data;
        count--;
        data = stack[count];
        stack[count] = 0;

        return data;
    }

    @Override
    public int peek() {
        int data;
        data = stack[count - 1];
        return data;
    }

    @Override
    public int size(){
        return count;
    }

    @Override
    public int search(int id){

        int result = 0;
        for(int i = 0; i < stack.length; i++){
            if(id == stack[i]){
                result = i;
            }
        }
        return result;
    }

    @Override
    public void remove(int id){
        stack[id] = 0;
        count --;
    }

    @Override
    public int get(int id){
        return stack[id];
    }
}