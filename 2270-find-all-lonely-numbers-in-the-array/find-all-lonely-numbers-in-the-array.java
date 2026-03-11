class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> n=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(m.get(i)==1 && !m.containsKey(i-1) && !m.containsKey(i+1)){
                n.add(i);
            }
        }
        return n;
    }
}