package jameskithu2.com.savingchallange;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by JAMES on 1/26/2017.
 */

public class FragmentSetting extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.setting);
    }
}
