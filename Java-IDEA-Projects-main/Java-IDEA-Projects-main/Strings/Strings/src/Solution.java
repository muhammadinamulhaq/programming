public class Solution {
    public static void main(String[] args) {
        System.out.println(solve(7));
        int[] arr = {2, 2, 2, 3, 3, 3};
//        System.out.println(Arrays.toString(solve(6, arr)));
    }
    public static int solve(int N) {
        // code here
        int temp = N;
        int count = 0;
        while(N > 0){
            if(N % 2 == 0){
                N -= (temp / 2);
            }else if(N == 1){
                count++;
                break;
            }else{
                N -= (temp + 1) / 2;
            }
            temp = N;
            count++;
        }

        return count;
    }

//    public ArrayList<ArrayList<Integer>> solve(int N, int[] A){
//        // Code Here.
//        int l = 0;
//        int r = 0;
//        ArrayList<Integer> ans = new ArrayList<>(2);
//        ans.add(l);
//        ans.add(r);
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
//        arr.add(ans);
//
//        for(int i = 0; i < N; i++){
//            for(int j = 0; j < N; j++){
//
//            }
//        }
//
//    }
}