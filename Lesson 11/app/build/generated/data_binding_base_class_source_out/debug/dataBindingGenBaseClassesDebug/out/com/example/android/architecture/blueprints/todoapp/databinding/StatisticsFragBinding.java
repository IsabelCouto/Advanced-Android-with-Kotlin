package com.example.android.architecture.blueprints.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.architecture.blueprints.todoapp.ScrollChildSwipeRefreshLayout;
import com.example.android.architecture.blueprints.todoapp.statistics.StatisticsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class StatisticsFragBinding extends ViewDataBinding {
  @NonNull
  public final ScrollChildSwipeRefreshLayout refreshLayout;

  @NonNull
  public final LinearLayout statisticsLayout;

  @NonNull
  public final TextView statsActiveText;

  @NonNull
  public final TextView statsCompletedText;

  @Bindable
  protected StatisticsViewModel mViewmodel;

  protected StatisticsFragBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ScrollChildSwipeRefreshLayout refreshLayout, LinearLayout statisticsLayout,
      TextView statsActiveText, TextView statsCompletedText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.refreshLayout = refreshLayout;
    this.statisticsLayout = statisticsLayout;
    this.statsActiveText = statsActiveText;
    this.statsCompletedText = statsCompletedText;
  }

  public abstract void setViewmodel(@Nullable StatisticsViewModel viewmodel);

  @Nullable
  public StatisticsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static StatisticsFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.statistics_frag, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static StatisticsFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<StatisticsFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.statistics_frag, root, attachToRoot, component);
  }

  @NonNull
  public static StatisticsFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.statistics_frag, null, false, component)
   */
  @NonNull
  @Deprecated
  public static StatisticsFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<StatisticsFragBinding>inflateInternal(inflater, com.example.android.architecture.blueprints.todoapp.R.layout.statistics_frag, null, false, component);
  }

  public static StatisticsFragBinding bind(@NonNull View view) {
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
  public static StatisticsFragBinding bind(@NonNull View view, @Nullable Object component) {
    return (StatisticsFragBinding)bind(component, view, com.example.android.architecture.blueprints.todoapp.R.layout.statistics_frag);
  }
}
