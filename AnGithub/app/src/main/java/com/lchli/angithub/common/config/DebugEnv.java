package com.lchli.angithub.common.config;

/**
 * Created by lchli on 2016/10/26.
 */

public class DebugEnv implements AppEnvironment {
    @Override
    public String getIP() {
        return "https://api.github.com";
    }

    @Override
    public boolean logFlag() {
        return true;
    }
}
