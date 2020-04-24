package com.example.android.architecture.blueprints.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.architecture.blueprints.todoapp.ScrollChildSwipeRefreshLayout;
import com.example.android.architecture.blueprints.todoapp.addedittask.AddEditTaskViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AddtaskFragBinding extends ViewDataBinding {
  @NonNull
  public final EditText addTaskDescriptionEditText;

  @NonNull
  public final EditText addTaskTitleEditText;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final ScrollChildSwipeRefreshLayout refreshLayout;

  @NonNull
  public final FloatingActionButton saveTaskFab;

  @Bindable
  protected AddEditTaskViewModel mViewmodel;

  protected AddtaskFragBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText addTaskDescriptionEditText, EditText addTaskTitleEditText,
      CoordinatorLayout coordinatorLayout, ScrollChildSwipeRefreshLayout refreshLayout,
      FloatingActionButton saveTaskFab) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addTaskDescriptionEditText = addTaskDescriptionEditText;
    this.addTaskTitleEditText = addTaskTitleEditText;
    this.coordinatorLayout = coordinatorLayout;
    this.refreshLayout = refreshLayout;
    this.saveTaskFab = saveTaskFab;
  }

  public abstract void setViewmodel(@Nullable AddEditTaskViewModel viewmodel);

  @Nullable
  public AddEditTaskViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static AddtaskFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.addtask_frag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AddtaskFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AddtaskFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.addtask_frag, root, attachToRoot, component);
  }

  @NonNull
  public static AddtaskFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.addtask_frag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AddtaskFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AddtaskFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.addtask_frag, null, false, component);
  }

  public static AddtaskFragBinding bind(@NonNull View view) {
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
  public static AddtaskFragBinding bind(@NonNull View view, @Nullable Object component) {
    return (AddtaskFragBinding)bind(component, view, com.example.android.architecture.blueprints.todoapp.R.layout.addtask_frag);
  }
}
