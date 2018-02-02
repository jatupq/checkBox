package com.example.ongor1.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox momCheckBoxID;
    private  CheckBox dadCheckBOx;
    private  CheckBox grandpaCheckBox;
    private Button showButton;
    private TextView showTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBoxID = (CheckBox)findViewById(R.id.momCheckBoxID);
        dadCheckBOx = (CheckBox)findViewById(R.id.dadID);
        grandpaCheckBox = (CheckBox)findViewById(R.id.grandpaID);
        showTextView  =(TextView)findViewById(R.id.resultID);
        showButton = (Button)findViewById(R.id.showButtonID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBoxID.getText().toString()+"Satus is :"+momCheckBoxID.isChecked()+"\n");
                stringBuilder.append(dadCheckBOx.getText().toString()+"Satus is :"+dadCheckBOx.isChecked()+"\n");
                stringBuilder.append(grandpaCheckBox.getText().toString()+"Satus is :"+grandpaCheckBox.isChecked()+"\n");



                showTextView.setText(stringBuilder);
            }
        });
    }
}
