package com.example.w4_p5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String randomWord = "APPLE";

    ImageView hangman;
    TextView firstLetter;
    TextView secondLetter;
    TextView thirdLetter;
    TextView fourthLetter;
    TextView lastLetter;

    //Reset Button
    Button reset;

    //List of Alphabet buttons
    Button alpA,alpB,alpC,alpD,alpE,alpF,alpG,alpH,alpI,alpJ,alpK,alpL,alpM,alpN,alpO,alpP,alpQ,alpR,alpS,alpT,alpU,alpV,alpW,alpX,alpY,alpZ;



    String[] answerArr = new String[5];
    int correctAnsEntered = 0;
    int wrongAnsEntered = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hangman = (ImageView) findViewById(R.id.hangman_view);
        firstLetter= (TextView) findViewById(R.id.letter1);
        secondLetter= (TextView) findViewById(R.id.letter2);
        thirdLetter= (TextView) findViewById(R.id.letter3);
        fourthLetter= (TextView) findViewById(R.id.letter4);
        lastLetter= (TextView) findViewById(R.id.letter5);




        //initial setting
        String ansCopy = randomWord;
        for (int i = 0; i < ansCopy.length(); i++){
            if (ansCopy != ""){
                answerArr[i] = ansCopy.substring(0);
            }else {
                answerArr[i] = "";
            }
        }
        hangman.setImageResource(R.drawable.beginning);



        reset = (Button) findViewById(R.id.resetBnt);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hangman.setImageResource(R.drawable.beginning);
                correctAnsEntered = 0;
                wrongAnsEntered = 0;
                firstLetter.setText("");
                secondLetter.setText("");
                thirdLetter.setText("");
                fourthLetter.setText("");
                lastLetter.setText("");
                setAllChange(true);
            }
        });


    }; //End of onCreate

    public void setAllChange (Boolean up){
        alpA = (Button) findViewById(R.id.alphabetA);
        alpB = (Button) findViewById(R.id.alphabetB);
        alpC = (Button) findViewById(R.id.alphabetC);
        alpD = (Button) findViewById(R.id.alphabetD);
        alpE = (Button) findViewById(R.id.alphabetE);
        alpF = (Button) findViewById(R.id.alphabetF);
        alpG = (Button) findViewById(R.id.alphabetG);
        alpH = (Button) findViewById(R.id.alphabetH);
        alpI = (Button) findViewById(R.id.alphabetI);
        alpJ = (Button) findViewById(R.id.alphabetJ);
        alpK = (Button) findViewById(R.id.alphabetK);
        alpL = (Button) findViewById(R.id.alphabetL);
        alpM = (Button) findViewById(R.id.alphabetM);
        alpN = (Button) findViewById(R.id.alphabetN);
        alpO = (Button) findViewById(R.id.alphabetO);
        alpP = (Button) findViewById(R.id.alphabetP);
        alpQ = (Button) findViewById(R.id.alphabetQ);
        alpR = (Button) findViewById(R.id.alphabetR);
        alpS = (Button) findViewById(R.id.alphabetS);
        alpT = (Button) findViewById(R.id.alphabetT);
        alpU = (Button) findViewById(R.id.alphabetU);
        alpV = (Button) findViewById(R.id.alphabetV);
        alpW = (Button) findViewById(R.id.alphabetW);
        alpX = (Button) findViewById(R.id.alphabetX);
        alpY = (Button) findViewById(R.id.alphabetY);
        alpZ = (Button) findViewById(R.id.alphabetZ);


        if (up){
            alpA.setEnabled(true);
            alpB.setEnabled(true);
            alpC.setEnabled(true);
            alpD.setEnabled(true);
            alpE.setEnabled(true);
            alpF.setEnabled(true);
            alpG.setEnabled(true);
            alpH.setEnabled(true);
            alpI.setEnabled(true);
            alpJ.setEnabled(true);
            alpK.setEnabled(true);
            alpL.setEnabled(true);
            alpM.setEnabled(true);
            alpN.setEnabled(true);
            alpO.setEnabled(true);
            alpP.setEnabled(true);
            alpQ.setEnabled(true);
            alpR.setEnabled(true);
            alpS.setEnabled(true);
            alpT.setEnabled(true);
            alpU.setEnabled(true);
            alpV.setEnabled(true);
            alpW.setEnabled(true);
            alpX.setEnabled(true);
            alpY.setEnabled(true);
            alpZ.setEnabled(true);
        }
    }

    public void setCorrectAnsEntered (){
        if (correctAnsEntered == randomWord.length()) {
            Toast.makeText(this, "Game Clear!", Toast.LENGTH_SHORT).show();
            //Move onto next page
        }
    }

    public void setWrongAnsEntered() {
        hangman = (ImageView) findViewById(R.id.hangman_view);
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
            Toast.makeText(this, "Game Failed! Press Reset button.", Toast.LENGTH_SHORT).show();
        }
    }



    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        boolean fixCheck = false;

        firstLetter= (TextView) findViewById(R.id.letter1);
        secondLetter= (TextView) findViewById(R.id.letter2);
        thirdLetter= (TextView) findViewById(R.id.letter3);
        fourthLetter= (TextView) findViewById(R.id.letter4);
        lastLetter= (TextView) findViewById(R.id.letter5);

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
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("B")){

                        if (i == 0) {
                            firstLetter.setText("B");
                        }else if (i == 1){
                            secondLetter.setText("B");
                        }else if (i == 2) {
                            thirdLetter.setText("B");
                        }else if (i == 3) {
                            fourthLetter.setText("B");
                        }else if (i == 4) {
                            lastLetter.setText("B");
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


                alpB = findViewById(R.id.alphabetB);
                alpB.setEnabled(false);

            case R.id.alphabetC:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("C")){

                        if (i == 0) {
                            firstLetter.setText("C");
                        }else if (i == 1){
                            secondLetter.setText("C");
                        }else if (i == 2) {
                            thirdLetter.setText("C");
                        }else if (i == 3) {
                            fourthLetter.setText("C");
                        }else if (i == 4) {
                            lastLetter.setText("C");
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


                alpC = findViewById(R.id.alphabetC);
                alpC.setEnabled(false);

            case R.id.alphabetD:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("D")){

                        if (i == 0) {
                            firstLetter.setText("D");
                        }else if (i == 1){
                            secondLetter.setText("D");
                        }else if (i == 2) {
                            thirdLetter.setText("D");
                        }else if (i == 3) {
                            fourthLetter.setText("D");
                        }else if (i == 4) {
                            lastLetter.setText("D");
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


                alpD = findViewById(R.id.alphabetD);
                alpD.setEnabled(false);

            case R.id.alphabetE:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("E")){

                        if (i == 0) {
                            firstLetter.setText("E");
                        }else if (i == 1){
                            secondLetter.setText("E");
                        }else if (i == 2) {
                            thirdLetter.setText("E");
                        }else if (i == 3) {
                            fourthLetter.setText("E");
                        }else if (i == 4) {
                            lastLetter.setText("E");
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


                alpE = findViewById(R.id.alphabetE);
                alpE.setEnabled(false);

            case R.id.alphabetF:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("F")){

                        if (i == 0) {
                            firstLetter.setText("F");
                        }else if (i == 1){
                            secondLetter.setText("F");
                        }else if (i == 2) {
                            thirdLetter.setText("F");
                        }else if (i == 3) {
                            fourthLetter.setText("F");
                        }else if (i == 4) {
                            lastLetter.setText("F");
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


                alpF = findViewById(R.id.alphabetF);
                alpF.setEnabled(false);

            case R.id.alphabetG:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("G")){

                        if (i == 0) {
                            firstLetter.setText("G");
                        }else if (i == 1){
                            secondLetter.setText("G");
                        }else if (i == 2) {
                            thirdLetter.setText("G");
                        }else if (i == 3) {
                            fourthLetter.setText("G");
                        }else if (i == 4) {
                            lastLetter.setText("G");
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


                alpG = findViewById(R.id.alphabetG);
                alpG.setEnabled(false);

            case R.id.alphabetH:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("H")){

                        if (i == 0) {
                            firstLetter.setText("H");
                        }else if (i == 1){
                            secondLetter.setText("H");
                        }else if (i == 2) {
                            thirdLetter.setText("H");
                        }else if (i == 3) {
                            fourthLetter.setText("H");
                        }else if (i == 4) {
                            lastLetter.setText("H");
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


                alpH = findViewById(R.id.alphabetH);
                alpH.setEnabled(false);

            case R.id.alphabetI:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("I")){

                        if (i == 0) {
                            firstLetter.setText("I");
                        }else if (i == 1){
                            secondLetter.setText("I");
                        }else if (i == 2) {
                            thirdLetter.setText("I");
                        }else if (i == 3) {
                            fourthLetter.setText("I");
                        }else if (i == 4) {
                            lastLetter.setText("I");
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


                alpI = findViewById(R.id.alphabetI);
                alpI.setEnabled(false);

            case R.id.alphabetJ:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("J")){

                        if (i == 0) {
                            firstLetter.setText("J");
                        }else if (i == 1){
                            secondLetter.setText("J");
                        }else if (i == 2) {
                            thirdLetter.setText("J");
                        }else if (i == 3) {
                            fourthLetter.setText("J");
                        }else if (i == 4) {
                            lastLetter.setText("J");
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


                alpJ = findViewById(R.id.alphabetJ);
                alpJ.setEnabled(false);

            case R.id.alphabetK:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("K")){

                        if (i == 0) {
                            firstLetter.setText("K");
                        }else if (i == 1){
                            secondLetter.setText("K");
                        }else if (i == 2) {
                            thirdLetter.setText("K");
                        }else if (i == 3) {
                            fourthLetter.setText("K");
                        }else if (i == 4) {
                            lastLetter.setText("K");
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


                alpK = findViewById(R.id.alphabetK);
                alpK.setEnabled(false);

            case R.id.alphabetL:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("L")){

                        if (i == 0) {
                            firstLetter.setText("L");
                        }else if (i == 1){
                            secondLetter.setText("L");
                        }else if (i == 2) {
                            thirdLetter.setText("L");
                        }else if (i == 3) {
                            fourthLetter.setText("L");
                        }else if (i == 4) {
                            lastLetter.setText("L");
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


                alpL = findViewById(R.id.alphabetL);
                alpL.setEnabled(false);

            case R.id.alphabetM:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("M")){

                        if (i == 0) {
                            firstLetter.setText("M");
                        }else if (i == 1){
                            secondLetter.setText("M");
                        }else if (i == 2) {
                            thirdLetter.setText("M");
                        }else if (i == 3) {
                            fourthLetter.setText("M");
                        }else if (i == 4) {
                            lastLetter.setText("M");
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


                alpM = findViewById(R.id.alphabetM);
                alpM.setEnabled(false);

            case R.id.alphabetN:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("N")){

                        if (i == 0) {
                            firstLetter.setText("N");
                        }else if (i == 1){
                            secondLetter.setText("N");
                        }else if (i == 2) {
                            thirdLetter.setText("N");
                        }else if (i == 3) {
                            fourthLetter.setText("N");
                        }else if (i == 4) {
                            lastLetter.setText("N");
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


                alpN = findViewById(R.id.alphabetN);
                alpN.setEnabled(false);

            case R.id.alphabetO:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("O")){

                        if (i == 0) {
                            firstLetter.setText("O");
                        }else if (i == 1){
                            secondLetter.setText("O");
                        }else if (i == 2) {
                            thirdLetter.setText("O");
                        }else if (i == 3) {
                            fourthLetter.setText("O");
                        }else if (i == 4) {
                            lastLetter.setText("O");
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


                alpO = findViewById(R.id.alphabetO);
                alpO.setEnabled(false);

            case R.id.alphabetP:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("P")){

                        if (i == 0) {
                            firstLetter.setText("P");
                        }else if (i == 1){
                            secondLetter.setText("P");
                        }else if (i == 2) {
                            thirdLetter.setText("P");
                        }else if (i == 3) {
                            fourthLetter.setText("P");
                        }else if (i == 4) {
                            lastLetter.setText("P");
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


                alpP = findViewById(R.id.alphabetP);
                alpP.setEnabled(false);

            case R.id.alphabetQ:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("Q")){

                        if (i == 0) {
                            firstLetter.setText("Q");
                        }else if (i == 1){
                            secondLetter.setText("Q");
                        }else if (i == 2) {
                            thirdLetter.setText("Q");
                        }else if (i == 3) {
                            fourthLetter.setText("Q");
                        }else if (i == 4) {
                            lastLetter.setText("Q");
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


                alpQ = findViewById(R.id.alphabetQ);
                alpQ.setEnabled(false);

            case R.id.alphabetR:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("R")){

                        if (i == 0) {
                            firstLetter.setText("R");
                        }else if (i == 1){
                            secondLetter.setText("R");
                        }else if (i == 2) {
                            thirdLetter.setText("R");
                        }else if (i == 3) {
                            fourthLetter.setText("R");
                        }else if (i == 4) {
                            lastLetter.setText("R");
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


                alpR = findViewById(R.id.alphabetR);
                alpR.setEnabled(false);

            case R.id.alphabetS:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("S")){

                        if (i == 0) {
                            firstLetter.setText("S");
                        }else if (i == 1){
                            secondLetter.setText("S");
                        }else if (i == 2) {
                            thirdLetter.setText("S");
                        }else if (i == 3) {
                            fourthLetter.setText("S");
                        }else if (i == 4) {
                            lastLetter.setText("S");
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


                alpS = findViewById(R.id.alphabetS);
                alpS.setEnabled(false);

            case R.id.alphabetT:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("T")){

                        if (i == 0) {
                            firstLetter.setText("T");
                        }else if (i == 1){
                            secondLetter.setText("T");
                        }else if (i == 2) {
                            thirdLetter.setText("T");
                        }else if (i == 3) {
                            fourthLetter.setText("T");
                        }else if (i == 4) {
                            lastLetter.setText("T");
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


                alpT = findViewById(R.id.alphabetT);
                alpT.setEnabled(false);

            case R.id.alphabetU:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("U")){

                        if (i == 0) {
                            firstLetter.setText("U");
                        }else if (i == 1){
                            secondLetter.setText("U");
                        }else if (i == 2) {
                            thirdLetter.setText("U");
                        }else if (i == 3) {
                            fourthLetter.setText("U");
                        }else if (i == 4) {
                            lastLetter.setText("U");
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


                alpU = findViewById(R.id.alphabetU);
                alpU.setEnabled(false);

            case R.id.alphabetV:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("V")){

                        if (i == 0) {
                            firstLetter.setText("V");
                        }else if (i == 1){
                            secondLetter.setText("V");
                        }else if (i == 2) {
                            thirdLetter.setText("V");
                        }else if (i == 3) {
                            fourthLetter.setText("V");
                        }else if (i == 4) {
                            lastLetter.setText("V");
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


                alpV = findViewById(R.id.alphabetV);
                alpV.setEnabled(false);

            case R.id.alphabetW:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("W")){

                        if (i == 0) {
                            firstLetter.setText("W");
                        }else if (i == 1){
                            secondLetter.setText("W");
                        }else if (i == 2) {
                            thirdLetter.setText("W");
                        }else if (i == 3) {
                            fourthLetter.setText("W");
                        }else if (i == 4) {
                            lastLetter.setText("W");
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


                alpW = findViewById(R.id.alphabetW);
                alpW.setEnabled(false);

            case R.id.alphabetX:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("X")){

                        if (i == 0) {
                            firstLetter.setText("X");
                        }else if (i == 1){
                            secondLetter.setText("X");
                        }else if (i == 2) {
                            thirdLetter.setText("X");
                        }else if (i == 3) {
                            fourthLetter.setText("X");
                        }else if (i == 4) {
                            lastLetter.setText("X");
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


                alpX = findViewById(R.id.alphabetX);
                alpX.setEnabled(false);

            case R.id.alphabetY:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("Y")){

                        if (i == 0) {
                            firstLetter.setText("Y");
                        }else if (i == 1){
                            secondLetter.setText("Y");
                        }else if (i == 2) {
                            thirdLetter.setText("Y");
                        }else if (i == 3) {
                            fourthLetter.setText("Y");
                        }else if (i == 4) {
                            lastLetter.setText("Y");
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


                alpY = findViewById(R.id.alphabetY);
                alpY.setEnabled(false);

            case R.id.alphabetZ:
                //Count number of the same alphabet occurred.
                for (int i = 0; i <answerArr.length; i++){
                    if (answerArr[i].equals("Z")){

                        if (i == 0) {
                            firstLetter.setText("Z");
                        }else if (i == 1){
                            secondLetter.setText("Z");
                        }else if (i == 2) {
                            thirdLetter.setText("Z");
                        }else if (i == 3) {
                            fourthLetter.setText("Z");
                        }else if (i == 4) {
                            lastLetter.setText("Z");
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


                alpZ = findViewById(R.id.alphabetZ);
                alpZ.setEnabled(false);

        } //End of onCLick - Switch

    }// End of onCLick


}