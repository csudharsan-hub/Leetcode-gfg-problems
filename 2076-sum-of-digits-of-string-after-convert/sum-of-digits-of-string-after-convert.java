class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();

        for(char c : s.toCharArray()){
            sb.append(c - 'a'+1);
        }
        String ss=sb.toString();
       
        int result = 0;

        for(int i=0;i<k;i++){
            int sum = 0;
            for(char c : ss.toCharArray()){
                sum+=c-'0';
            }
            result = sum;
            ss = String.valueOf(sum);
            
        }   
        return result;      
    }
}