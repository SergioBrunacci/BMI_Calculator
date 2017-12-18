package sergiodealmeidabrunacci.praticaltestmapd711;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMICalculator extends AppCompatActivity {

    private EditText age;
    private EditText gender;
    private EditText height;
    private EditText weight;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        age = (EditText) findViewById(R.id.age);
        gender = (EditText) findViewById(R.id.gender);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculate(View v) {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if (heightStr != null && !"".equals(heightStr)
                && weightStr != null  &&  !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        bmiLabel = "Age: " + getString(R.string.age) + "\n";
        bmiLabel = "Gender: " + getString(R.string.gender) + "\n";
        bmiLabel = "Height: " + getString(R.string.height) + "\n";
        bmiLabel = "Weight: " + getString(R.string.weight) + "\n";
        bmiLabel = "BMI: " + bmi + "kg/m2 \n";


        if (Float.compare(bmi, 18.5f) <= 0) {
            bmiLabel = getString(R.string.underweight);
        } else if (Float.compare(bmi, 18.5f) > 0  &&  Float.compare(bmi, 24.9f) <= 0) {
            bmiLabel = getString(R.string.normal);
        } else {
            bmiLabel = getString(R.string.overweight);
        }

        bmiLabel = bmi + "\n\n" + bmiLabel;
        result.setText(bmiLabel);
    }
}