package com.tayloryan.old_driver.ui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.widget.Button;
import android.widget.EditText;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.tayloryan.old_driver.R;
import com.tayloryan.old_driver.utils.ToolBarConfig;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_login)
public class LoginActivity extends BaseActivity {

    @ViewById(R.id.et_username)
    protected EditText et_username;
    @ViewById(R.id.et_password)
    protected EditText et_password;
    @ViewById(R.id.btn_login)
    protected Button loginButton;
    @ViewById(R.id.navigation_bar)
    BottomNavigationBar navigationBar;

    @AfterViews
    protected void afterViews() {
        initialToolBar();
        initialNavigationBar();
    }

    private void initialToolBar() {
        ToolBarConfig.with(this)
                .showBackButton(false)
                .setLogo(R.drawable.ic_tab_contacts)
                .setTitle(R.string.tool_bar_title)
                .configuration();
    }

    private void initialNavigationBar() {
        navigationBar
                .setMode(BottomNavigationBar.MODE_SHIFTING)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE)
                .setBarBackgroundColor("#FE9901")
                .setActiveColor("#FFFFFF")
                .addItem(new BottomNavigationItem(R.drawable.ic_call_tab, "Call"))
                .addItem(new BottomNavigationItem(R.drawable.ic_contacts_tab, "Contacts"))
                .addItem(new BottomNavigationItem(R.drawable.ic_message_tab, "Message"))
                .addItem(new BottomNavigationItem(R.drawable.ic_security_tab, "Security"))
                .initialise();

    }

    @Click(R.id.btn_login)
    protected void setLoginButtonOnClick() {
        Intent intent = new Intent(LoginActivity.this, HomeActivity_.class);
        LoginActivity.this.startActivity(intent);
    }

}
