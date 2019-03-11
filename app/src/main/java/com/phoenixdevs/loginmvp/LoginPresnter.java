package com.phoenixdevs.loginmvp;



/*Create By Phoenixdevs.ir 7/15/2018*/


class LoginPresnter {
    private LoginView loginView;
    private LoginService loginService;

    public LoginPresnter(LoginView loginView,LoginService loginService) {
        this.loginView = loginView;
        this.loginService = loginService;
    }

    public void onLoginClicked() {

        String username = loginView.getTextInputLayoutUsername().getEditText().getText().toString();
        if(username.isEmpty()){
            loginView.showUsernameError(R.string.username_error);
            return;
        }else{
            loginView.getTextInputLayoutUsername().setErrorEnabled(false);
        }


        String pass = loginView.getTextInputLayoutPassword().getEditText().getText().toString();
        if(pass.isEmpty()){
            loginView.showPasswordError(R.string.password_error);
            return;
        }else{
            loginView.getTextInputLayoutPassword().setErrorEnabled(false);
        }


        boolean loginsuccess=loginService.login(username,pass);
        if(loginsuccess){
            loginView.showMessageLogin(R.string.accept);
            return;
        }else{
            loginView.showMessageLogin(R.string.faild);
        }


    }
}
