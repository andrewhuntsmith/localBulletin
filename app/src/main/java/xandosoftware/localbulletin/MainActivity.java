package xandosoftware.localbulletin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected String boardText;
    protected TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        boardText = mainText.getText().toString();
        boardText = boardText + " How are you?";
        mainText.setText(boardText);

        final Button updateButton = (Button) findViewById(R.id.updateButtonId);
        updateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText postText = (EditText) findViewById(R.id.postTextId);
                boardText = boardText + postText.getText();
                mainText.setText(boardText);
            }
        } );
    }


}
