package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class AotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aother);
        Button button = (Button) findViewById(R.id.buttonreturn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent =getIntent();
                String name=intent.getStringExtra("name");
                Integer number=intent.getIntExtra("number",10);
                intent.putExtra("result","姓名"+name+"编号"+number);
                setResult(0,intent);
                finish();
            }
        });
        Intent intent1=getIntent();
        String name=intent1.getStringExtra("name");
        Integer number=intent1.getIntExtra("number",10);
        Toast.makeText(this,name+number,Toast.LENGTH_LONG).show();
    }
}
