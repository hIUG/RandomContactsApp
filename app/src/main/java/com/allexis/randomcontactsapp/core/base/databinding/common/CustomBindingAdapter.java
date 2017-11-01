package com.allexis.randomcontactsapp.core.base.databinding.common;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.TextView;

import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.core.util.UserUtil;
import com.squareup.picasso.Picasso;

/**
 * Created by allexis on 11/1/17.
 */

public class CustomBindingAdapter {

    @BindingAdapter({"picture"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .into(view);
    }

    @BindingAdapter({"colorBasedOnGender"})
    public static void loadColorBasedOnGender(TextView view, String gender) {
        if (UserUtil.isMale(gender)) {
            view.setTextColor(ContextCompat.getColor(view.getContext(), R.color.name_text_male));
        } else {
            view.setTextColor(ContextCompat.getColor(view.getContext(), R.color.name_text_female));
        }
    }
}
