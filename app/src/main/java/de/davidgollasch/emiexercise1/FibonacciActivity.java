package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static de.davidgollasch.emiexercise1.R.id.buttonFire;
import static de.davidgollasch.emiexercise1.R.id.textViewFibonacci;

public class FibonacciActivity extends AppCompatActivity {

    private TextView tvOutput;
    private Button btnFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        InitializeActivity();
    }

    private void InitializeActivity() {
        tvOutput = (TextView) findViewById(textViewFibonacci);
        btnFire = (Button) findViewById(buttonFire);

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear text view
                tvOutput.setText("");

                // Invoke calculation
                CalculateFibonacciRow();
            }
        });
    }

    /**
     * This method has to be filled...
     */
    private void CalculateFibonacciRow() {
        String output = "";
        int max_n = 29;
        /* further use unconnected to specific 'max_n'
        * give every 2, starting with 0 like:
        * F_0, F_1
        * F_2, F_3
        *
        * times: ('max_n'+1)/2
        * if not max_n%2 then append one more number. (first column)
        *
        /* TODO: IMPLEMENT THIS */

        if (max_n < 0) return;

        int a, b;
        a = 0;
        b = 1;
        for (int i = 1; i <= (max_n + 1) / 2; i++) {
            output += Integer.toString(a) + " ";
            output += Integer.toString(b) + " ";
            a = a + b;
            b = a + b;
        }
        if ((max_n % 2) == 0) output += Integer.toString(a) + " ";

        tvOutput.setText(output);
    }
}
