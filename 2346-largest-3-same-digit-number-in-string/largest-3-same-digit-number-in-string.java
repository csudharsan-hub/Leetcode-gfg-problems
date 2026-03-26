class Solution {
    public String largestGoodInteger(String num) {
        List<String> list = Arrays.asList("000","111","222","333","444","555","666","777","888","999");
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < num.length() - 2 ;i++){
            if(list.contains(num.substring(i,i+3))){
                int temp = Integer.parseInt(num.substring(i,i+3));
                if(temp > max){
                    max = temp;
                }
            }
            
        }
        if(max == Integer.MIN_VALUE) return "";
            if(max == 0) return "000";
         return String.valueOf(max);
    }
}