package com.marlinl.android.calendar.mode;

/**
 * Created by alice on 2016/10/4.
 */

public class DayItem {

    private Long todayEn;
    private Long todayCn;
    private String holiday;
    private Integer weekNo;
    private Integer monthNo;
    private Integer yearNo;

    public void DayItem (Long todayEn, Long todayCn, String holiday){
        this.todayCn = todayCn;
        this.todayEn = todayEn;
        this.holiday = holiday;
    }

    public Integer getWeekNo() {
        return weekNo;
    }

    public void setWeekNo(Integer weekNo) {
        this.weekNo = weekNo;
    }

    public Integer getMonthNo() {
        return monthNo;
    }

    public void setMonthNo(Integer monthNo) {
        this.monthNo = monthNo;
    }

    public Integer getYearNo() {
        return yearNo;
    }

    public void setYearNo(Integer yearNo) {
        this.yearNo = yearNo;
    }


    public Long getTodayEn() {
        return todayEn;
    }

    public void setTodayEn(Long todayEn) {
        this.todayEn = todayEn;
    }

    public Long getTodayCn() {
        return todayCn;
    }

    public void setTodayCn(Long todayCn) {
        this.todayCn = todayCn;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }



}
