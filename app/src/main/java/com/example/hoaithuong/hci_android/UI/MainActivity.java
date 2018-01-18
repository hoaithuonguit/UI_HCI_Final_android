package com.example.hoaithuong.hci_android.UI;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.hoaithuong.hci_android.R;
import com.example.hoaithuong.hci_android.fragment.fragment_account;
import com.example.hoaithuong.hci_android.fragment.fragment_book;
import com.example.hoaithuong.hci_android.fragment.fragment_borrow;
import com.example.hoaithuong.hci_android.fragment.fragment_my_book;
import com.example.hoaithuong.hci_android.fragment.fragment_setting;

public class MainActivity extends AppCompatActivity {
    private Button btnBook, btnMybook, btnSetting, btnBorrow, btnAccount;
    private ImageButton search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setID();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        fragment_book fr = new fragment_book();
        transaction.replace(R.id.container_setting, fr).commit();
        SetEvent();
    }
    private void SetEvent() {
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_book fr = new fragment_book();
                getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.container_setting)).commit();
                transaction.replace(R.id.container_setting, fr).commit();
                // transaction.add(R.id.container, fr).commit();
            }
        });
        btnMybook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_my_book fr = new fragment_my_book();
                getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.container_setting)).commit();
                transaction.replace(R.id.container_setting, fr).commit();
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_setting fr = new fragment_setting();
            //    getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.container)).commit();
               // getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.container_search)).commit();
                transaction.replace(R.id.container_setting, fr).commit();
                // transaction.add(R.id.container, fr).commit();
            }
        });
        btnBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_borrow fr = new fragment_borrow();
              //  getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.container_setting)).commit();
                transaction.replace(R.id.container_setting, fr).commit();
            }
        });
        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_account fr = new fragment_account();
                //  getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.container_setting)).commit();
                transaction.replace(R.id.container_setting, fr).commit();
            }
        });
//        btnWriter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                fragment_writer fr = new fragment_writer();
//                transaction.replace(R.id.container, fr).commit();
//                // transaction.add(R.id.container, fr).commit();
//            }
//        });
    }

    private void setID() {
//        btnBook = findViewById(R.id.btnSach);
//        btnWriter = findViewById(R.id.btnTacGia);
       btnSetting = findViewById(R.id.btnSetting);
        btnBook = findViewById(R.id.btnSach);
        btnMybook = findViewById(R.id.btnSachCuaToi);
        btnBorrow = findViewById(R.id.btnMuonSach);
        btnAccount = findViewById(R.id.btnAccount);
        Typeface font = Typeface.createFromAsset(getAssets(), "font/ft.ttf");
        btnAccount.setTypeface(font);
        btnBorrow.setTypeface(font);
        btnMybook.setTypeface(font);
        btnBook.setTypeface(font);
        btnSetting.setTypeface(font);
//        search = findViewById(R.id.imbtnsearch);
//        search.setImageResource(R.drawable.search);

    }
}
