package com.ISSAatOfek.EX4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ipFromUser;
    private EditText portFromUser;
    private Button clickButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.ipFromUser = (EditText)findViewById(R.id.ipToConnect);
        this.portFromUser = (EditText)findViewById(R.id.getPort);
        this.clickButton = (Button)findViewById(R.id.button);
        clickButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewJoystick();
            }
        });
    }
    public void viewJoystick(){
        Intent intent = new Intent(getBaseContext(), JoyStickActivity.class);
        intent.putExtra("ip",ipFromUser.getText().toString());
        intent.putExtra("port",portFromUser.getText().toString());
        startActivity(intent);
    }
}
