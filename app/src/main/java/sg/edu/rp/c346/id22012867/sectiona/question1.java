package sg.edu.rp.c346.id22012867.sectiona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class question1 extends AppCompatActivity {

    TextView tv;
    String [] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        tv = findViewById(R.id.textView);

        this.setTitle("Array");

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        String text = "Fruits";
        text += "\n";
        text += "=====";
        text += "\n";

        for (int x = 0; x < fruits.length; x++) {
            text += fruits[x] + "\n";
        }

        tv.setText(text);

    }
}