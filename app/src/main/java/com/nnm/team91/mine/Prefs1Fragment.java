package com.nnm.team91.mine;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by tristan on 2016-11-07.
 */

public class Prefs1Fragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fragmented_preferences);
    }
}

