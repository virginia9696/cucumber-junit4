package scenarioContext;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private final Map<ContextKeys, Object> contextMap = new HashMap<>();

    public void set(ContextKeys key, Object value) {
        contextMap.put(key, value);
    }

    public <T> T get(ContextKeys key, Class<T> clazz) {
        return clazz.cast(contextMap.get(key));
    }

}
