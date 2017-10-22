//Given a collection of intervals, merge all overlapping intervals.

//For example:

//Given [1,3],[2,6],[8,10],[15,18],

//return [1,6],[8,10],[15,18].

//Make sure the returned intervals are sorted.



/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<>();
        
        // sort list by interval's start time
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });
    
        // for (int i = 0; i <= intervals.size() - 1; i++) {
        //     System.out.print("("+intervals.get(i).start +" , "+intervals.get(i).end+ ") ");
        // }  
        // System.out.println("\n\n");
        
        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval i1 = intervals.get(i);
            Interval i2 = intervals.get(i + 1);
            if (i1.end < i2.start) {
                // i1 goes completely before i2
                result.add(i1);
            } else {
                // overlapping, then merge these two intervals
                i1.start = Math.min(i1.start, i2.start);
                i1.end = Math.max(i1.end, i2.end);
                intervals.remove(i + 1);
                i--;
            }
        }
        // don't forget to add the last interval which is the merging interval
        result.add(intervals.get(intervals.size() - 1));
        return result;
    }
}
