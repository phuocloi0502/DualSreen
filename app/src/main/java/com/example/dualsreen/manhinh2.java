package com.example.dualsreen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class manhinh2 extends AppCompatActivity {
    String firstname, lastname;
    TextView txvHienthi;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        Intent intent = this.getIntent();
        btnBack = findViewById(R.id.btnback);
        firstname = intent.getStringExtra("firstname");
        lastname = intent.getStringExtra("lastname");
        txvHienthi = findViewById(R.id.txvhienthi);
        txvHienthi.setText("Hello " + firstname + " " + lastname);// nhan du lieu
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("firstname", manhinh2.this.firstname);
                data.putExtra("lastname",manhinh2.this.lastname);
                //tra du lieu
                setResult(RESULT_OK, data);
                manhinh2.this.finish();
            }
        });

    }
    //nhan lai du lieu tu man hinh 2


}
