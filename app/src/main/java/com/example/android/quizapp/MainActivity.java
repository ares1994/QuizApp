package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();
        questionNine();
        Toast.makeText(this, "Your score is " + total + " of a possible 9", Toast.LENGTH_LONG).show();

        total = 0;
    }


    public void questionOne() {
        CheckBox questionOneNvidia = (CheckBox) findViewById(R.id.question_one_nvidia);
        CheckBox questionOneAmd = (CheckBox) findViewById(R.id.question_one_amd);
        CheckBox questionOneHp = (CheckBox) findViewById(R.id.question_one_hp);
        if (questionOneNvidia.isChecked() && questionOneAmd.isChecked() && !questionOneHp.isChecked()) {
            total += 1;
        } else {
            Toast.makeText(this, "Error in Question 1", Toast.LENGTH_SHORT).show();
        }
    }

    public void questionTwo() {
        RadioButton questionTwoNo = (RadioButton) findViewById(R.id.question_two_no);
        if (questionTwoNo.isChecked()) {
            total += 1;

        } else {
            Toast.makeText(this, "Error in Question 2", Toast.LENGTH_SHORT).show();
        }

    }

    public void questionThree() {
        EditText questionThreeAnswer = (EditText) findViewById(R.id.question_three_answer);
        String answer = questionThreeAnswer.getText().toString();
        if ((answer.equalsIgnoreCase("charles babbage")) || (answer.equalsIgnoreCase("babbage charles"))) {
            total += 1;
        } else {
            Toast.makeText(this, "Error in Question 3", Toast.LENGTH_SHORT).show();
        }

    }

    public void questionFour() {
        CheckBox questionFourMicrosoft = (CheckBox) findViewById(R.id.question_four_microsoft);
        CheckBox questionFourDell = (CheckBox) findViewById(R.id.question_four_dell);
        CheckBox questionFourApple = (CheckBox) findViewById(R.id.question_four_apple);
        if (questionFourMicrosoft.isChecked() && questionFourApple.isChecked() && !questionFourDell.isChecked()) {
            total += 1;
        } else {
            Toast.makeText(this, "Error in Question 4", Toast.LENGTH_SHORT).show();
        }

    }

    public void questionFive() {
        RadioButton questionFIveFalse = (RadioButton) findViewById(R.id.question_five_false);
        if (questionFIveFalse.isChecked()) {
            total += 1;

        } else {
            Toast.makeText(this, "Error in Question 5", Toast.LENGTH_SHORT).show();
        }
    }

    public void questionSix() {
        EditText questionSixAnswer = (EditText) findViewById(R.id.question_six_answer);
        String answer = questionSixAnswer.getText().toString();
        if ((answer.equalsIgnoreCase("steve jobs")) || (answer.equalsIgnoreCase("jobs steve"))) {
            total += 1;
        } else {
            Toast.makeText(this, "Error in Question 6", Toast.LENGTH_SHORT).show();
        }
    }

    public void questionSeven() {
        CheckBox questionSevenRedHat = (CheckBox) findViewById(R.id.question_seven_redhat);
        CheckBox questionSevenUbuntu = (CheckBox) findViewById(R.id.question_seven_ubuntu);
        CheckBox questionSevenWindows = (CheckBox) findViewById(R.id.question_seven_windows);
        if (questionSevenRedHat.isChecked() && questionSevenUbuntu.isChecked() && questionSevenWindows.isChecked()) {
            total += 1;
        } else {
            Toast.makeText(this, "Error in Question 7", Toast.LENGTH_SHORT).show();
        }
    }

    public void questionEight() {
        RadioButton questionEightTrue = (RadioButton) findViewById(R.id.question_eight_true);
        if (questionEightTrue.isChecked()) {
            total += 1;

        } else {
            Toast.makeText(this, "Error in Question 8", Toast.LENGTH_SHORT).show();
        }
    }

    public void questionNine() {
        EditText questionNineAnswer = (EditText) findViewById(R.id.question_nine_answer);
        String answer = questionNineAnswer.getText().toString();
        if ((answer.equalsIgnoreCase("alan turing")) || (answer.equalsIgnoreCase("turing alan"))) {
            total += 1;
        } else {
            Toast.makeText(this, "Error in Question 9", Toast.LENGTH_SHORT).show();
        }
    }

    public void reset() {
        CheckBox questionOneNvidia = (CheckBox) findViewById(R.id.question_one_nvidia);
        CheckBox questionOneAmd = (CheckBox) findViewById(R.id.question_one_amd);
        CheckBox questionOneHp = (CheckBox) findViewById(R.id.question_one_hp);
        RadioGroup questionTwo = (RadioGroup) findViewById(R.id.question_two);
        EditText questionThreeAnswer = (EditText) findViewById(R.id.question_three_answer);
        CheckBox questionFourApple = (CheckBox) findViewById(R.id.question_four_apple);
        CheckBox questionFourDell = (CheckBox) findViewById(R.id.question_four_dell);
        CheckBox questionFourMicrosoft = (CheckBox) findViewById(R.id.question_four_microsoft);
        RadioGroup questionFive = (RadioGroup) findViewById(R.id.question_five);
        EditText questionSixAnswer = (EditText) findViewById(R.id.question_six_answer);
        CheckBox questionSevenRedHat = (CheckBox) findViewById(R.id.question_seven_redhat);
        CheckBox questionSevenUbuntu = (CheckBox) findViewById(R.id.question_seven_ubuntu);
        CheckBox questionSevenWindows = (CheckBox) findViewById(R.id.question_seven_windows);
        RadioGroup questionEight = (RadioGroup) findViewById(R.id.question_eight);
        EditText questionNineAnswer = (EditText) findViewById(R.id.question_nine_answer);

        questionOneNvidia.setChecked(false);
        questionOneAmd.setChecked(false);
        questionOneHp.setChecked(false);
        questionTwo.clearCheck();
        questionThreeAnswer.setText(null);
        questionFourApple.setChecked(false);
        questionFourDell.setChecked(false);
        questionFourMicrosoft.setChecked(false);
        questionFive.clearCheck();
        questionSixAnswer.setText(null);
        questionSevenRedHat.setChecked(false);
        questionSevenUbuntu.setChecked(false);
        questionSevenWindows.setChecked(false);
        questionEight.clearCheck();
        questionNineAnswer.setText(null);
        total = 0;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatWasChecked = item.getItemId();
        if (itemThatWasChecked == R.id.action_reset) {
            reset();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
