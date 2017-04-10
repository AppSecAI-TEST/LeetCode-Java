public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        
        for (List<Integer> row: wall) {
            int sum = 0;
            
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                int val = map.getOrDefault(sum, 0) + 1;
                max = Math.max(max, val);
                map.put(sum, val);
            }
        }
        
        return wall.size() - max;
    }
}
