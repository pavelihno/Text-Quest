package com.example.textquest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title, description, balance;
    Button btn1, btn2, btn3;
    int prev_situation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ISituation start = new Start();

        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        balance = findViewById(R.id.balance);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        setSituation(start);

    }



    void setSituation(ISituation situation) {
        History history = History.getInstance();
        if (history.balance <= 0) {
            setContentView(R.layout.finish);
        } else {
            title.setText(situation.getTitle());
            description.setText(situation.getDescription());
            balance.setText(Integer.toString(history.balance) + " $");
            int rand_1 = (int) (Math.random() * (6 - 1 + 1) + 1);
            int rand_2 = (int) (Math.random() * (6 - 1 + 1) + 1);
            int rand_3 = (int) (Math.random() * (6 - 1 + 1) + 1);
            while (rand_2 == rand_1 || rand_2 == rand_3 || rand_3 == rand_1 || rand_1 == prev_situation || rand_2 == prev_situation || rand_3 == prev_situation)  {
                rand_1 = (int) (Math.random() * (6 - 1 + 1) + 1);
                rand_2 = (int) (Math.random() * (6 - 1 + 1) + 1);
                rand_3 = (int) (Math.random() * (6 - 1 + 1) + 1);
            }
            int final_rand_1= rand_1;
            int final_rand_2= rand_2;
            int final_rand_3= rand_3;
            ISituation situation_1 = rand_situation(rand_1);
            ISituation situation_2 = rand_situation(rand_2);
            ISituation situation_3 = rand_situation(rand_3);

            btn1.setText(situation_1.button_text);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    situation_1.changeBalance();
                    prev_situation = final_rand_1;
                    setSituation(situation_1);
                }
            });

            btn2.setText(situation_2.button_text);
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                    public void onClick(View v) {
                        situation_2.changeBalance();
                        prev_situation = final_rand_2;
                        setSituation(situation_2);
                    }
            });

            btn3.setText(situation_3.button_text);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    situation_3.changeBalance();
                    prev_situation = final_rand_3;
                    setSituation(situation_3);
                }
            });
        }
    }
    ISituation rand_situation(int rand_num) {
        switch (rand_num) {
            case (1): return new Situation_1();
            case (2): return new Situation_2();
            case (3): return new Situation_3();
            case (4): return new Situation_4();
            case (5): return new Situation_5();
            case (6): return new Situation_6();
            default: break;
        }
        return new ISituation();
    }
}