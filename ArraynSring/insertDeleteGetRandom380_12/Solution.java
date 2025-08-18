package ArraynSring.insertDeleteGetRandom380_12;
import java.util.*;

class RandomizedSet {

    HashSet<Integer> set;

    public RandomizedSet() {
        set=new HashSet<>();
    }

    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }else{
            return false;
        }
    }

    public boolean remove(int val) {
        if(!set.contains(val)){
            return false;
        }else{
            set.remove(val);
            return true;
        }
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

public class Solution<T> {

    public static void main(String[] args) {

        RandomizedSet randomizedSet = new RandomizedSet();
        String[] result = new String[7];

        result[0] = randomizedSet.insert(1)+"";
        result[1] = randomizedSet.remove(2)+"";
        result[2] = randomizedSet.insert(2)+"";
        result[3] = randomizedSet.getRandom()+"";
        result[4] = randomizedSet.remove(1)+"";
        result[5] = randomizedSet.insert(2)+"";
        result[6] = randomizedSet.getRandom()+"";

        System.out.println("TestCase result: "+Arrays.toString(result));

    }

}
