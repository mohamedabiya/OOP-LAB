public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public void setHour(int h){
        if (h>=0 && h<24)
            hour = h;
        else
            throw new IllegalArgumentException("Hour must be 0-23");
    }
    public void setMinute(int m){
        if (m >=0 && m<60)
            minute = m;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    public void setSecond(int s){
        if (s>=0 && s<60)
            second = s;
        else
            throw new IllegalArgumentException("second must be 0-59");
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12) ? 12 : hour % 12),minute,second,( hour<12 ? "AM" : "PM"));
    }
}