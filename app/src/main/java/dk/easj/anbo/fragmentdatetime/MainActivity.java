package dk.easj.anbo.fragmentdatetime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void timeViewClicked(View view) {
        Log.d("MINE", "Activity handled event ...");
        TextView outputView = findViewById(R.id.outputView);
        outputView.setText("Event handled by activity, not by fragment");
    }
}
