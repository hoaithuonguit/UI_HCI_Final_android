package com.example.hoaithuong.hci_android.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hoaithuong.hci_android.R;
import com.example.hoaithuong.hci_android.model.book_model;

import java.util.List;

/**
 * Created by hoai thuong on 1/18/2018.
 */

public class borrow_book_adapter extends ArrayAdapter<book_model> {

    private Activity context;
    private int resource;
    private List<book_model> objects;

    public borrow_book_adapter(@NonNull Activity context, int resource, @NonNull List<book_model> objects) {
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
        ImageView imageView = row.findViewById(R.id.imvMyBook);
        TextView txtName = row.findViewById(R.id.tvlvMyBookName);
        TextView txtWriter = row.findViewById(R.id.tvlvMyBookWriter);
        Button btnBorrow = row.findViewById(R.id.btnlvBorrow);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "font/ft.ttf");
//        txtStatus.setTypeface(font);
//        txtTags.setTypeface(font);
        txtWriter.setTypeface(font);
        txtName.setTypeface(font);
        book_model book = this.objects.get(position);
        txtName.setText(book.getTitle());
        txtWriter.setText(book.getAuthor());
        Glide.with(context)
                .load(book.getImage()).into(imageView);
        btnBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Đã gửi yêu cầu", Toast.LENGTH_SHORT).show();
            }
        });
        return row;
    }
}
