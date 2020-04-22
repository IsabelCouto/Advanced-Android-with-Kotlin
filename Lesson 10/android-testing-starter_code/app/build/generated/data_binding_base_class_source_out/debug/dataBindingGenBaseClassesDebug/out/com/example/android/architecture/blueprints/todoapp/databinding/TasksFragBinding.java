package com.example.android.architecture.blueprints.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.android.architecture.blueprints.todoapp.ScrollChildSwipeRefreshLayout;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TasksFragBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton addTaskFab;

  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final TextView filteringText;

  @NonNull
  public final ImageView noTasksIcon;

  @NonNull
  public final LinearLayout noTasksLayout;

  @NonNull
  public final TextView noTasksText;

  @NonNull
  public final ScrollChildSwipeRefreshLayout refreshLayout;

  @NonNull
  public final RelativeLayout tasksContainerLayout;

  @NonNull
  public final LinearLayout tasksLinearLayout;

  @NonNull
  public final RecyclerView tasksList;

  @Bindable
  protected TasksViewModel mViewmodel;

  protected TasksFragBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton addTaskFab, CoordinatorLayout coordinatorLayout, TextView filteringText,
      ImageView noTasksIcon, LinearLayout noTasksLayout, TextView noTasksText,
      ScrollChildSwipeRefreshLayout refreshLayout, RelativeLayout tasksContainerLayout,
      LinearLayout tasksLinearLayout, RecyclerView tasksList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addTaskFab = addTaskFab;
    this.coordinatorLayout = coordinatorLayout;
    this.filteringText = filteringText;
    this.noTasksIcon = noTasksIcon;
    this.noTasksLayout = noTasksLayout;
    this.noTasksText = noTasksText;
    this.refreshLayout = refreshLayout;
    this.tasksContainerLayout = tasksContainerLayout;
    this.tasksLinearLayout = tasksLinearLayout;
    this.tasksList = tasksList;
  }

  public abstract void setViewmodel(@Nullable TasksViewModel viewmodel);

  @Nullable
  public TasksViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static TasksFragBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tasks_frag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TasksFragBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TasksFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.tasks_frag, root, attachToRoot, component);
  }

  @NonNull
  public static TasksFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tasks_frag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TasksFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TasksFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.tasks_frag, null, false, component);
  }

  public static TasksFragBinding bind(@NonNull View view) {
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
  public static TasksFragBinding bind(@NonNull View view, @Nullable Object component) {
    return (TasksFragBinding)bind(component, view, com.example.android.architecture.blueprints.todoapp.R.layout.tasks_frag);
  }
}
