package com.zhonghong.beforelaunch;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.BaseState;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Configuration Factory
 * @author zhonghong
 */
public class BeforeLaunchConfigurationFactory extends ConfigurationFactory {

    protected BeforeLaunchConfigurationFactory(@NotNull ConfigurationType type) {
        super(type);
    }

    @Override
    public @NotNull RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new BeforeLaunchRunConfiguration(project, this, "BeforeLaunch");
    }

    @Override
    public @Nullable Class<? extends BaseState> getOptionsClass() {
        return super.getOptionsClass();
    }
}
