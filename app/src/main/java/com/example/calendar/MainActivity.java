package com.example.calendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Calendar mCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 지금
        mCalendar = Calendar.getInstance();
        setUpAdapter();
    }

    public void prevMonth(View view) {
        mCalendar.add(Calendar.MONTH, -1);
        setUpAdapter();
    }

    public void nextMonth(View view) {
        mCalendar.add(Calendar.MONTH, 1);
        setUpAdapter();
    }

    private void setUpAdapter() {
        CalendarAdapter adapter = new CalendarAdapter(mCalendar);

        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
