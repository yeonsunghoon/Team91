package com.nnm.team91.mine;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CustomWidget extends AppWidgetProvider {

    private  static final String TAG = "CustomWidget";
    private Context context;

    @Override
    public void onEnabled(Context context) {
        Log.i(TAG, "==onEnabled()==");
        super.onEnabled(context);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }
}
