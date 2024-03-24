package com.example.bottomsheetdialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                showDialog();
            }
        });
    }

    private void showDialog()
    {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.bottom_dialogbox);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.bottom_dialogbox_bg));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setGravity(Gravity.BOTTOM);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimatiom;
        dialog.setCancelable(true);
        dialog.show();

        LinearLayout Download = dialog.findViewById(R.id.Download);
        LinearLayout Share = dialog.findViewById(R.id.Share);
        LinearLayout Edit = dialog.findViewById(R.id.Edit);

        Download.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Clicked Download!!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        Share.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Clicked Share!!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        Edit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Clicked Share!!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

    }

}