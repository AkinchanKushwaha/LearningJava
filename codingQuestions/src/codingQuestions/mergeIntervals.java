package codingQuestions;

import java.util.ArrayList;

//Merge Intervals
//Asked in:  Google
//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
//
//You may assume that the intervals were initially sorted according to their start times.
//
//Example 1:
//
//Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
//
//Example 2:
//
//Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
//
//This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
//
//Make sure the returned intervals are also sorted.


//==================================================
//===================SOLUTION=======================

/**
* Definition for an interval.
* public class Interval {
*     int start;
*     int end;
*     Interval() { start = 0; end = 0; }
*     Interval(int s, int e) { start = s; end = e; }
* }
*/ 
public class mergeIntervals {
public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
      if(intervals == null ){
          intervals = new ArrayList<Interval>();
          intervals.add(newInterval);
          return intervals;
      }else if(intervals.size()==0){
           intervals.add(newInterval);
          return intervals;
          
      }
      Interval toInsert = newInterval;    
      
      int i = 0;
      while( i<intervals.size()){
          Interval current = intervals.get(i);
          if(current.end <toInsert.start){
              i++;
              continue;
          }else if( toInsert.end< current.start){
              intervals.add(i, toInsert);
              break;
          }else{
              toInsert.start =Math.min(toInsert.start ,current.start);
              toInsert.end = Math.max(toInsert.end, current.end);
              intervals.remove(i);
          }
      }
      if(i==intervals.size()){
          intervals.add(toInsert);
      }
      return intervals;
         
  }

}
