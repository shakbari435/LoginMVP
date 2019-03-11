package com.phoenixdevs.loginmvp;

import android.support.design.widget.TextInputLayout;


/*Create By Phoenixdevs.ir 7/15/2018*/

interface LoginView {
    TextInputLayout getTextInputLayoutUsername();
    void showUsernameError(int resID);

    TextInputLayout getTextInputLayoutPassword();
    void showPasswordError(int resId);

    void startActivity();


    void showMessageLogin(int resId);
}
