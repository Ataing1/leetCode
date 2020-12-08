public class problem1128 {
    /**
     *Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.
     *
     * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
     *
     *
     *
     * Example 1:
     *
     * Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
     * Output: 1
     *
     *
     * Constraints:
     *
     * 1 <= dominoes.length <= 40000
     * 1 <= dominoes[i][j] <= 9
     *
     * Runtime: 2 ms, faster than 98.29% of Java online submissions for Number of Equivalent Domino Pairs.
     * Memory Usage: 48.5 MB, less than 7.44% of Java online submissions for Number of Equivalent Domino Pairs.
     */
    public problem1128() {
        System.out.println("problem1128: ");
    }

    public static void main(String[] args) {
        problem1128 test = new problem1128();
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] bucket = new int[10][10];
        for (int[] dominoe : dominoes) {
            int index = Math.min(dominoe[0], dominoe[1]);
            int max = Math.max(dominoe[0], dominoe[1]);
            bucket[index][max] += 1;
        }
        int count = 0;
        for(int i = 1;i<10;i++){
            for(int j = i;j<10;j++){
                if(bucket[i][j]>=2){
                    count+=(bucket[i][j]*(bucket[i][j]-1))/2;
                }
            }
        }
        return count;

    }

}