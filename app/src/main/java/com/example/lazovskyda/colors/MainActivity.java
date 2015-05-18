package com.example.lazovskyda.colors;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private RelativeLayout myLayout;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button buttonRed = (Button) findViewById(R.id.redBtn);
//        Button buttonGreen = (Button) findViewById(R.id.greenBtn);
//        Button buttonYellow = (Button) findViewById(R.id.yellowBtn);



        myLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        myTextView = (TextView)findViewById(R.id.resultColor);
//        myTextView = (TextView)findViewById(R.id.textView);

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

    public void setColor(View view){
        int detectedColor;
        String stData;

        switch(view.getId()){
            case R.id.redBtn:
                detectedColor = getResources().getColor(R.color.redColor);
                stData = getResources().getString(R.color.redColor);
                myTextView.setText(stData);
                myLayout.setBackgroundColor(detectedColor);
                break;
            case R.id.yellowBtn:
                detectedColor = getResources().getColor(R.color.yellowColor);
                myLayout.setBackgroundColor(detectedColor);
                break;
            case R.id.greenBtn:
                detectedColor = getResources().getColor(R.color.greenColor);
                myLayout.setBackgroundColor(detectedColor);
                break;

        }
    }


//    anoyther activity listener

    public void linker(View view) {
        switch(view.getId()) {
            case R.id.aboutButton:
                Intent intent1 = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent1);
                break;
            case R.id.inputsPageButton:
                Intent intent2 = new Intent(MainActivity.this, InputsPage.class);
                startActivity(intent2);
                break;
            case R.id.DifferentRotationPageButton:
                Intent intent3 = new Intent(MainActivity.this, DifferentRotation.class);
                startActivity(intent3);
                break;
        }
    }

}
