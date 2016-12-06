package com.tayloryan.old_driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    @ViewById(R.id.btn_login)
    protected Button loginButton;

    @Click(R.id.btn_login)
    protected void setLoginButtonOnClick() {
        Intent intent = new Intent(LoginActivity.this, HomeActivity_.class);
        LoginActivity.this.startActivity(intent);
    }
}
