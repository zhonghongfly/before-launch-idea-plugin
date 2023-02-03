package com.zhonghong.beforelaunch;

import com.intellij.execution.configurations.RunConfigurationOptions;
import com.intellij.openapi.components.StoredProperty;

/**
 * 配置选项类
 * @author zhonghong
 */
public class BeforeLaunchRunConfigurationOptions extends RunConfigurationOptions {
    private final StoredProperty<String> scriptName = string("").provideDelegate(this, "scriptName");

    public String getScriptName() {
        return this.scriptName.getValue(this);
    }

    public void setScriptName(String scriptName) {
        this.scriptName.setValue(this, scriptName);
    }
}
