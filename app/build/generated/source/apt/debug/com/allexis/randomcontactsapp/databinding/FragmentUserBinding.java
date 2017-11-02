package com.allexis.randomcontactsapp.databinding;
import com.allexis.randomcontactsapp.R;
import com.allexis.randomcontactsapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentUserBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_dismiss_fab, 5);
        sViewsWithIds.put(R.id.user_like_fab, 6);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    public final android.support.design.widget.FloatingActionButton userDismissFab;
    @NonNull
    public final android.support.design.widget.FloatingActionButton userLikeFab;
    @NonNull
    public final android.widget.TextView userLocation;
    @NonNull
    public final android.widget.TextView userName;
    @NonNull
    public final android.widget.TextView userProfileName;
    @NonNull
    public final android.widget.ImageView userProfilePicture;
    // variables
    @Nullable
    private com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel mViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.userDismissFab = (android.support.design.widget.FloatingActionButton) bindings[5];
        this.userLikeFab = (android.support.design.widget.FloatingActionButton) bindings[6];
        this.userLocation = (android.widget.TextView) bindings[4];
        this.userLocation.setTag(null);
        this.userName = (android.widget.TextView) bindings[3];
        this.userName.setTag(null);
        this.userProfileName = (android.widget.TextView) bindings[1];
        this.userProfileName.setTag(null);
        this.userProfilePicture = (android.widget.ImageView) bindings[2];
        this.userProfilePicture.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    @Nullable
    public com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel getViewModel() {
        return mViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.displayName) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.user) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.userName) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.userLocation) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelUserName = null;
        java.lang.String viewModelDisplayName = null;
        java.lang.String viewModelUserGender = null;
        java.lang.String viewModelUserPictureLarge = null;
        java.lang.String viewModelUserLocation = null;
        com.allexis.randomcontactsapp.core.network.service.randomuser.model.User viewModelUser = null;
        com.allexis.randomcontactsapp.core.network.service.randomuser.model.Picture viewModelUserPicture = null;
        com.allexis.randomcontactsapp.ui.screen.user.UserFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userName
                        viewModelUserName = viewModel.getUserName();
                    }
            }
            if ((dirtyFlags & 0x23L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayName
                        viewModelDisplayName = viewModel.getDisplayName();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userLocation
                        viewModelUserLocation = viewModel.getUserLocation();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.user
                        viewModelUser = viewModel.getUser();
                    }


                    if (viewModelUser != null) {
                        // read viewModel.user.gender
                        viewModelUserGender = viewModelUser.getGender();
                        // read viewModel.user.picture
                        viewModelUserPicture = viewModelUser.getPicture();
                    }


                    if (viewModelUserPicture != null) {
                        // read viewModel.user.picture.large
                        viewModelUserPictureLarge = viewModelUserPicture.getLarge();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.userLocation, viewModelUserLocation);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            com.allexis.randomcontactsapp.core.base.databinding.common.CustomBindingAdapter.loadColorBasedOnGender(this.userName, viewModelUserGender);
            com.allexis.randomcontactsapp.core.base.databinding.common.CustomBindingAdapter.loadImage(this.userProfilePicture, viewModelUserPictureLarge);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.userName, viewModelUserName);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.userProfileName, viewModelDisplayName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static FragmentUserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentUserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FragmentUserBinding>inflate(inflater, com.allexis.randomcontactsapp.R.layout.fragment_user, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static FragmentUserBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentUserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.allexis.randomcontactsapp.R.layout.fragment_user, null, false), bindingComponent);
    }
    @NonNull
    public static FragmentUserBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static FragmentUserBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/fragment_user_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FragmentUserBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.displayName
        flag 2 (0x3L): viewModel.user
        flag 3 (0x4L): viewModel.userName
        flag 4 (0x5L): viewModel.userLocation
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}