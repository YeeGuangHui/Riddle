package com.example.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    Button btnRevealQ1;
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAnswer=findViewById(R.id.textView);
        tvAnswer.setText("In Second Activity");

        tvQ1=findViewById(R.id.textViewQ1);
        btnRevealQ1=findViewById(R.id.buttonRevealQ1);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);

                Intent intentReceived = getIntent();
                String questionsSelected = intentReceived.getStringExtra("Question");
                tvAnswer.setText(questionsSelected + " answer is: Answer");


            }
        });
    }
}
