package com.nnm.team91.mine;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditActivity extends AppCompatActivity {
    Button timingBtn, positionBtn, sharpBtn, checkBtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //TODO: dateformat으로 어떻게 해보자
        // 현재시간으로 갱신
//        Calendar calendar = Calendar.getInstance();
//        java.util.Date date = calendar.getTime();
//        // format()의 형으로 String변수에 추가
//        String today = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date));


        /* //TODO: 기능 구현 (리스너 연결 후 기능 구현하지 않을 시 오류발생으로 주석처리)
       timingBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

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
