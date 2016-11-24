package com.nnm.team91.mine;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.Toast;

public class CustomWidget extends AppWidgetProvider {

    private static final String TAG = "CustomWidget";
    private Context context;

    @Override
    public void onEnabled(Context context) {
        Log.i(TAG, "==onEnabled()==");
        super.onEnabled(context);
    }

}
