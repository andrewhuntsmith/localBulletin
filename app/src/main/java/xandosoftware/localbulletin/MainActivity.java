package xandosoftware.localbulletin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String boardText;
        TextView mainText = (TextView) findViewById(R.id.mainText);
        boardText = mainText.getText().toString();
        boardText = boardText + " How are you?";
        mainText.setText(boardText);
    }
}
