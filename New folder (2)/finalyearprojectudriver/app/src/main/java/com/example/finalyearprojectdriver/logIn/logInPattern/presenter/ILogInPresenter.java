package com.example.finalyearprojectdriver.logIn.logInPattern.presenter;

import com.example.finalyearprojectdriver.logIn.logInPattern.view.LogInActivity;
import com.example.finalyearprojectdriver.logIn.OtpPattern.OtpActivity;

public interface ILogInPresenter {
    void doLogin(String name);
    void initUser(String number);
    void setProgressBarVisiblity(int visiblity);
    void switchToOTP(LogInActivity logInActivity, Class<OtpActivity> otpActivityClass);

}
