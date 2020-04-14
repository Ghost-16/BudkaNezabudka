package com.example.example.calendar.budka;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.example.R;

public class CalendarActivity extends Fragment {

    public static CalendarActivity newInstance(){
        CalendarActivity f = new CalendarActivity();
        return f;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.activity_calendar, container, false);
        CustomCalendarView customCalendarView = root.findViewById(R.id.custom_calendar_view);
        return root;
    }
}

