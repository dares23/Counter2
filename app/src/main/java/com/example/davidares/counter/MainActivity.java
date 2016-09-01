package com.example.davidares.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numberText;
    int count;

    TextView incrementButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = (TextView)(findViewById(R.id.numberText));
        count = 0;
        numberText.setText(count + "");

       // incrementButton = (TextView)(findViewById(R.id.incrementButton));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void incrementNumber(View view) {
        count++;
        numberText.setText(count + "");
    }

    public void resetCount(View view) {
        count = 0;
        numberText.setText(count + "");
    }

    public void decreaseNumber(View view) {
        if(count > 0) {
            count--;
            numberText.setText(count + "");
        }
        else {
            numberText.setText(count + "");
        }
    }
}
