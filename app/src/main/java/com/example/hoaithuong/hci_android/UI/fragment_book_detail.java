package com.example.hoaithuong.hci_android.UI;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hoaithuong.hci_android.R;

import java.util.ArrayList;

/**
 * Created by hoai thuong on 1/17/2018.
 */

public class fragment_book_detail extends AppCompatActivity {

    private View myview;
    private ImageView imageView;
    private ImageButton back;
    private TextView txtName, txtWriter, txtStatus, txtTags, txtDescription;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fr_book_detail);
        initFragment();
        getdata();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fragment_book_detail.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void getdata() {
        Intent i = getIntent();
        Glide.with(getApplicationContext()).load(i.getStringExtra("image")).into(imageView);
        txtDescription.setText(i.getStringExtra("des"));
        txtName.setText(i.getStringExtra("name"));
        if (i.getIntExtra("status", 0) == 1){
            txtStatus.setText("Đã sở hữu");
            txtStatus.setTextColor(Color.RED);
        }
        else
        txtStatus.setText("Chưa sở hữu");

        txtWriter.setText(i.getStringExtra("writer"));
//        intent.putExtra("name", arrayList.get(i).getTitle());
//        intent.putExtra("writer", arrayList.get(i).getAuthor());
//        intent.putExtra("image", arrayList.get(i).getImage());
//        intent.putExtra("status", arrayList.get(i).getStatus());
//        intent.putExtra("tag", arrayList.get(i).getTags());
//        intent.putExtra("des", arrayList.get(i).getDescription());
    }

    private void initFragment() {
        imageView = findViewById(R.id.imvBookDetail);
        txtName =findViewById(R.id.tvBookDetailTitle);
        txtDescription = findViewById(R.id.tvBookDetail);
        txtStatus = findViewById(R.id.tvBookDetailStatus);
        txtTags =findViewById(R.id.tvBookDetailType);
        txtWriter =findViewById(R.id.tvBookDetailWriter);
        Typeface font = Typeface.createFromAsset(getAssets(), "font/ft.ttf");
        txtWriter.setTypeface(font);
        txtTags.setTypeface(font);
        txtStatus.setTypeface(font);
        txtName.setTypeface(font);
        txtDescription.setTypeface(font);
        back = findViewById(R.id.btnBack);
        back.setImageResource(R.drawable.back);
    }
}
