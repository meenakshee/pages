package com.example.minaxipc.pages;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button= (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }


}

