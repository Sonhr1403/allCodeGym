import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

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

    public StopWatch() {
    }

    public void start() {
        startTime = LocalDateTime.now();
    }

    public void stop() {
        endTime = LocalDateTime.now();
    }

    public long getElapsedTime() {
        return endTime.getNano() / 1000000 - startTime.getNano() / 1000000;
    }

}
