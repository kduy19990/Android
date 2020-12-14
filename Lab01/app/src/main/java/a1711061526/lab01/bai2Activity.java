package a1711061526.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
    }

    public void showMe(View v) {
        String msg;
        EditText et = (EditText) findViewById(R.id.editText);
        msg = "Xin chào " + et.getText().toString();
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }
}