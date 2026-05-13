package Maps_And_Sets;
import java.util.HashSet;
public class TwoSum {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem)) return true;
            set.add(ele);
        }
        return false;
    }
}


  //Using hashmap try we have to return the index of the two elements in an aaray
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int rem = target - nums[i];

            if(map.containsKey(rem)) {
                return new int[]{ map.get(rem), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
