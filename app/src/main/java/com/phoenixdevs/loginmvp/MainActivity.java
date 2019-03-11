package com.phoenixdevs.loginmvp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



/*Create By Phoenixdevs.ir 7/15/2018*/

public class MainActivity extends AppCompatActivity implements LoginView {
    private LoginPresnter loginPresnter;
    private TextInputLayout username,password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindView();

        loginPresnter = new LoginPresnter(this, new LoginService());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresnter.onLoginClicked();
            }
        });


    }



    private void BindView() {
        btn=findViewById(R.id.btn);
        username=findViewById(R.id.user);
        password=findViewById(R.id.pass);
    }







    @Override
    public TextInputLayout getTextInputLayoutUsername() {
        return username;
    }

    @Override
    public void showUsernameError(int resID) {
        username.setError(getString(resID));

    }

    @Override
    public TextInputLayout getTextInputLayoutPassword() {
        return password;
    }

    @Override
    public void showPasswordError(int resId) {
        password.setError(getString(resId));
    }

    @Override
    public void startActivity() {
        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void showMessageLogin(int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    }


}
