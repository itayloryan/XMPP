package com.tayloryan.old_driver;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tayloryan.old_driver.ui.BaseActivity;
import com.tayloryan.old_driver.ui.SlideMenuFragment;
import com.tayloryan.old_driver.ui.SlideMenuFragment_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_home)
public class HomeActivity extends BaseActivity {

    private SlidingMenu mSlidingMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSlidingMenu = new SlidingMenu(this);
    }
    @AfterViews
    protected void afterViews() {
        initMenu();
    }

    private void initMenu() {
        //Set menu layout
        mSlidingMenu.setMenu(R.layout.slide_menu_layout);
        //Set menu slide from left side
        mSlidingMenu.setMode(SlidingMenu.LEFT);
        //Set menu can be touched out full screen
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //Set shadow resource and width
        mSlidingMenu.setShadowWidthRes(R.dimen.menu_shadow_width);
        //mSlidingMenu.setShadowDrawable(R.drawable.shadow);
        //Set main page width after menu show
        mSlidingMenu.setBehindOffsetRes(R.dimen.menu_shadow_width);
        //Set fade value
        mSlidingMenu.setFadeDegree(0.35f);
        /**
         * SLIDING_WINDOW will include the Title/ActionBar in the content
         * section of the SlidingMenu, while SLIDING_CONTENT does not.
         */
        mSlidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        SlideMenuFragment menuFragment = new SlideMenuFragment_();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.menu_container, menuFragment, "TAG")
                .commit();
    }

}
