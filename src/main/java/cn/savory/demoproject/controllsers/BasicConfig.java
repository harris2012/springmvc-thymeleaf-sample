package cn.savory.demoproject.controllsers;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BasicConfig {

    private String appId = "abc123";

    public String getAppId() {
        return appId;
    }

    public List<String> getNames() {
        List<String> items = new ArrayList<String>();
        items.add("tom");
        items.add("jack");
        items.add("helen");
        return items;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
