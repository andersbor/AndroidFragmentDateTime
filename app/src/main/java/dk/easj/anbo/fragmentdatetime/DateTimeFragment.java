package dk.easj.anbo.fragmentdatetime;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFragment extends Fragment {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT
            = new SimpleDateFormat("d MMM yyyy HH:mm.ss");
    private String time;

    public DateTimeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (savedInstanceState != null) {
//            time = savedInstanceState.getString(DATE_TIME);
//        }
        if (time == null) {
            time = SIMPLE_DATE_FORMAT.format(new Date());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_date_time, container, false);
        final TextView textView = view.findViewById(R.id.last_view_time);
        textView.setText(time);

        Button button = view.findViewById(R.id.buttonLocal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MINE", "Fragment handled event ....");
                time = SIMPLE_DATE_FORMAT.format(new Date());
                textView.setText(time);
            }
        });

        return view;
    }

}

