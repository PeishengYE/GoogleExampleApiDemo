package com.radioyps.apidemos.content;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

//Need the following import to get access to the app resources, since this
//class is in a sub-package.
import com.radioyps.apidemos.R;

public class ProcessTextLauncher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.process_text_send);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

}
