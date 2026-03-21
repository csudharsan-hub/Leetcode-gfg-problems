class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> o_list = new ArrayList<>();
        

         List<Integer> list1 =new ArrayList<>();
        for(int i = 0 ;i < nums1.length ; i++){
           
            boolean boo = false;
            for(int j = 0 ; j < nums2.length;j++){
                if(nums1[i] == nums2[j] ){
                    boo = true;
                    break;
                }
            }
            if(!boo){
                if(!list1.contains(nums1[i])){
                      list1.add(nums1[i]);
                }
            }
            
        }

        o_list.add(list1);
        

       List<Integer> list2 = new ArrayList<>();
        for(int i = 0 ;i < nums2.length ; i++){
            
            boolean boo = false;
            for(int j = 0 ; j < nums1.length;j++){
                if(nums2[i] == nums1[j] ){
                    boo = true;
                    break;
                }
            }
            if(!boo){
                if(!list2.contains(nums2[i])){
                      list2.add(nums2[i]);
                      
                }
            }
            
        }
        o_list.add(list2);
        
        
        return o_list;
    }
}