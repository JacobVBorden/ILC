package example.designPatterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class eventManager {
    Map<String, List<eventListener>> subscribers = new HashMap<>();

    public eventManager(String... eventTypes){
        for(String eventType : eventTypes){
            this.subscribers.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, eventListener subscriber){
        List<eventListener> users = subscribers.get(eventType);
        users.add(subscriber);
    }

    public void unsubscribe(String eventType, eventListener subscriber){
        List<eventListener> users = subscribers.get(eventType);
        users.remove(subscriber);
    }

    public void notify(String eventType){
        List<eventListener> users = subscribers.get(eventType);

        for(eventListener user: users){
            user.notify();
        }

    }
}
