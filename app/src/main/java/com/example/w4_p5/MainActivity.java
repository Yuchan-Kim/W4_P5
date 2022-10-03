package com.example.w4_p5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String randomWord = "APPLE";

    ImageView hangman;
    TextView firstLetter, secondLetter, thirdLetter, fourthLetter, lastLetter;

    Button reset;
    Button alpA,alpB,alpC,alpD,alpE,alpF,alpG,alpH,alpI,alpJ,alpK,alpL,alpM,alpN,alpO,alpP,alpQ,alpR,alpS,alpT,alpU,alpV,alpW,alpX,alpY,alpZ;

    String[] answerArr = new String[5];
    int correctAnsEntered = 0;
    int wrongAnsEntered = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hangman.findViewById(R.id.hangman_view);

        firstLetter.findViewById(R.id.letter1);
        secondLetter.findViewById(R.id.letter2);
        thirdLetter.findViewById(R.id.letter3);
        fourthLetter.findViewById(R.id.letter4);
        lastLetter.findViewById(R.id.letter5);

        reset.findViewById(R.id.resetBnt);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hangman.setImageResource(R.drawable.beginning);
                correctAnsEntered = 0;
                wrongAnsEntered = 0;

            }
        });


    }; //End of onCreate

    public void setCorrectAnsEntered (){
        if (correctAnsEntered == 5) {

        }
    }

    public void setWrongAnsEntered() {
        if (wrongAnsEntered == 1) {
            hangman.setImageResource(R.drawable.second);
        }else if (wrongAnsEntered == 2){
            hangman.setImageResource(R.drawable.third);
        }else if (wrongAnsEntered == 3){
            hangman.setImageResource(R.drawable.fourth);
        }else if (wrongAnsEntered == 4){
            hangman.setImageResource(R.drawable.fifth);
        }else if (wrongAnsEntered == 5){
            hangman.setImageResource(R.drawable.sixth);
        }else if (wrongAnsEntered <= 6){
            hangman.setImageResource(R.drawable.seventh);
            Toast.makeText(this, "Game Failed!", Toast.LENGTH_SHORT).show();
        }
    }



    public void onClick(View v) {
        boolean fixCheck = false;

        switch(v.getId()){
            case R.id.alphabetA:

                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("A")){

                        if (i == 0) {
                            firstLetter.setText("A");
                        }else if (i == 1){
                            secondLetter.setText("A");
                        }else if (i == 2) {
                            thirdLetter.setText("A");
                        }else if (i == 3) {
                            fourthLetter.setText("A");
                        }else if (i == 4) {
                            lastLetter.setText("A");
                        }

                        fixCheck = true;
                        correctAnsEntered += 1;
                    }
                }

                if (fixCheck){
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setWrongAnsEntered();
                }else {
                    Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setCorrectAnsEntered();
                }


                alpA = findViewById(R.id.alphabetA);
                alpA.setEnabled(false);



            case R.id.alphabetB:

            case R.id.alphabetC:

            case R.id.alphabetD:

            case R.id.alphabetE:

            case R.id.alphabetF:

            case R.id.alphabetG:

            case R.id.alphabetH:

            case R.id.alphabetI:

            case R.id.alphabetJ:

            case R.id.alphabetK:

            case R.id.alphabetL:

            case R.id.alphabetM:

            case R.id.alphabetN:

            case R.id.alphabetO:

            case R.id.alphabetP:

            case R.id.alphabetQ:

            case R.id.alphabetR:

            case R.id.alphabetS:

            case R.id.alphabetT:

            case R.id.alphabetU:

            case R.id.alphabetV:

            case R.id.alphabetW:

            case R.id.alphabetX:

            case R.id.alphabetY:

            case R.id.alphabetZ:

        } //End of onCLick - Switch

    }// End of onCLick
}