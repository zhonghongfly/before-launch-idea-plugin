package com.zhonghong.beforelaunch.task;

import com.intellij.execution.BeforeRunTask;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;

/**
 * clean target task
 * @author zhonghong
 */
public class CleanTargetTask extends BeforeRunTask<CleanTargetTask> {

    public CleanTargetTask(@NotNull Key<CleanTargetTask> providerId) {
        super(providerId);
        setEnabled(true);
    }
}
