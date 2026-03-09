class Solution {
    public int minimumFlips(int n) {

        String binary=Integer.toBinaryString(n);
        String rev=new StringBuilder(binary).reverse().toString();

        int count = 0;

        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) != rev.charAt(i)){
                count++;
            }
        }

        return count;
    }
}