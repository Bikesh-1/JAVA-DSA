package StringBulidersxxxxx;

public class stringImmutability {
    //we can't change individual characters in a string
    //we can but we will waste lot of time and space
    public static void main(String[] args) {
        String s = "hello";
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
