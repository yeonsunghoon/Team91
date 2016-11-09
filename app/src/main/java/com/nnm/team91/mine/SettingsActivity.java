package com.nnm.team91.mine;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import java.util.List;

public class SettingsActivity extends PreferenceActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (hasHeaders()) {
            Button button = new Button(this);
            button.setText("Some action");
            setListFooter(button);
        }
    }

    @Override
    public void onBuildHeaders(List<Header> target) {// onCreate보다 먼저 호출되는 콜백 메소드, 액티비티를 생성시점에 한번 호출
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

}