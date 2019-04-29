package com.example.a611activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewField;
    public static final String keyTextView = "textView";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onCreate");
        Log.d("Lifecycle", "onCreate");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onCreate");
        Log.d("Lifecycle", "onSaveInstanceState");
        outState.putString(keyTextView, textViewField.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textViewField = findViewById(R.id.textView);
        if (savedInstanceState != null) {
            textViewField.setText(savedInstanceState.getString(keyTextView));
            textViewField.append("\n" + "onRestoreInstanceState");
            Log.d("Lifecycle", "onSaveInstanceState");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onStart");
        Log.d("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onResume");
        Log.d("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onPause");
        Log.d("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onStop");
        Log.d("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onDestroy");
        Log.d("Lifecycle", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onRestart");
        Log.d("Lifecycle", "onRestart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onPostCreate");
        Log.d("Lifecycle", "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onPostResume");
        Log.d("Lifecycle", "onPostResume");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onKeyDown");
        Log.d("Lifecycle", "onKeyDown");
        return true;//super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onKeyLongPress");
        Log.d("Lifecycle", "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        textViewField = findViewById(R.id.textView);
        textViewField.append("\n" + "onBackPressed");
        Log.d("Lifecycle", "onBackPressed");
        super.onBackPressed();
    }

}
