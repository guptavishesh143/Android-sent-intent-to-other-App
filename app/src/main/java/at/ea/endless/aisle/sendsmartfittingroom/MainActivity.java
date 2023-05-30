package at.ea.endless.aisle.sendsmartfittingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button simpleButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleButton1 = findViewById(R.id.sendIntentButton);//get id of button 1
        simpleButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                //Intent.ACTION_SEND
//                Intent intent = new Intent(Intent.ACTION_SEND);

                Intent intent = new Intent("at.ea.endless.aisle.ProductDetailsPagePage");
//                intent.setAction(Intent.ACTION_SEND);
//                intent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                intent.setType("text/plain");
                intent.putExtra("sku", "123434566");
                intent.putExtra("device id", "SAMSUNG");
                intent.putExtra("rfid_id", "RFID_READER");
                Log.d("intent sent", "INTENT SENT");
                Toast.makeText(getApplicationContext(), "INTENT SENT" + intent, Toast.LENGTH_LONG).show();//display the text of button2
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "No app Found. Please install the Smart Mirror App", Toast.LENGTH_SHORT).show();
                }
                //    startActivity(intent);
//                Toast.makeText(getApplicationContext(), "INTENT SENT", Toast.LENGTH_LONG).show();//display the text of button2
            }
        });


    }
}