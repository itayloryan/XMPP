package com.tayloryan.old_driver.ui;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

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

    @AfterViews
    protected void afterViews() {
        initialToolBar();
    }

    private void initialToolBar() {
        ToolBarConfig.with(this)
                .showBackButton(false)
                .setLogo(R.drawable.ic_tab_contacts)
                .setTitle(R.string.tool_bar_title)
                .configuration();
    }

    @Click(R.id.btn_login)
    protected void setLoginButtonOnClick() {
        Intent intent = new Intent(LoginActivity.this, HomeActivity_.class);
        LoginActivity.this.startActivity(intent);
    }

}
