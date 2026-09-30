class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int crr=0;
        int[] res=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char c=seq.charAt(i);
            if(c=='('){
                crr++;
                res[i]=crr%2;
            }else{
                res[i]=crr%2;
                crr--;
            }
        }
        return res;
    }
}