package com.tayloryan.old_driver;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.tayloryan.old_driver.ui.BaseActivity;

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
    protected void initMenu() {
        mSlidingMenu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        mSlidingMenu.setShadowWidthRes(R.dimen.menu_shadow_width);
        //mSlidingMenu.setShadowDrawable(R.drawable.shadow);

        // 设置滑动菜单视图的宽度
        mSlidingMenu.setBehindOffsetRes(R.dimen.menu_shadow_width);
        // 设置渐入渐出效果的值
        mSlidingMenu.setFadeDegree(0.35f);
        /**
         * SLIDING_WINDOW will include the Title/ActionBar in the content
         * section of the SlidingMenu, while SLIDING_CONTENT does not.
         */
        mSlidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        //为侧滑菜单设置布局
        mSlidingMenu.setMenu(R.layout.slide_menu_layout);
    }


}
