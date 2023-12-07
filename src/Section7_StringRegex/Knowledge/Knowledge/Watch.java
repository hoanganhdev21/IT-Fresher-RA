package Section7_StringRegex.Knowledge.Knowledge;

import java.util.Date;

public class Watch {
    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void start() {
        this.time = new Date().getTime();
    }

    public long end() {
        return new Date().getTime() - this.time;
    }
}