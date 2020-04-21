package com.example.android.treasureHunt.databinding;
import com.example.android.treasureHunt.R;
import com.example.android.treasureHunt.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHuntMainBindingImpl extends ActivityHuntMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHuntMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityHuntMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.activityMapsMain.setTag(null);
        this.hintTextView.setTag(null);
        this.imageView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.android.treasureHunt.GeofenceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.android.treasureHunt.GeofenceViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelGeofenceImageResourceId((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewmodelGeofenceHintResourceId((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelGeofenceImageResourceId(androidx.lifecycle.LiveData<java.lang.Integer> ViewmodelGeofenceImageResourceId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelGeofenceHintResourceId(androidx.lifecycle.LiveData<java.lang.Integer> ViewmodelGeofenceHintResourceId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.LiveData<java.lang.Integer> viewmodelGeofenceImageResourceId = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelGeofenceHintResourceIdGetValue = 0;
        java.lang.Integer viewmodelGeofenceHintResourceIdGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelGeofenceImageResourceIdGetValue = 0;
        java.lang.String contextGetStringViewmodelGeofenceHintResourceId = null;
        android.graphics.drawable.Drawable contextGetDrawableViewmodelGeofenceImageResourceId = null;
        java.lang.Integer viewmodelGeofenceImageResourceIdGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewmodelGeofenceHintResourceId = null;
        com.example.android.treasureHunt.GeofenceViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.geofenceImageResourceId
                        viewmodelGeofenceImageResourceId = viewmodel.getGeofenceImageResourceId();
                    }
                    updateLiveDataRegistration(0, viewmodelGeofenceImageResourceId);


                    if (viewmodelGeofenceImageResourceId != null) {
                        // read viewmodel.geofenceImageResourceId.getValue()
                        viewmodelGeofenceImageResourceIdGetValue = viewmodelGeofenceImageResourceId.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.geofenceImageResourceId.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelGeofenceImageResourceIdGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelGeofenceImageResourceIdGetValue);


                    // read context.getDrawable(androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.geofenceImageResourceId.getValue()))
                    contextGetDrawableViewmodelGeofenceImageResourceId = getRoot().getContext().getDrawable(androidxDatabindingViewDataBindingSafeUnboxViewmodelGeofenceImageResourceIdGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.geofenceHintResourceId
                        viewmodelGeofenceHintResourceId = viewmodel.getGeofenceHintResourceId();
                    }
                    updateLiveDataRegistration(1, viewmodelGeofenceHintResourceId);


                    if (viewmodelGeofenceHintResourceId != null) {
                        // read viewmodel.geofenceHintResourceId.getValue()
                        viewmodelGeofenceHintResourceIdGetValue = viewmodelGeofenceHintResourceId.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.geofenceHintResourceId.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelGeofenceHintResourceIdGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelGeofenceHintResourceIdGetValue);


                    // read context.getString(androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.geofenceHintResourceId.getValue()))
                    contextGetStringViewmodelGeofenceHintResourceId = getRoot().getContext().getString(androidxDatabindingViewDataBindingSafeUnboxViewmodelGeofenceHintResourceIdGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hintTextView, contextGetStringViewmodelGeofenceHintResourceId);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imageView, contextGetDrawableViewmodelGeofenceImageResourceId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.geofenceImageResourceId
        flag 1 (0x2L): viewmodel.geofenceHintResourceId
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}