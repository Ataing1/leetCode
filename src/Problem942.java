public class Problem942 {
    /**
     *Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
     *
     * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
     *
     * If S[i] == "I", then A[i] < A[i+1]
     * If S[i] == "D", then A[i] > A[i+1]
     *
     *
     * Example 1:
     *
     * Input: "IDID"
     * Output: [0,4,1,3,2]
     * Example 2:
     *
     * Input: "III"
     * Output: [0,1,2,3]
     * Example 3:
     *
     * Input: "DDI"
     * Output: [3,2,0,1]
     *
     */
    public int[] diStringMatch(String S) {
        int largest = S.length();
        largest = (int) (largest - S.chars().filter(ch->ch=='I').count());
        //OR Using a for loop
//        for(int i = 0;i<S.length();i++){
//            if(S.charAt(i)=='I'){
//                largest--;
//            }
//        }
        int smallest = largest-1;
        int[] ret = new int[S.length()+1];
        ret[0] = largest;
        largest++;
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                ret[i+1] = largest;
                largest++;
            }else{
                ret[i+1] = smallest;
                smallest--;
            }
        }
        return ret;
    }


}