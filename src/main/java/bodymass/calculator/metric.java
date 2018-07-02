package bodymass.calculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class metric extends menu {
    EditText mEditText1;
    EditText mEditText2;
    TextView mTextview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metric);
        mTextview = (TextView) findViewById(R.id.textView);



        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

        Button Button1 = (Button) findViewById(R.id.button);
        Button1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Double value1 = Double.parseDouble("0" + mEditText1.getText().toString());
                Double value2 = Double.parseDouble("0" + mEditText2.getText().toString());
                Double result = (value1 / value2 / value2) * 10000;


                if (result <= 18.5) {
                    String w = "Underweight";
                    TextView output = (TextView) findViewById(R.id.textView);
                    output.setText(w);
                } else if (result <= 18.6 && result <= 25) {
                    String x = "Normal weight";
                    TextView output = (TextView) findViewById(R.id.textView);
                    output.setText(x);
                } else {
                    String y = "Overweight";
                    TextView output = (TextView) findViewById(R.id.textView);
                    output.setText(y);
                }
            }
        });
        Button simpleButton2 = (Button) findViewById(R.id.button5);
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.mayoclinic.org/healthy-lifestyle/nutrition-and-healthy-eating/expert-answers/underweight/faq-20058429");
            }
        });
        Button simpleButton3 = (Button) findViewById(R.id.button6);
        simpleButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.webmd.com/diet/lose-weight-fast");
            }
        });

    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    }

