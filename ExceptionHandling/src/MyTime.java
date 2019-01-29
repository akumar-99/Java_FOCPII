import java.lang.*;

class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		try {
			if (hour>23 || hour<0 || minute>59 || minute<0 || second>59 || second<0)
				throw new IllegalArgumentException("Invalid Hour, Minute or Seconds");
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		try {
			if (hour>23 || hour<0)
				throw new IllegalArgumentException("Invalid Hours");
			this.hour = hour;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public void setMinute(int minute) {
		try {
			if (minute>59 || minute<0)
				throw new IllegalArgumentException("Invalid Minutes");
			this.minute = minute;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public void setSecond(int second) {
		try {
			if (second>59 || second<0)
				throw new IllegalArgumentException("Invalid Seconds");
			this.second = second;
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}

	public String toString() {
		String time = Integer.toString(hour) + ":" + Integer.toString(minute) + ":" + Integer.toString(second);
		return time;
	}

	public MyTime nextSecond() {
		++second;
		if (second >= 60) {
		  	second = 0;
		  	++minute;
		}
		if (minute >= 60) {
		  	minute = 0;
		  	++hour;
		}
		if (hour >= 24) {
		  	hour = 0;
		}
		return this;
	}

	public MyTime nextMinute() {
		if (minute >= 60) {
		  	minute = 0;
		  	++hour;
		}
		if (hour >= 24) {
		  	hour = 0;
		}
		return this;
	}

	public MyTime nextHour() {
		if (hour >= 24) {
		  	hour = 0;
		}
		return this;
	}

	public MyTime previousSecond() {
		--second;
		if (second < 0) {
		  	second = 59;
		  	--minute;
		}
		if (minute < 0) {
		  	minute = 59;
		  	--hour;
		}
		if (hour < 0) {
		  	hour = 23;
		}
		return this;
	}

	public MyTime previousMinute() {
		if (minute < 0) {
		  	minute = 59;
		  	--hour;
		}
		if (hour < 0) {
		  	hour = 23;
		}
		return this;
	}

	public MyTime previousHour() {
		if (hour < 0) {
		  	hour = 23;
		}
		return this;
	}

}