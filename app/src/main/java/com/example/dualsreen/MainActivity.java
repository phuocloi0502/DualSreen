package com.example.dualsreen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGo;
    EditText editTen, editHo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = findViewById(R.id.btn_go);
        editTen = findViewById(R.id.editten);
        editHo = findViewById(R.id.editho);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, manhinh2.class);
                intent.putExtra("firstname", editHo.getText().toString());
                intent.putExtra("lastname", editTen.getText().toString());
              MainActivity.this.startActivityForResult(intent,123);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String hienthi="Toi la "+data.getStringExtra("firstname")+" "+data.getStringExtra("lastname");
        Toast.makeText(this,hienthi,Toast.LENGTH_LONG).show();
    }

}
