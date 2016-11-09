package com.nnm.team91.mine;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by tristan on 2016-11-07.
 */

public class Prefs2Fragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_dependencies);
    }
}
