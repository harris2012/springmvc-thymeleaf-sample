package cn.savory.demoproject.controllsers;

import org.springframework.stereotype.Component;

@Component
public class BasicConfig {

    private String appId = "abc123";

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
