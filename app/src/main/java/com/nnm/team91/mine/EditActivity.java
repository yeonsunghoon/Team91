package com.nnm.team91.mine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EditActivity extends AppCompatActivity {
    TextView textView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        // 현재시간으로 갱신
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        // format()의 형으로 String변수에 추가
        String today = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date));
    }

}
