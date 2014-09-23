package com.example.rnf.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        final TextView factLabel=(TextView) findViewById(R.id.factLabel);
        final RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        Button showFactButton=(Button) findViewById(R.id.showFactButton);
        View.OnClickListener listerner=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               FactBook factBook=new FactBook();
                factLabel.setText(factBook.getFact());
               Toast.makeText(MyActivity.this,"Color was changed",Toast.LENGTH_SHORT).show();


                ColorWheel wheel=new ColorWheel();
                relativeLayout.setBackgroundColor(Color.parseColor(wheel.getColor()));
                Log.d("MyActivity","Color was changed");
                MyActivity.class.getName();
            }
        };
        showFactButton.setOnClickListener(listerner);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
