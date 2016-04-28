package demo.zmz.com.gridviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyGridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (MyGridView) findViewById(R.id.gv);

        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            strList.add("Grid_" + i);
        }
        GAdapter adapter = new GAdapter(this, strList);
        gv.setAdapter(adapter);
    }
}
