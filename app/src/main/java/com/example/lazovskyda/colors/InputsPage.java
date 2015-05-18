package com.example.lazovskyda.colors;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class InputsPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputs_page);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inputs_page, menu);
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

    public void linker(View view) {

        EditText login = (EditText)findViewById(R.id.login);
        EditText password = (EditText)findViewById(R.id.pass);

        Intent intent3 = new Intent(InputsPage.this, AboutActivity.class);


        switch(view.getId()) {
            case R.id.submitInputPage:

                intent3.putExtra("login", login.getText().toString());
                intent3.putExtra("password", password.getText().toString());

                startActivity(intent3);
                break;
        }
    }
}
