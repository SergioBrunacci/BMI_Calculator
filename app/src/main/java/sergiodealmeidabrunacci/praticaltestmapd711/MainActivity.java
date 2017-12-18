package sergiodealmeidabrunacci.praticaltestmapd711;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BMICalculator(View view){

        Intent intent = new Intent(this, BMICalculator.class);
        startActivity(intent);
    }


    public void webCalculator(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.fullcirclehealthcareinc.com/bmi---body-mass-index.html"));
        startActivity(intent);
    }
}

