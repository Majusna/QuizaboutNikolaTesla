package com.example.android.quizaboutnikolatesla;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    int final_result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * this method displays score when "showResult" button is clicked
     */

    public void showResult (View view) {

        RadioButton answer1 = (RadioButton) findViewById(R.id.priest);
        boolean isCheckedA1 = answer1.isChecked();

        RadioButton answer2 = (RadioButton) findViewById(R.id.magneticinduction);
        boolean isCheckedA2 = answer2.isChecked();

        EditText checkEditTextA = (EditText) findViewById(R.id.answerA);
        String answer3A = checkEditTextA.getText().toString();
        EditText checkEditTextB = (EditText) findViewById(R.id.answerB);
        String answer3B = checkEditTextB.getText().toString();
        EditText checkEditTextC = (EditText) findViewById(R.id.answerC);
        String answer3C = checkEditTextC.getText().toString();
        EditText checkEditTextD = (EditText) findViewById(R.id.answerD);
        String answer3D = checkEditTextD.getText().toString();

        RadioButton answer4 = (RadioButton) findViewById(R.id.george);
        boolean isCheckedA4 = answer4.isChecked();

        RadioButton answer5 = (RadioButton) findViewById(R.id.marconi);
        boolean isCheckedA5 = answer5.isChecked();

        RadioButton answer6 = (RadioButton) findViewById(R.id.longIsland);
        boolean isCheckedA6 = answer6.isChecked();

        EditText checkEditText7= (EditText) findViewById(R.id.edison);
        String answer7 = checkEditText7.getText().toString();

        RadioButton answer8 = (RadioButton) findViewById(R.id.niagara);
        boolean isCheckedA8 = answer8.isChecked();

        displayResult(calculateResult(isCheckedA1,isCheckedA2,answer3A,answer3B,answer3C,answer3D,isCheckedA4,isCheckedA5,isCheckedA6,answer7,isCheckedA8));
    }

    /**
     * this method adds points if answers are true
     */

    private int calculateResult (boolean a1, boolean a2,String c1,String c2,String c3,String c4,boolean a4,boolean a5,boolean a6,String a7,boolean a8){

        if (a1){
            final_result+=1;
        }
        if (a2){
            final_result+=1;
        }
        if (c1.equals("C") && c2.equals("A") && c3.equals("D") && c4.equals("B") )
            final_result+=2;

        if (a4){
            final_result+=1;
        }
        if (a5){
            final_result+=1;
        }
        if (a6){
            final_result+=1;
        }
        if(a7.equals("Thomas Edison"))
            final_result+=2;

        if (a8){
            final_result+=1;
        }

        return final_result;
    }


    /**
     * next 6 methods displays facts on the screen wen check boxes are checked
     */

    public void firstFact (View view) {
        TextView text1 = (TextView) findViewById(R.id.first_line);
        CheckBox answer9a = (CheckBox) findViewById(R.id.fact1);
        boolean factOne = answer9a.isChecked();
        if (factOne) {
            text1.setText(R.string.fact1);
        }
    }

    public void secondFact (View view) {
        TextView text2 = (TextView) findViewById(R.id.second_line);
        CheckBox answer9b = (CheckBox) findViewById(R.id.fact2);
        boolean factTwo = answer9b.isChecked();
        if (factTwo){
            text2.setText(R.string.fact2);
        }
    }

    public void thirdFact (View view) {
        TextView text3 = (TextView) findViewById(R.id.third_line);
        CheckBox answer9c = (CheckBox) findViewById(R.id.fact3);
        boolean FactThree = answer9c.isChecked();
        if (FactThree){
            text3.setText(R.string.fact3);
        }
    }

    public void fourthFact (View view) {
        TextView text4 = (TextView) findViewById(R.id.fourth_line);
        CheckBox answer9d = (CheckBox) findViewById(R.id.fact4);
        boolean factFour = answer9d.isChecked();
        if (factFour){
            text4.setText(R.string.fact4);
        }
    }

    public void fifthFact (View view) {
        TextView text5 = (TextView) findViewById(R.id.fifth_line);
        CheckBox answer9e = (CheckBox) findViewById(R.id.fact5);
        boolean factFive = answer9e.isChecked();
        if (factFive){
            text5.setText(R.string.fact5);
        }
    }

    public void sixtFact (View view){
        TextView text6 = (TextView) findViewById(R.id.sixth_line);
        CheckBox answer9f = (CheckBox) findViewById(R.id.fact6);
        boolean factSix = answer9f.isChecked();
        if (factSix){
            text6.setText(R.string.fact6);
        }

    }

    /**
     * this method displays message on the screen
     */
    public void displayResult (int result) {
        Toast.makeText(getApplicationContext(), "You won " + result +" of 10 points", Toast.LENGTH_LONG).show();
        final_result =0;
    }


}



