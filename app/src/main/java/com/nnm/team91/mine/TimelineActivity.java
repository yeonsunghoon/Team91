package com.nnm.team91.mine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimelineActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 101;
    TextView todoTxt, diaryTxt, expenseTxt;
    Button calendarBtn, searchBtn, plusBtn, settingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        final FragmentManager fragmentManager = getSupportFragmentManager();
        TodoFragment todoFragment = (TodoFragment) fragmentManager.findFragmentById(R.id.todo_fm);
        DiaryFragment diaryFragment = (DiaryFragment) fragmentManager.findFragmentById(R.id.diary_fm);
        ExpenseFragment expenseFragment = (ExpenseFragment) fragmentManager.findFragmentById(R.id.expense_fm);


        todoTxt = (TextView) findViewById(R.id.todo_txt);
        diaryTxt = (TextView) findViewById(R.id.diary_txt);
        expenseTxt = (TextView) findViewById(R.id.expense_txt);
        calendarBtn = (Button) findViewById(R.id.calendar_btn);
        searchBtn = (Button) findViewById(R.id.search_btn);
        plusBtn = (Button) findViewById(R.id.plus_btn);
        settingBtn = (Button) findViewById(R.id.setting_btn);

        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //TODO: 캘린더 버튼 클릭시 년/월/일 상자가 뜰 수 있도록 수정
                DialogFragment picker = new DatePickerFragment();
                picker.show(getSupportFragmentManager(), "DatePicker");
            }
        });

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimelineActivity.this, SearchActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimelineActivity.this, EditActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TimelineActivity.this, SettingsActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }

        });

    } // end of onCreate

}
