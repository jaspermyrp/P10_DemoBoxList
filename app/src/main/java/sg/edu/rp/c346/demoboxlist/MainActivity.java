package sg.edu.rp.c346.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind UI //
        lvBox = findViewById(R.id.lv);

        // Init ArrayList //
        alBoxList = new ArrayList<Box>();

        // Add Box objects to ArrayList //
        Box box1 = new Box("Blue");
        Box box2 = new Box("Brown");
        Box box3 = new Box("Orange");

        alBoxList.add(box1);
        alBoxList.add(box2);
        alBoxList.add(box3);

        // Init CustomAdapter //
        caBox = new CustomAdapter(this, R.layout.row, alBoxList);

        // Set Adapter to LV //
        lvBox.setAdapter(caBox);

    }
}
