package com.example.calendar;

import android.arch.lifecycle.ViewModel;

import java.util.Calendar;

/**
 * Created by junsuk on 2017. 11. 13..
 */

public class MainViewModel extends ViewModel {
    private Calendar mCalendar = Calendar.getInstance();

    public void prevMonth() {
        mCalendar.add(Calendar.MONTH, -1);
    }

    public void nextMonth() {
        mCalendar.add(Calendar.MONTH, 1);
    }

    public Calendar getCalendar() {
        return mCalendar;
    }
}
