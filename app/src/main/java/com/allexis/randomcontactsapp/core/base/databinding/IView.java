package com.allexis.randomcontactsapp.core.base.databinding;

/**
 * Created by allexis on 11/1/17.
 */

public interface IView {

    void showShortToast(String message);

    void showLongToast(String message);

    void error(Throwable e);
}
