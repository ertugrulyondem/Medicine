package com.example.ertugrul.med.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ertugrul.med.Modal.Medicine;
import com.example.ertugrul.med.Modal.MyDataBaseClass;
import com.example.ertugrul.med.R;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    List<Medicine> medList;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        medList = MyDataBaseClass.getInstance(getApplicationContext()).getAllMedsData();

        tv =(TextView) findViewById(R.id.tv);

        tv.setText(String.valueOf(medList.get(0).getName()+" - " +medList.get(0).getPrice()+"\n"+
                medList.get(1).getName()+" - " +medList.get(1).getPrice()+"\n"+
                 medList.get(2).getName()+" - " +medList.get(2).getPrice()));
    }
}
