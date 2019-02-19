package MovieScheduling;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class MovieSchedule {
    private String movieName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public MovieSchedule(String mName, LocalDateTime startTime, LocalDateTime endTime){
        this.movieName = mName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "MovieSchedule{" +
                "movieName='" + movieName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }


}

