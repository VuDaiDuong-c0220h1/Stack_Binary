public class BinaryStack {
    public int[] arr;
    public int size = 0;
    public int index = 0;
    public BinaryStack(int size){
        this.arr = new int[size];
    }

    public void push(int element){
        this.arr[index] = element;
        index++;
    }

    public void display(){
        for(int i= index; i > 0; i--){
            System.out.print(arr[i] + "\t");
        }
    }

    public boolean isEmpty(){
        if(index == 0){
            return true;
        }
        return false;
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
}
