class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> num=new ArrayList<>();

        if(numRows==1){
            num.add(1);
            list.add(new ArrayList<>(num));
            num.clear();
            return list;
        }
        num.add(1);
        list.add(new ArrayList<>(num));
        num.clear();
        int res=1;
        for(int i=1;i<numRows;i++){
            List<Integer> previous = list.get(list.size() - 1);
            num.add(1);
            for (int j = 1; j < previous.size(); j++) {
                int val = previous.get(j - 1) + previous.get(j);
                num.add(val);
            }
            num.add(1);
            list.add(new ArrayList<>(num));
            num.clear();
        }
        return list;
    }
}