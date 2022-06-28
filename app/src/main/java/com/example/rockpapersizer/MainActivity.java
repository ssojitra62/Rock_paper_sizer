package com.example.rockpapersizer;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import xyz.teamgravity.imageradiobutton.GravityImageRadioButton;
import xyz.teamgravity.imageradiobutton.GravityRadioGroup;

public class MainActivity extends AppCompatActivity {

    ImageView pc;
    GravityRadioGroup answer1;
    TextView result;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pc = findViewById(R.id.pc);
        result = findViewById(R.id.result);
        answer1 = findViewById(R.id.answer1);
        enter = findViewById(R.id.enter);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { roll(); }

            private  void roll(){

                int num = (int)(Math.random() * 3 + 1);





                int answer = answer1.checkedRadioButtonId();

                if (num ==1  && answer == R.id.rock) {

                    pc.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "rock", Toast.LENGTH_SHORT).show();
                    result.setText("TIE");

                } else if (num== 1 && answer == R.id.paper) {

                    pc.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "paper", Toast.LENGTH_SHORT).show();
                    result.setText("YOU WIN");
                } else if (num== 1 && answer == R.id.scissors) {

                    pc.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "scissors", Toast.LENGTH_SHORT).show();
                    result.setText("YOU LOSE");
                } else if (num== 2 && answer == R.id.rock) {

                    pc.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "rock", Toast.LENGTH_SHORT).show();
                    result.setText("YOU WIN");
                } else if (num== 2 && answer == R.id.paper) {

                    pc.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "paper", Toast.LENGTH_SHORT).show();
                    result.setText("TIE");
                } else if (num== 2 && answer == R.id.scissors) {

                    pc.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "scissors", Toast.LENGTH_SHORT).show();
                    result.setText("YOU WIN");
                } else if (num== 3 && answer == R.id.rock) {

                    pc.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "rock", Toast.LENGTH_SHORT).show();
                    result.setText("YOU WIN");
                } else if (num== 3 && answer == R.id.paper) {

                    pc.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "paper", Toast.LENGTH_SHORT).show();
                    result.setText("YOU LOSE");
                } else if (num== 3 && answer == R.id.scissors) {

                    pc.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "scissors", Toast.LENGTH_SHORT).show();
                    result.setText("TIE");
                }



            }


        });








    }
}