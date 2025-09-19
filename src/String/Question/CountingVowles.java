package String.Question;
public class CountingVowles {
    public static void main(String[] args) {
        String s = "Bikesh Kumar";
        int n = s.length();
        int countVowels = 0;
        for (int i = 0; i <n; i++) {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                countVowels++;
            }
        }
        System.out.println(countVowels);

    }
}
