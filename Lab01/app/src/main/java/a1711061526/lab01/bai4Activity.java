package a1711061526.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class bai4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
    }
    public void showCalc(View v){
        Float result;
        EditText ed1 = (EditText)findViewById(R.id.so1);
        Float sothu1 = Float.parseFloat(ed1.getText().toString());

        EditText ed2 = (EditText)findViewById(R.id.so2);
        Float sothu2 = Float.parseFloat(ed2.getText().toString());



        TextView resultView = (TextView)findViewById(R.id.ketqua);



        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        String textSpinner = spinner.getSelectedItem().toString();

        if(textSpinner.equals("Cộng")){
            result = sothu1 + sothu2;
            resultView.setText(result.toString());
        }else if(textSpinner.equals("Trừ")){
            result = sothu1 - sothu2;
            resultView.setText(result.toString());
        }else if(textSpinner.equals("Nhân")){
            result = sothu1 * sothu2;
            resultView.setText(result.toString());
        }
        else if(textSpinner.equals("Chia")){
            result = sothu1 / sothu2;
            resultView.setText(result.toString());
        }
    }
}
