package com.allexis.randomcontactsapp.core.base.databinding.fragment;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.os.Bundle;

/**
 * Created by allexis on 11/1/17.
 */

public abstract class BaseBindingFragmentViewModel<F extends BaseBindingFragment> extends BaseObservable {


    private F fragment;
    private Activity activity;

    public BaseBindingFragmentViewModel(F fragment) {
        this.fragment = fragment;
        this.activity = this.fragment.getActivity();
    }

    public abstract <T extends BaseBindingFragmentViewModel> T getViewModel();

    public F getFragment() {
        return fragment;
    }

    public Activity getActivity() {
        return activity;
    }

    public void onViewCreated() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onDestroyView() {
    }

    public void onSaveInstanceState(Bundle outState) {
    }

    public void onViewStateRestored(Bundle savedInstanceState) {
    }
}
