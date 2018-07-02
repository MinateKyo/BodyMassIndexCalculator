package bodymass.calculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleButton1 = (Button) findViewById(R.id.button1);
        simpleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, menu.class);
                startActivity(intent);
                finish();
            }
        });
        Button simpleButton2 = (Button) findViewById(R.id.button2);
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToUrl("https://www.paypal.me/AustinWhiteDeveloper");
            }
        });
    }
        private void goToUrl (String url) {
            Uri uriUrl = Uri.parse(url);
            Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }

}
