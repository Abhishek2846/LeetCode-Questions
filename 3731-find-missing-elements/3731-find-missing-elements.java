class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101;
        int max = -1;

        for(int num : nums){

            min = Math.min(num , min);
            max = Math.max(num , max);

        }

        Set<Integer> s = new HashSet<>();

        for(int num : nums){
            s.add(num);
        }

        List<Integer> li = new ArrayList<>();

        for(int i = min ; i <= max ; i++){

            if(!s.contains(i)){
                li.add(i);
            }
        }

        return li;
    }
}