package secondTask;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock() {
        hours = 12;
    }

    public Clock(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void setClock(int secondsToSet) {
        hours = secondsToSet / 3600;
        minutes = (secondsToSet % 3600) / 60;
        seconds = secondsToSet % 60;
    }

    void tick() {
        int secClock = hours * 3600 + minutes * 60 + seconds;
        secClock = secClock + 1;
        setClock(secClock);
    }

    void tickDown() {
        int secClock = hours * 3600 + minutes * 60 + seconds;
        secClock = secClock - 1;
        setClock(secClock);
    }

    void addClock(Clock clockToAdd) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
        int secClockToAdd = clockToAdd.hours * 3600 + clockToAdd.minutes * 60 + clockToAdd.seconds;
        setClock(seconds + secClockToAdd < 86400 ? seconds + secClockToAdd : seconds + secClockToAdd - 86400);
    }

    void printTime() {
        System.out.println((hours > 9 ? hours : "0" + hours) + ":" + (minutes > 9 ? minutes : "0" + minutes) + ":" + (seconds > 9 ? seconds : "0" + seconds));
    }

    void subtractClock(Clock clockToSub) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
        int secClockToSub = clockToSub.hours * 3600 + clockToSub.minutes * 60 + clockToSub.seconds;
        setClock(seconds >= secClockToSub ? seconds - secClockToSub : 86400 + seconds - secClockToSub);
        }

}
