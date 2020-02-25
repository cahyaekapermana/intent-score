package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Key
    public  static  final  String HOMETEAM_KEY = "hometeam";
    public  static  final  String AWAYTEAM_KEY = "awayteam";



    //Attribut
    private EditText homeTeamInput;
    private EditText awayTeamInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO
        //Fitur Main Activity
        //1. Validasi Input Home Team
        homeTeamInput = findViewById(R.id.home_team);
        //2. Validasi Input Away Team
        awayTeamInput = findViewById(R.id.away_team);
        //3. Ganti Logo Home Team
        //4. Ganti Logo Away Team
        //5. Next Button Pindah Ke MatchActivity
    }

    public void handleNext(View view) {

        String hometeam = homeTeamInput.getText().toString();
        String awayteam = awayTeamInput.getText().toString();

        Intent intent = new Intent(this, MatchActivity.class);
        startActivity(intent);

        if (hometeam.isEmpty()){
            homeTeamInput.setError("Mohon isi form ");
        }else if (awayteam.isEmpty()){
            awayTeamInput.setError("Mohon isi form ");
        }else {
            intent.putExtra(HOMETEAM_KEY, hometeam);
            intent.putExtra(AWAYTEAM_KEY, awayteam);
            startActivity(intent);
        }





    }
}
