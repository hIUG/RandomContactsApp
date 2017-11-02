// Generated code from Butter Knife. Do not modify!
package com.allexis.randomcontactsapp.ui.screen.splash;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.allexis.randomcontactsapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SplashActivity_ViewBinding implements Unbinder {
  private SplashActivity target;

  @UiThread
  public SplashActivity_ViewBinding(SplashActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SplashActivity_ViewBinding(SplashActivity target, View source) {
    this.target = target;

    target.randomContactsIconIv = Utils.findRequiredViewAsType(source, R.id.random_contacts_icon_iv, "field 'randomContactsIconIv'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SplashActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.randomContactsIconIv = null;
  }
}
