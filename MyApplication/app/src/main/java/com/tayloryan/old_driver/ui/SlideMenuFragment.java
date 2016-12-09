package com.tayloryan.old_driver.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.tayloryan.old_driver.R;
import org.androidannotations.annotations.EFragment;

@EFragment(R.layout.left_menu_fragment)
public class SlideMenuFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("TAG", "onAttach");
    }
}
