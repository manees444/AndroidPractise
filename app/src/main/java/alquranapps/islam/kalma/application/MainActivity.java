package alquranapps.islam.kalma.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text);
        Button btn  = findViewById(R.id.button);

        text.setText("Hi This is a TextView");
        myText = String.valueOf(text.getText());
        Log.e("Text", myText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, myText);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);*/

                Intent hello = new Intent(MainActivity.this, SecondActivity.class);
                hello.putExtra("MyText", myText);
                startActivity(hello);
            }
        });

    }
}
