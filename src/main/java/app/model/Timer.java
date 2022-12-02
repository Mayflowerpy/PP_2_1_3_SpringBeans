package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Timer {

    @Autowired
    public Timer() {
        System.out.println("Timer created");
    }

//    private final Timer timer;
    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
//
//    public Timer getTimer() {
//        return timer;
//    }
}
