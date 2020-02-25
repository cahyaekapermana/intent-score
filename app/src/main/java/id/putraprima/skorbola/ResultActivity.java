package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView scoreResult;
    private TextView theWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scoreResult = findViewById(R.id.txt_result);
        theWinner = findViewById(R.id.txt_team);

        Bundle extras = getIntent().getExtras();

        String scoreResultValue = extras.getString("result");
        String theWinnerValue   = extras.getString("winner");

        if (extras != null){

            scoreResult.setText(scoreResultValue);
            theWinner.setText(theWinnerValue);

        }


    }
}
