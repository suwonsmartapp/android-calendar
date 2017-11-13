package com.example.calendar;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // 지금
        setUpAdapter();
    }

    public void prevMonth(View view) {
        mViewModel.prevMonth();
        setUpAdapter();
    }

    public void nextMonth(View view) {
        mViewModel.nextMonth();
        setUpAdapter();
    }

    private void setUpAdapter() {
        CalendarAdapter adapter = new CalendarAdapter(mViewModel.getCalendar());

        GridView gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);
    }
}
