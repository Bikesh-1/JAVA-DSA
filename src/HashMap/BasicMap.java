package HashMap;
import java.util.HashMap;
public class BasicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Bikesh",37);

        map.put("Dixit",19);
        map.put("Aman",07);
        map.put("Ankit",04);
        System.out.println(map);
        map.put("Bikesh",38);
        System.out.println(map);
        map.put("Biku",07);
        System.out.println(map);
        map.remove("Biku");
        System.out.println(map);
        map.remove("ram");
        System.out.println(map);
    }
}
