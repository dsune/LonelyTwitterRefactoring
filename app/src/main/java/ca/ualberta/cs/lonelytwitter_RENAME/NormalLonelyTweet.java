package ca.ualberta.cs.lonelytwitter_RENAME;

import java.io.Serializable;
import java.util.Date;

public class NormalLonelyTweet extends SuperTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public void setTweetDate(Date tweetDate) {
		this.tweetDate = tweetDate;
	}

}