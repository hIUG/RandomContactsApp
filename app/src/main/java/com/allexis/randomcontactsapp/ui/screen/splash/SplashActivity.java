package com.allexis.randomcontactsapp.ui.screen.splash;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.ui.screen.home.HomeActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.allexis.randomcontactsapp.core.util.AnimationConstants.ANIM_PROPERTY_NAME_ALPHA;
import static com.allexis.randomcontactsapp.core.util.AnimationConstants.SPLASH_ANIM_DELAY;
import static com.allexis.randomcontactsapp.core.util.AnimationConstants.SPLASH_ANIM_DURATION;
import static com.allexis.randomcontactsapp.core.util.AnimationConstants.SPLASH_ANIM_REPEAT_COUNT;

/**
 * Created by allexis on 10/11/17.
 */
public class SplashActivity extends AppCompatActivity implements Animator.AnimatorListener {

    @BindView(R.id.random_contacts_icon_iv)
    ImageView randomContactsIconIv;

    private ObjectAnimator splashImageAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ButterKnife.bind(this);

        animateSplashImage();
    }

    private void animateSplashImage() {
        if (splashImageAnimator == null || splashImageAnimator.isStarted()) {
            splashImageAnimator = ObjectAnimator.ofPropertyValuesHolder(randomContactsIconIv,
                    PropertyValuesHolder.ofFloat(ANIM_PROPERTY_NAME_ALPHA, 1F, 0F, 0.5F, 1F, 0F));
            splashImageAnimator.setStartDelay(SPLASH_ANIM_DELAY);
            splashImageAnimator.setDuration(SPLASH_ANIM_DURATION);
            splashImageAnimator.setInterpolator(new FastOutSlowInInterpolator());
            splashImageAnimator.setRepeatCount(SPLASH_ANIM_REPEAT_COUNT);
            splashImageAnimator.addListener(this);
            splashImageAnimator.start();
        }
    }

    private void goToHomeActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        ActivityOptions activityOptions = ActivityOptions.makeCustomAnimation(this,
                R.anim.activity_anim_fade_in, R.anim.activity_anim_fade_out);
        startActivity(intent, activityOptions.toBundle());
        finish();
    }

    @Override
    public void onAnimationStart(Animator animation) {
    }

    @Override
    public void onAnimationEnd(Animator animation) {
        goToHomeActivity();
    }

    @Override
    public void onAnimationCancel(Animator animation) {
        goToHomeActivity();
    }

    @Override
    public void onAnimationRepeat(Animator animation) {
    }
}
