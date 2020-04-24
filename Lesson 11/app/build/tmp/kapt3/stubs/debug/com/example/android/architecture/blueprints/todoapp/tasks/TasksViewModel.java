package com.example.android.architecture.blueprints.todoapp.tasks;

import java.lang.System;

/**
 * ViewModel for the task list screen.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001MB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00101\u001a\u00020\u0011J\u0006\u00102\u001a\u00020\u0011J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\tJ$\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u00109\u001a\u00020\u0019H\u0002J(\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0<H\u0002J\u000e\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\tJ\u000e\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u0015J\u0006\u0010A\u001a\u00020\u0011J.\u0010B\u001a\u00020\u00112\b\b\u0001\u0010C\u001a\u00020\u00072\b\b\u0001\u0010D\u001a\u00020\u00072\b\b\u0001\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\tH\u0002J\u000e\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u0019J\u000e\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0007J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u000e\u0010,\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/example/android/architecture/blueprints/todoapp/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "tasksRepository", "Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;", "(Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;)V", "_currentFilteringLabel", "Landroidx/lifecycle/MutableLiveData;", "", "_dataLoading", "", "_forceUpdate", "_items", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/architecture/blueprints/todoapp/data/Task;", "_newTaskEvent", "Lcom/example/android/architecture/blueprints/todoapp/Event;", "", "_noTaskIconRes", "_noTasksLabel", "_openTaskEvent", "", "_snackbarText", "_tasksAddViewVisible", "currentFiltering", "Lcom/example/android/architecture/blueprints/todoapp/tasks/TasksFilterType;", "currentFilteringLabel", "getCurrentFilteringLabel", "()Landroidx/lifecycle/LiveData;", "dataLoading", "getDataLoading", "empty", "getEmpty", "isDataLoadingError", "items", "getItems", "newTaskEvent", "getNewTaskEvent", "noTaskIconRes", "getNoTaskIconRes", "noTasksLabel", "getNoTasksLabel", "openTaskEvent", "getOpenTaskEvent", "resultMessageShown", "snackbarText", "getSnackbarText", "tasksAddViewVisible", "getTasksAddViewVisible", "addNewTask", "clearCompletedTasks", "completeTask", "Lkotlinx/coroutines/Job;", "task", "completed", "filterItems", "tasks", "filteringType", "filterTasks", "tasksResult", "Lcom/example/android/architecture/blueprints/todoapp/data/Result;", "loadTasks", "forceUpdate", "openTask", "taskId", "refresh", "setFilter", "filteringLabelString", "noTasksLabelString", "noTaskIconDrawable", "tasksAddVisible", "setFiltering", "requestType", "showEditResultMessage", "result", "showSnackbarMessage", "message", "TasksViewModelFactory", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _forceUpdate = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task>> _items = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task>> items = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _currentFilteringLabel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> currentFilteringLabel = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _noTasksLabel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> noTasksLabel = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _noTaskIconRes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Integer> noTaskIconRes = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _tasksAddViewVisible = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> tasksAddViewVisible = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.architecture.blueprints.todoapp.Event<java.lang.Integer>> _snackbarText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.android.architecture.blueprints.todoapp.Event<java.lang.Integer>> snackbarText = null;
    private com.example.android.architecture.blueprints.todoapp.tasks.TasksFilterType currentFiltering;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isDataLoadingError = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.architecture.blueprints.todoapp.Event<java.lang.String>> _openTaskEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.android.architecture.blueprints.todoapp.Event<java.lang.String>> openTaskEvent = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.architecture.blueprints.todoapp.Event<kotlin.Unit>> _newTaskEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.android.architecture.blueprints.todoapp.Event<kotlin.Unit>> newTaskEvent = null;
    private boolean resultMessageShown;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> empty = null;
    private final com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task>> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getCurrentFilteringLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getNoTasksLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getNoTaskIconRes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getTasksAddViewVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.architecture.blueprints.todoapp.Event<java.lang.Integer>> getSnackbarText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.architecture.blueprints.todoapp.Event<java.lang.String>> getOpenTaskEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.architecture.blueprints.todoapp.Event<kotlin.Unit>> getNewTaskEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEmpty() {
        return null;
    }
    
    /**
     * Sets the current task filtering type.
     *
     * @param requestType Can be [TasksFilterType.ALL_TASKS],
     * [TasksFilterType.COMPLETED_TASKS], or
     * [TasksFilterType.ACTIVE_TASKS]
     */
    public final void setFiltering(@org.jetbrains.annotations.NotNull()
    com.example.android.architecture.blueprints.todoapp.tasks.TasksFilterType requestType) {
    }
    
    private final void setFilter(@androidx.annotation.StringRes()
    int filteringLabelString, @androidx.annotation.StringRes()
    int noTasksLabelString, @androidx.annotation.DrawableRes()
    int noTaskIconDrawable, boolean tasksAddVisible) {
    }
    
    public final void clearCompletedTasks() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job completeTask(@org.jetbrains.annotations.NotNull()
    com.example.android.architecture.blueprints.todoapp.data.Task task, boolean completed) {
        return null;
    }
    
    /**
     * Called by the Data Binding library and the FAB's click listener.
     */
    public final void addNewTask() {
    }
    
    /**
     * Called by Data Binding.
     */
    public final void openTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
    }
    
    public final void showEditResultMessage(int result) {
    }
    
    private final void showSnackbarMessage(int message) {
    }
    
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task>> filterTasks(com.example.android.architecture.blueprints.todoapp.data.Result<? extends java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task>> tasksResult) {
        return null;
    }
    
    /**
     * @param forceUpdate   Pass in true to refresh the data in the [TasksDataSource]
     */
    public final void loadTasks(boolean forceUpdate) {
    }
    
    private final java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task> filterItems(java.util.List<com.example.android.architecture.blueprints.todoapp.data.Task> tasks, com.example.android.architecture.blueprints.todoapp.tasks.TasksFilterType filteringType) {
        return null;
    }
    
    public final void refresh() {
    }
    
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository) {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/architecture/blueprints/todoapp/tasks/TasksViewModel$TasksViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "tasksRepository", "Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;", "(Lcom/example/android/architecture/blueprints/todoapp/data/source/TasksRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class TasksViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        private final com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public TasksViewModelFactory(@org.jetbrains.annotations.NotNull()
        com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository tasksRepository) {
            super();
        }
    }
}