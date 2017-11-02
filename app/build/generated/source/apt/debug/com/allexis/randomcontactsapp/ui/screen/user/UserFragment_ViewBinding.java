// Generated code from Butter Knife. Do not modify!
package com.allexis.randomcontactsapp.ui.screen.user;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.allexis.randomcontactsapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UserFragment_ViewBinding implements Unbinder {
  private UserFragment target;

  private View view2131230953;

  private View view2131230954;

  @UiThread
  public UserFragment_ViewBinding(final UserFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.user_dismiss_fab, "method 'onUserDismissClick'");
    view2131230953 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUserDismissClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.user_like_fab, "method 'onUserLikeClick'");
    view2131230954 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onUserLikeClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131230953.setOnClickListener(null);
    view2131230953 = null;
    view2131230954.setOnClickListener(null);
    view2131230954 = null;
  }
}
