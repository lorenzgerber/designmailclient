package com.loge.designmailclient;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by loge on 2017-07-23.
 */

public class MailFolder {

    private List<MailMessage> mMails;

    private MailFolder(Context context){
        mMails = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            MailMessage mail = new MailMessage();
            mMails.add(mail);
        }
    }

    public List<MailMessage> getMails() {
        return mMails;
    }

    public MailMessage getMail(UUID id) {
        for (MailMessage mail:mMails){
            if (mail.getId().equals(id)) {
                return mail;
            }
        }

        return null;
    }



}
