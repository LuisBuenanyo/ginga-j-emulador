package br.org.sbtvd.media;

import javax.media.Time;
import java.util.Date;

public class TimeBaseImpl implements javax.media.TimeBase {

	@Override
	public Time getTime() {
		return new Time(this.getNanoseconds());
	}

	@Override
	public long getNanoseconds() {
		return new Date(System.currentTimeMillis()).getTime() * (Time.ONE_SECOND/1000);
	}

}
