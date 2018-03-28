package at.refugeescode.mp5themarathon.model;

import java.time.Duration;

public class Runner {

    private String name;

    private Duration time;

    public Runner(String name) {
        this.name = name;
    }

    public Runner() {
    }

    public Runner(String name, Duration time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
