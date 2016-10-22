package com.example.ino.firstapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.firstapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.enter_food);
        String message = editText.getText().toString();
        /**intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        **/

        /**
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.foodList);
        layout.addView(textView);
        **/

        //Context context = getApplicationContext();
        //CharSequence text = "Hello toast!";
        //int duration = Toast.LENGTH_SHORT;

        //Toast toast = Toast.makeText(context, message, duration);
        //toast.show();

        TextView layout = (TextView) findViewById(R.id.foodList);
        layout.setText(message);

    }

}
