package String;

public class IndexOfandCompareTo {
    public static void main(String[] args) {
        String s = "Bikesh Kumar";

        System.out.println(s.indexOf('e'));
        System.out.println(s.lastIndexOf('e'));
        // compareTo() is use d to compar 2 given strings lexographically
        String a = "abc";
        String b = "dbc";

        System.out.println(a.compareTo(b));
    }
}
