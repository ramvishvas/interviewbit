// Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

// You may assume that the intervals were initially sorted according to their start times.

// Example 1:

// Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

// Example 2:

// Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].

// This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

// Make sure the returned intervals are also sorted.

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
*/
// public class Solution {
//     public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
//         ArrayList<Interval> ans = new ArrayList<Interval>();
//         // if arraylist is empty..
//         if(intervals.size() == 0){
//             ans.add(newInterval);
//             return ans;
//         }
//         // intervel checking  (2, 7),  not(7, 2)............
//         if(newInterval.end < newInterval.start){
//             // swap..............
//             newInterval.end = newInterval.end + newInterval.start;
//             newInterval.start = newInterval.end - newInterval.start;
//             newInterval.end = newInterval.end - newInterval.start;
//         }
        
        
//         int flag = 1;
//         for(int i = 0; i < intervals.size(); i++){
//             // flag will add newIntevel only once;....
//             // element will add either first or middle.....
//             if((flag == 1) && (intervals.get(i).start >= newInterval.start)){
//                 flag = 0;
//                 // merging interval if new element added at first..............
//                 if(i == 0){
//                     if(newInterval.end >= intervals.get(intervals.size() - 1).end){
//                         ans.add(newInterval);
//                         return ans;
//                     }
//                     while((newInterval.end >= intervals.get(i).start) && (i < intervals.size()))   {
//                         if(newInterval.end < intervals.get(i).end){
//                             newInterval.end = intervals.get(i).end;
//                         }
//                         i++;
//                     }
//                     // System.out.print("Added");
//                     ans.add(newInterval);
//                     // System.out.print("Added");
//                     // add i th element becouse its already increased 
//                     // and outer loop will also increase i so one interval will skipped.
//                     if(i < intervals.size()){
//                         ans.add(intervals.get(i));
//                     }
//                 }
//                 else{
//                     int j = i;
//                     // check is newInterval merging with previoeus interval......
//                     if(intervals.get(i-1).end >= newInterval.start){
//                         newInterval.start = intervals.get(i-1).start;
//                         // check for end.....
//                         if(intervals.get(i-1).end >= newInterval.end){
//                             continue;
//                         }
//                     }
//                     // merging interval if new element added at midddle.............
//                     while((newInterval.end >= intervals.get(i).start) && (i < intervals.size()))   {
//                         if(newInterval.end < intervals.get(i).end){
//                             newInterval.end = intervals.get(i).end;
//                         }
//                         i++;
//                     }
//                     if(ans.get(j-1).start == newInterval.start){
//                         ans.get(j-1).end = newInterval.end;
//                     }
//                     else{
//                         ans.add(newInterval);
//                     }
//                     // add i th element becouse its already increased 
//                     // and outer loop will also increase i so one interval will skipped.
//                     if(i < intervals.size()){
//                         ans.add(intervals.get(i));
//                     }
//                 }
//             }
//             // .............................
//             else{
//                 ans.add(intervals.get(i));
//             }
//         }
//         // check if flag is 1 that means new interval not added......
//         // that means we have to add new interval to last
//         if(flag == 1){
//             if(ans.get(intervals.size()-1).end >= newInterval.start){
//                 if(ans.get(intervals.size()-1).end < newInterval.end){
//                     ans.get(intervals.size()-1).end = newInterval.end;
//                 }
//             }
//             else{
//                 ans.add(newInterval);
//             }
//         }
//         return ans;
//     }
// }


// .........................................................
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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                // interval    newInterval
                // [      ] |
                //          | [      ]
                result.add(interval);
            } else if (newInterval.end < interval.start) {
                // newInterval   interval
                // [      ]    |
                //             | [      ]
                result.add(newInterval);
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            } else {
                // overlapping, enlarge newInterval to merge overlapping intervals
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }
        result.add(newInterval);
        return result;
    }
}


