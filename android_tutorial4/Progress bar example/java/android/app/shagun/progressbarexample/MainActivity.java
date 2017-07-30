package android.app.shagun.progressbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int progress = 0;
    ProgressBar pbar;
    TextView pvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pbar = (ProgressBar)findViewById(R.id.progressBar3); //This is int.. of progress bar
        pbar.setIndeterminate(true);
        pvalue = (TextView)findViewById(R.id.textView); //This is int.. of textView
    }

    public void increase(View view) {

        progress++; //This will increase progress by 1 whenever this button is pressed
        pbar.setProgress(progress); //This will set the progress value
        pvalue.setText("" + progress + "%");

    }

    public void decrease(View view) {

        progress--; //This will decrease progress by 1 whenever this button is pressed
        pbar.setProgress(progress); //This will set hte progress value
        pvalue.setText("" + progress + "%");

    }
}
