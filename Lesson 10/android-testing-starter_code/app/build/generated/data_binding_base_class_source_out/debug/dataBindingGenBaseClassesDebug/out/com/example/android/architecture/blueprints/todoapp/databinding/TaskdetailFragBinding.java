package com.example.android.architecture.blueprints.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.architecture.blueprints.todoapp.ScrollChildSwipeRefreshLayout;
import com.example.android.architecture.blueprints.todoapp.taskdetail.TaskDetailViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TaskdetailFragBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final FloatingActionButton editTaskFab;

  @NonNull
  public final ScrollChildSwipeRefreshLayout refreshLayout;

  @NonNull
  public final CheckBox taskDetailCompleteCheckbox;

  @NonNull
  public final TextView taskDetailDescriptionText;

  @NonNull
  public final TextView taskDetailTitleText;

  @Bindable
  protected TaskDetailViewModel mViewmodel;

  protected TaskdetailFragBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CoordinatorLayout coordinatorLayout, FloatingActionButton editTaskFab,
      ScrollChildSwipeRefreshLayout refreshLayout, CheckBox taskDetailCompleteCheckbox,
      TextView taskDetailDescriptionText, TextView taskDetailTitleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coordinatorLayout = coordinatorLayout;
    this.editTaskFab = editTaskFab;
    this.refreshLayout = refreshLayout;
    this.taskDetailCompleteCheckbox = taskDetailCompleteCheckbox;
    this.taskDetailDescriptionText = taskDetailDescriptionText;
    this.taskDetailTitleText = taskDetailTitleText;
  }

  public abstract void setViewmodel(@Nullable TaskDetailViewModel viewmodel);

  @Nullable
  public TaskDetailViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static TaskdetailFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.taskdetail_frag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TaskdetailFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TaskdetailFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.taskdetail_frag, root, attachToRoot, component);
  }

  @NonNull
  public static TaskdetailFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.taskdetail_frag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TaskdetailFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TaskdetailFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.taskdetail_frag, null, false, component);
  }

  public static TaskdetailFragBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static TaskdetailFragBinding bind(@NonNull View view, @Nullable Object component) {
    return (TaskdetailFragBinding)bind(component, view, com.example.android.architecture.blueprints.todoapp.R.layout.taskdetail_frag);
  }
}
