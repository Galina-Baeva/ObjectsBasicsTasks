package secondTask;

public class Clock {
    int hours;
    int minutes;
    int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock() {
        hours = 12;
    }

    public Clock(int seconds) {
        setClock(seconds);
    }

    void setClock(int secondsToSet) {
        if (secondsToSet < 0){
            secondsToSet = secondsToSet + 86400;
        } else {
            secondsToSet = secondsToSet % 86400;
        }
        hours = secondsToSet / 3600;
        minutes = (secondsToSet % 3600) / 60;
        seconds = secondsToSet % 60;
    }

    void tick() {
        setClock(setSeconds() + 1);
    }

    void tickDown() {
        setClock(setSeconds() - 1);
    }

    void addClock(Clock clockToAdd) {
        setClock(setSeconds() + clockToAdd.setSeconds());
    }

    void printTime() {
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    void subtractClock(Clock clockToSub) {
        setClock(setSeconds() - clockToSub.setSeconds());
        }

    int setSeconds () {
        int timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        return timeInSeconds;
    }
}
