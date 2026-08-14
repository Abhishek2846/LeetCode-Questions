class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int k=0;

        for(int i = 0 ; i < order.length ; i++){
            for(int j = 0 ; j < friends.length ; j++){
                if(friends[j] == order[i]){
                    ans[k++] = order[i];
                }
            }
        }
        return ans;

        // Set<Integer> friend = new HashSet<>();

        // for(int n : friends) friend.add(n);

        // List<Integer> res = new ArrayList<>();
        
        // for(int n: order)
        //     if(friend.contains(n))
        //         res.add(n);

        // int[] arr = new int[res.size()];
        // for (int i = 0; i < res.size(); i++) {
        //     arr[i] = res.get(i);
        // }

        // return arr;  
    }
}