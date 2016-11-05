package com.nnm.team91.mine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler hd = new Handler();
        hd.postDelayed(new splashHandler(), SPLASH_DISPLAY_LENGTH); // 지연처리, 보통 3초
    }

    private class splashHandler implements Runnable {
        public void run() {
            startActivity(new Intent(getApplication(), TimelineActivity.class)); // 로딩이 끝난 후 이동할 Activity
            SplashActivity.this.finish(); // 로딩 페이지 Activity stack에서 제거
        }
    }

} // end of SplashActivity
