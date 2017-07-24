package com.loge.designmailclient;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by loge on 2017-07-23.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<MailMessage> mMails;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mName, mTopic, mFirstLine, mDate;
        public ViewHolder(View v) {
            super(v);
            mName = (TextView) itemView.findViewById(R.id.mail_name);
            mTopic = (TextView) itemView.findViewById(R.id.mail_topic);
            mFirstLine = (TextView) itemView.findViewById(R.id.mail_firstline);
            mDate = (TextView) itemView.findViewById(R.id.mail_date);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<MailMessage> mails) {
        mMails = mails;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        MailMessage mail = mMails.get(position);
        holder.mName.setText(mail.getName());
        holder.mTopic.setText(mail.getTopic());
        holder.mFirstLine.setText(mail.getFirstLine());
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
        holder.mDate.setText(dt1.format(mail.getDate()).toString());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mMails.size();
    }
}



