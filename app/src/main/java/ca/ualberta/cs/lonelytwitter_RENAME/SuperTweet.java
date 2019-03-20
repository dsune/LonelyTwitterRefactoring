package ca.ualberta.cs.lonelytwitter_RENAME;

import java.io.IOException;
import java.util.Date;

public abstract class SuperTweet {
    private static final long serialVersionUID = 1L;
    protected Date tweetDate;
    protected String tweetBody;

    public Date getTweetDate() {
        return tweetDate;
    }

    public abstract void setTweetDate(Date tweetDate);

    public String getTweetBodyRENAME() {
        return tweetBody;
    }

    public void setTweetBodyRENAME(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBodyRENAME() ;
    }
}
