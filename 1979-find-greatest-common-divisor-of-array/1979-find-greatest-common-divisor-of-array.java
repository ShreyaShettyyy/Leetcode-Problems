class Solution {
    public int findGCD(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int maxgcd=0;
        for(int i=1;i<=max;i++){
            if(min%i==0 && max%i==0){
                maxgcd=i;
            }
        }
        return maxgcd;
    }
}