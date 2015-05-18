package com.example.lazovskyda.colors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.TextView;

/**
 * Created by LazovskyDA on 15.05.2015.
 */
public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String login = "default login";
        String password = "default password";

        login = getIntent().getExtras().getString("login");
        password = getIntent().getExtras().getString("password");

        TextView ResultEnter  = (TextView)findViewById(R.id.resultEnter);

        ResultEnter.setText("login:"+login+"     password:"+password);



    }

    public void back(View view) {
        Intent intent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void linker(View view) {
        switch(view.getId()) {
            case R.id.inputsPage2Button:
                Intent intent3 = new Intent(AboutActivity.this, InputsPage.class);
                startActivity(intent3);
                break;
        }
    }
}
