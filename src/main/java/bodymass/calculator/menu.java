package bodymass.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button Button1 = (Button) findViewById(R.id.button3);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, imperial.class);
                startActivity(intent);
                finish();
            }
        });
        Button Button2 = (Button) findViewById(R.id.button4);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, metric.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
