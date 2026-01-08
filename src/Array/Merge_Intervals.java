package Array;
import java.util.*;
public class Merge_Intervals {
    public static void main(String[] args) {
     int intervals[][] = {
             {1,3},
             {2,6},
             {8,10},
             {15,18}
     };
     int [][]merged = merge(intervals);
     //print intervals
        for(int[] interval : merged)
        {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
    public static int[][] merge(int[][] intervals) {
        //Edge cases
        if(intervals == null || intervals.length == 0) return new int[0][0];
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> result =new ArrayList<>();

        //Add first interval
        result.add(intervals[0]);
        //Traverse remaining intervals
        for(int i=1;i<intervals.length;i++)
        {
            int last[] = result.get(result.size() - 1);
            int current[] = intervals[i];
            //overlapping  condition
            if(current[0] <= last[1])
            {
                //merge
                last[1] = Math.max(last[1],current[1]);
            }
            //Non-overlapping
            else
            {
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);

    }
}
