package com.example.calendar;

import java.util.Date;

/**
 * Created by junsuk on 2017. 11. 13..
 */

public class MyDate {
    private Date date;
    private Date lune;

    public MyDate(Date date) {
        this.date = date;

        // 음력 계산
        convertDateToLune();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLune() {
        return lune;
    }

    public void setLune(Date lune) {
        this.lune = lune;
    }

    private void convertDateToLune() {
        // 음력 변환
        lune = date;
    }
}
