package com.loge.designmailclient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by loge on 2017-07-23.
 */

public class MailMessage {
    private UUID mId;
    private String mName;
    private String mTopic;
    private String mFirstLine;
    private Date mDate;

    MailMessage(){
        mId = UUID.randomUUID();
        mName = "Hans Muster";
        mTopic = "Your recent inquiry";
        mFirstLine = "Dear Mr. Gerner, your...";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getTopic() {
        return mTopic;
    }

    public String getFirstLine() {
        return mFirstLine;
    }

    public Date getDate() {
        return mDate;
    }
}
