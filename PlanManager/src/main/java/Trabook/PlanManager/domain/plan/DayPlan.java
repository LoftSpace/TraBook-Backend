package Trabook.PlanManager.domain.plan;

import lombok.Getter;
import lombok.Setter;


import java.time.LocalTime;
import java.util.List;


@Getter @Setter
public class DayPlan {
    private long planId;
    private int day;
    private LocalTime startTime;
    private LocalTime endTime;
    private List<Schedule> scheduleList;

    @Getter
    @Setter
    public static class Schedule{
        private long planId;
        private int day;
        private int order;
        private int time;
        private long placeId;
        private String imageSrc;
        private String placeName;
        private double latitude;
        private double longtitude;

        public Schedule() {}

        public Schedule(long planId, int day, int order, int time, long placeId, String imageSrc, String placeName, double latitude, double longtitude) {
            this.planId = planId;
            this.day = day;
            this.order = order;
            this.time = time;
            this.placeId = placeId;
            this.imageSrc = imageSrc;
            this.placeName = placeName;
            this.latitude = latitude;
            this.longtitude = longtitude;
        }
    }
    public DayPlan() {}

    public DayPlan( long planId, int day, LocalTime startTime, LocalTime endTime, List<Schedule> scheduleList) {
        this.planId = planId;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.scheduleList = scheduleList;
    }
}
