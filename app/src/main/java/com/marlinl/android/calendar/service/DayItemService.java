package com.marlinl.android.calendar.service;

import com.marlinl.android.calendar.mode.DayItem;
import java.util.List;

/**
 * Created by alice on 2016/10/4.
 */

public class DayItemService {
    DayItem CalToday(long todayEn){
        //long todayCn = ChineseCalendar(todayEn);
       // String holidayDay = HolidayCalendar(todayEn, todayCn);
        //DayItem dayItem = new DayItem(todayEn, todayCn, holidayDay);
        return null;
    }
    List<DayItem> CalThisWeek(long todayEn){
        return null;
    }
    List<DayItem> CalThisMonth(long todayEn){
        return null;
    }
    List<DayItem> CalAnyLength(long todayEn, int dayNo){
        return null;
    }
}
