package com.example.summers.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.summers.quiz.R.id.button_next;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button trueButton, falseButton, nextButton;
    private TextView questionText;
    private List<Question> questionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        initQuestionBank();
        questionText.setText(questionBank.get(0).getQuestionText());
    }

    private void setListeners() {
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

    }

    private void wireWidgets() {
        trueButton = (Button) findViewById(R.id.button_true);
        falseButton = (Button) findViewById(R.id.button_false);
        nextButton = (Button) findViewById(button_next);
        questionText = (TextView) findViewById(R.id.button_true);

    }

    private void initQuestionBank() {
        questionBank = new ArrayList<>();
        questionBank.add(new Question(getString(R.string.cheese_question), true));
        questionBank.add(new Question(getString(R.string.menu_question), false));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_next:

        }
    }
}
