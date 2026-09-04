import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Element: "+majorityElement(arr));
    }

    public static int majorityElement(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i)>arr.length/2){
                return i;
            }
        }
        return -1;
    }
}