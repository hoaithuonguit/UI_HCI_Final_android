package com.example.hoaithuong.hci_android.fragment;

import android.app.Dialog;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hoaithuong.hci_android.R;

/**
 * Created by hoai thuong on 1/18/2018.
 */

public class fragment_account extends Fragment {

    private View myv;
    private TextView txtName, txtTitle, txtSdt;
    private ImageView imageView;
    private Button btnEdt, btnLogout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myv = inflater.inflate(R.layout.fr_account, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "font/ft.ttf");
        txtTitle = myv.findViewById(R.id.tvAccountTitle);
        txtName = myv.findViewById(R.id.tvName);
        txtSdt = myv.findViewById(R.id.tvSdt);
        btnEdt = myv.findViewById(R.id.btnEdit);
        btnLogout = myv.findViewById(R.id.btnLogout);
        txtTitle.setTypeface(font);
        btnEdt.setTypeface(font);
        btnLogout.setTypeface(font);
        txtSdt.setTypeface(font);
        txtName.setTypeface(font);
        imageView = myv.findViewById(R.id.imvAvatar);

        imageView.setImageResource(R.drawable.avatar);
        eventClick();


        return myv;
    }

    private void eventClick() {
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setTitle("Đăng xuất");
                dialog.setContentView(R.layout.custom_dialog_logout);
                dialog.show();
                Button btnYes = dialog.findViewById(R.id.btnYes);
                Button btnNo = dialog.findViewById(R.id.btnNo);

                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Đã đăng xuất", Toast.LENGTH_SHORT).show();
                        dialog.hide();
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.hide();
                    }
                });
            }
        });
        btnEdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setTitle("Chỉnh sửa thông tin");
                dialog.setContentView(R.layout.edit_layout);
                dialog.show();
                Button btnYes = dialog.findViewById(R.id.btnSave);
                Button btnNo = dialog.findViewById(R.id.btnCancel);

                btnYes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Đã lưu", Toast.LENGTH_SHORT).show();
                        dialog.hide();
                    }
                });
                btnNo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.hide();
                    }
                });
            }
        });
    }
}
