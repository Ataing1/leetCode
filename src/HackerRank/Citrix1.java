package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Citrix1 {
    /**
     *
     */
    public Citrix1() {
        System.out.println("pog: ");
    }

    public static List<Integer> sortIntersect(List<Integer> volcanic, List<Integer> nonVolcanic) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(volcanic.size()<=nonVolcanic.size()){
            for(Integer x: volcanic){
                if(nonVolcanic.contains(x)){
                    ret.add(x);
                    nonVolcanic.remove(x);
                }
            }
            //loop volcanic, check eq in nonvolcanic
        }else{
            for(Integer x: nonVolcanic){
                if(volcanic.contains(x)){
                    ret.add(x);
                    volcanic.remove(x);
                }
            }
            //loop non volcanic, check eq volcanic
        }
        Collections.sort(ret);
        // Write your code here
        return ret;
    }


}