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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
       
        for (Interval old : intervals) {
            if (old.end < newInterval.start) {
                result.add(old);
            } else if (old.start > newInterval.end) {
                result.add(newInterval);
                newInterval = old;
            } else if (old.start <= newInterval.end || old.end <= newInterval.start) {
                newInterval = new Interval(Math.min(old.start, newInterval.start), Math.max(old.end, newInterval.end));
            }
        }
        result.add(newInterval);
        return result;
    
    }
}