package MovieScheduling;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public List<MovieSchedule> execute(List<MovieSchedule> input){
        List<MovieSchedule> result = new ArrayList<MovieSchedule>();
        //Sort the movie schedule by end date
        Collections.sort(input, new Comparator<MovieSchedule>() {
            @Override
            public int compare(MovieSchedule o1, MovieSchedule o2) {
                return o1.getEndTime().compareTo(o2.getEndTime());
            }
        });

        LocalDateTime periodCoveredBeginTime = LocalDateTime.MIN;
        LocalDateTime periodCoveredEndTime = LocalDateTime.MIN;

        for(MovieSchedule i : input){
            if(i.getStartTime().isAfter(periodCoveredEndTime)){
                result.add(i);
                if(periodCoveredBeginTime.equals(LocalTime.MIN)) {
                    periodCoveredBeginTime = i.getStartTime();
                }
                periodCoveredEndTime = i.getEndTime();
            }
        }

        return result;
    }
}
