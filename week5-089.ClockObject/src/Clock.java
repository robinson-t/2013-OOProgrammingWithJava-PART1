public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        if ((hoursAtBeginning >= 0) && (hoursAtBeginning < 24)) {
            this.hours = new BoundedCounter(23);
            this.hours.setValue(hoursAtBeginning);
        }
        if ((minutesAtBeginning >= 0) && (minutesAtBeginning < 60)) {
            this.minutes = new BoundedCounter(59);
            this.minutes.setValue(minutesAtBeginning);
        }
        if ((secondsAtBeginning >= 0) && (secondsAtBeginning < 60)) {
            this.seconds = new BoundedCounter(59);
            this.seconds.setValue(secondsAtBeginning);
        }
        
        
    }
    
    public void tick() {
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            if ((this.minutes.getValue() == 0) &&(this.seconds.getValue() == 0)) {
                this.hours.next();
            }
        }
        
    }
    
    public String toString() {
        // returns the string representation
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}
