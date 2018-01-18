package com.example.hoaithuong.hci_android.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hoaithuong.hci_android.R;
import com.example.hoaithuong.hci_android.model.book_model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoai thuong on 1/17/2018.
 */

public class book_adapter extends ArrayAdapter<book_model> {
    private Activity context;
    private int resource;
    private List<book_model> objects;
    private ImageView imageView;
    private TextView txtName, txtWriter, txtTags, txtStatus;

    public book_adapter(@NonNull Activity context, int resource, @NonNull List<book_model> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);

        imageView = row.findViewById(R.id.imvBook);
        txtName = row.findViewById(R.id.tvlvBookName);
        txtWriter = row.findViewById(R.id.tvlvBookWriter);
        txtTags = row.findViewById(R.id.tvlvBookTags);
        txtStatus = row.findViewById(R.id.tvlvBookStatus);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "font/ft.ttf");
        txtStatus.setTypeface(font);
        txtTags.setTypeface(font);
        txtWriter.setTypeface(font);
        txtName.setTypeface(font);
        book_model book = this.objects.get(position);
        txtName.setText(book.getTitle());
        txtWriter.setText(book.getAuthor());
        if (book.getStatus() == 1) {
            txtStatus.setText("Đã sở hữu");
            txtStatus.setTextColor(Color.RED);
        }
        else {
            txtStatus.setText("Chưa sở hữu");
            txtStatus.setTextColor(Color.GRAY);
        }
        String tags = "";
        ArrayList<String> arrayList = book.getTags();
        for (int i = 0; i< arrayList.size(); i++)
        {
            tags += arrayList.get(i);
            for (int j = 0; j< arrayList.size(); j++) tags += " ";
        }
        txtTags.setText(tags);

        Glide.with(context)
                .load(book.getImage()).into(imageView);


        return row;
    }
}
