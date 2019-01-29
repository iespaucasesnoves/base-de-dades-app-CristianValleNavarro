package com.example.crist.provaguithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditaVi extends AppCompatActivity {
    private EditText nomvi;
    private DataSourceVi data;
    private Button mod;
    private Button del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edita_vi);
        data = new DataSourceVi(EditaVi.this);

        mod = findViewById(R.id.update);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        del = findViewById(R.id.delete);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        //nomvi = findViewById(R.id.nomVi);
        //nomvi.setText("");
    }


}
