package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MatchActivity extends AppCompatActivity {

    //Key
    public  static  final  String RESULT_KEY = "result";
    public  static  final  String WINNER_KEY = "winner";

    //Deklarasi attribut
    int counterHome = 0;
    int counterAway = 0;

    private TextView homeTeamText;
    private TextView awayTeamText;
    private TextView homeCount;
    private TextView awayCount;
    private TextView resultCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        //TODO
        //1.Menampilkan detail match sesuai data dari main activity
        homeTeamText = findViewById(R.id.txt_home);
        awayTeamText = findViewById(R.id.txt_away);
        // Count Button
        homeCount = (TextView) findViewById(R.id.score_home);
        awayCount = (TextView) findViewById(R.id.score_away);

        Bundle extras = getIntent().getExtras();

        String homeTeamValue = extras.getString("hometeam");
        String awayTeamValue = extras.getString("awayteam");

        if (extras != null){

            homeTeamText.setText(homeTeamValue);
            awayTeamText.setText(awayTeamValue);

        }

    }


    //2.Tombol add score menambahkan satu angka dari angka 0, setiap kali di tekan

    public void handleAddHome(View view) {

        counterHome++;
        homeCount.setText(Integer.toString(counterHome));

    }

    public void handleAddAway(View view) {

        counterAway++;
        awayCount.setText(Integer.toString(counterAway));
    }

    //3.Tombol Cek Result menghitung pemenang dari kedua tim dan mengirim nama pemenang ke ResultActivity, jika seri di kirim text "Draw"

    public void handleCek(View view) {

        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);

    }





}
