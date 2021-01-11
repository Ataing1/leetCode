package HackerRank;

import java.util.Arrays;

public class fradulentActivity {
    /**
     *
     */
    public fradulentActivity() {
        System.out.println("fradulentActivity: ");
    }

    public static void main(String[] args) {
        fradulentActivity test = new fradulentActivity();
        System.out.println(test.activityNotifications(new int[]{2, 3 , 4 , 2, 3 ,6 ,8 ,4, 5},5));
    }

    public int activityNotifications(int[] expenditure, int d) {
        int start = 0;
        int[] pastDays = new int[d];
        int median = 0;
        int count = 0;
        for(int i = d;i<expenditure.length;i++){
            System.arraycopy(expenditure, start, pastDays, 0, d);
            System.out.println(Arrays.toString(pastDays));
            Arrays.sort(pastDays);

            //get median
            if(d%2==0){
                median = (pastDays[d/2] + pastDays[(d/2) - 1])/2;
            }else{
                median = pastDays[d/2];
            }
            System.out.println("median" + median + " expenditure" + expenditure[i]);
            if(median*2 >= expenditure[i]){
                System.out.println("incrementing count");
                count++;
            }
            start++;
        }

        return count;

    }

}