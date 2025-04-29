import java.util.*;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            map.computeIfAbsent(size, k -> new ArrayList<>()).add(i);
            // If enough people for a group, add to result and reset the list
            if (map.get(size).size() == size) {
                result.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }
        return result;
    }
}
