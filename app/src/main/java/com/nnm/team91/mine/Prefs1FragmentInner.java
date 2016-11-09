package com.nnm.team91.mine;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.util.Log;

/**
 * Created by tristan on 2016-11-07.
 */

public class Prefs1FragmentInner extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("args", "Arguments: " + getArguments());
        addPreferencesFromResource(R.xml.fragmented_preferences_inner);
    }
}