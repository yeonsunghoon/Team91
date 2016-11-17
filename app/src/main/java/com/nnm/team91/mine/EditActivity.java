package com.nnm.team91.mine;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EditActivity extends AppCompatActivity {
    Button timingBtn, positionBtn, sharpBtn, checkBtn;
    TextView dateTxt, contentTxt;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //TODO: dateformat으로 어떻게 해보자

        dateTxt = (TextView) findViewById(R.id.now_txt);
        contentTxt = (TextView) findViewById(R.id.content_txt);

        // 현재 시간을 msec으로 구한다.
        long now = System.currentTimeMillis();

        // 현재 시간을 저장 한다.
        Date date = new Date(now);
        SimpleDateFormat CurDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        /*
        *        시간 포맷 지정
                SimpleDateFormat CurDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
                SimpleDateFormat CurTimeFormat = new SimpleDateFormat("HH시 mm분");
                SimpleDateFormat CurYearFormat = new SimpleDateFormat("yyyy");
                SimpleDateFormat CurMonthFormat = new SimpleDateFormat("MM");
                SimpleDateFormat CurDayFormat = new SimpleDateFormat("dd");
                SimpleDateFormat CurHourFormat = new SimpleDateFormat("HH");
                SimpleDateFormat CurMinuteFormat = new SimpleDateFormat("mm");
        * */
        String strCurDate = CurDateFormat.format(date);
        dateTxt.setText(strCurDate);


/*        //TODO: 기능 구현 (리스너 연결 후 기능 구현하지 않을 시 오류발생으로 주석처리)
       timingBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               long now = System.currentTimeMillis();
               Date date1 = new Date(now);
               SimpleDateFormat CurTimeFormat = new SimpleDateFormat("HH시 mm분");
               String strCurTime = CurTimeFormat.format(date1);
                contentTxt.setText(strCurTime);
           }
       });


        positionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        sharpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
    */
    }
}
