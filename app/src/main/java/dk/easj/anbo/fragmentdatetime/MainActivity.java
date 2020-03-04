package dk.easj.anbo.fragmentdatetime;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void timeViewClicked(View view) {
        Log.d("MINE", "Activity handled event ...");
        TextView outputView = findViewById(R.id.outputView);
        counter++;
        outputView.setText("Event handled by activity, not by fragment " + counter);
    }
}


