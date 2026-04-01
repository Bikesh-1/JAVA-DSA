package OopsInJava;

public class ArrayList {
    public static class Arraylist{
        int[] arr = new int[5];
        int size = 0;
        public void add(int ele){
            arr[size] = ele;
            size++;
        }
    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
    }
}
