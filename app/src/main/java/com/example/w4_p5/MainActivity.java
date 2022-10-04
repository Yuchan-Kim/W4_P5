package com.example.w4_p5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView hangman;
    TextView firstLetter;
    TextView secondLetter;
    TextView thirdLetter;
    TextView fourthLetter;
    TextView lastLetter;

    //Reset Button
    Button reset;


    TextView hintTV;

    //List of Alphabet buttons
    Button alpA,alpB,alpC,alpD,alpE,alpF,alpG,alpH,alpI,alpJ,alpK,alpL,alpM,alpN,alpO,alpP,alpQ,alpR,alpS,alpT,alpU,alpV,alpW,alpX,alpY,alpZ;


    Button hint;




    String[] answerArr = new String[5];
    int[] userinput = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int[] ansCode = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int correctAnsEntered = 0;
    int wrongAnsEntered = 0;
    int hintCount = 0;
    boolean fixCheck = false;



    public void setBtn (int command){
        if (command == 0) {
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
        }else if (command == 1) {
            alpA.setEnabled(false);
        }else if (command == 2) {
            alpB.setEnabled(false);
        }else if (command == 3) {
            alpC.setEnabled(false);
        }else if (command == 4) {
            alpD.setEnabled(false);
        }else if (command == 5) {
            alpE.setEnabled(false);
        }else if (command == 6) {
            alpF.setEnabled(false);
        }else if (command == 7) {
            alpG.setEnabled(false);
        }else if (command == 8) {
            alpH.setEnabled(false);
        }else if (command == 9) {
            alpI.setEnabled(false);
        }else if (command == 10) {
            alpJ.setEnabled(false);
        }else if (command == 11) {
            alpK.setEnabled(false);
        }else if (command == 12) {
            alpL.setEnabled(false);
        }else if (command == 13) {
            alpM.setEnabled(false);
        }else if (command == 14) {
            alpN.setEnabled(false);
        }else if (command == 15) {
            alpO.setEnabled(false);
        }else if (command == 16) {
            alpP.setEnabled(false);
        }else if (command == 17) {
            alpQ.setEnabled(false);
        }else if (command == 18) {
            alpR.setEnabled(false);
        }else if (command == 19) {
            alpS.setEnabled(false);
        }else if (command == 20) {
            alpT.setEnabled(false);
        }else if (command == 21) {
            alpU.setEnabled(false);
        }else if (command == 22) {
            alpV.setEnabled(false);
        }else if (command == 23) {
            alpW.setEnabled(false);
        }else if (command == 24) {
            alpX.setEnabled(false);
        }else if (command == 25) {
            alpY.setEnabled(false);
        }else if (command == 26) {
            alpZ.setEnabled(false);
        }else if (command == 100){
            int restCount = 0;
            for (int i = 0; i < userinput.length; i++){
                if (userinput[i] != 1){
                    restCount += 1;
                }
            }
            restCount = restCount/2;
            Random random = new Random();
            while (restCount != 0){
                int randNum = random.nextInt(26)+1;
                if (userinput[randNum-1] != 1 && ansCode[randNum-1] != 1){
                    setBtn(randNum);
                    userinput[randNum-1] = 1;
                    restCount -= 1;
                }
            }
        }else if (command == 101){
            for (int i =0; i < userinput.length; i++){
                if (i == 0 && ansCode[i] == 1 && userinput[i] == 0){
                    for (int j = 0; j < 5; j++){
                        if (answerArr[j].equals("A")){

                            if (j == 0) {
                                firstLetter.setText("A");
                            }else if (j == 1){
                                secondLetter.setText("A");
                            }else if (j == 2) {
                                thirdLetter.setText("A");
                            }else if (j == 3) {
                                fourthLetter.setText("A");
                            }else if (j == 4) {
                                lastLetter.setText("A");
                            }
                            correctAnsEntered += 1;
                            setCorrectAnsEntered();
                        }
                    }
                    userinput[0] = 1;
                    setBtn(1);
                }
                if (i == 4 && ansCode[i] == 1 && userinput[i] == 0){
                    for (int j = 0; j < 5; j++){
                        if (answerArr[j].equals("E")){
                            if (j == 0) {
                                firstLetter.setText("E");
                            }else if (j == 1){
                                secondLetter.setText("E");
                            }else if (j == 2) {
                                thirdLetter.setText("E");
                            }else if (j == 3) {
                                fourthLetter.setText("E");
                            }else if (j == 4) {
                                lastLetter.setText("E");
                            }
                            correctAnsEntered += 1;
                            setCorrectAnsEntered();
                        }
                    }
                    userinput[5] = 1;
                    setBtn(5);
                }
                if (i == 8 && ansCode[i] == 1 && userinput[i] == 0){
                    for (int j = 0; j < 5; j++){
                        if (answerArr[j].equals("I")){

                            if (j == 0) {
                                firstLetter.setText("I");
                            }else if (j == 1){
                                secondLetter.setText("I");
                            }else if (j == 2) {
                                thirdLetter.setText("I");
                            }else if (j == 3) {
                                fourthLetter.setText("I");
                            }else if (j == 4) {
                                lastLetter.setText("I");
                            }
                            correctAnsEntered += 1;
                            setCorrectAnsEntered();
                        }
                    }
                    userinput[9] = 1;
                    setBtn(9);
                }
                if (i == 14 && ansCode[i] == 1 && userinput[i] == 0){
                    for (int j = 0; j < 5; j++){
                        if (answerArr[j].equals("O")){

                            if (j == 0) {
                                firstLetter.setText("O");
                            }else if (j == 1){
                                secondLetter.setText("O");
                            }else if (j == 2) {
                                thirdLetter.setText("O");
                            }else if (j == 3) {
                                fourthLetter.setText("O");
                            }else if (j == 4) {
                                lastLetter.setText("O");
                            }
                            correctAnsEntered += 1;
                            setCorrectAnsEntered();
                        }
                    }
                    userinput[15] = 1;
                    setBtn(15);
                }
                if (i == 20 && ansCode[i] == 1 && userinput[i] == 0){
                    for (int j = 0; j < 5; j++){
                        if (answerArr[j].equals("U")){

                            if (j == 0) {
                                firstLetter.setText("U");
                            }else if (j == 1){
                                secondLetter.setText("U");
                            }else if (j == 2) {
                                thirdLetter.setText("U");
                            }else if (j == 3) {
                                fourthLetter.setText("U");
                            }else if (j == 4) {
                                lastLetter.setText("U");
                            }
                            correctAnsEntered += 1;
                            setCorrectAnsEntered();
                        }
                    }
                    userinput[21] = 1;
                    setBtn(21);
                }
            }
        }




    }

    public void setCorrectAnsEntered (){
        if (correctAnsEntered == 5) { //복붙하면 바꿔야하는곳
            Toast.makeText(this, "Game Clear!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),HangMan_02.class);
            startActivity(intent);
            setBtn(0);
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
        }else if (wrongAnsEntered >= 6){
            hangman.setImageResource(R.drawable.seventh);
            Toast.makeText(getApplicationContext(), "Game Failed! Press Reset button.", Toast.LENGTH_LONG).show();
        }else {
            hangman.setImageResource(R.drawable.beginning);
        }
    }


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
        answerArr[0] = "A";//복붙하면 바꿔야하는곳
        answerArr[1] = "P";
        answerArr[2] = "P";
        answerArr[3] = "L";
        answerArr[4] = "E";

        ansCode = new int[]{1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};






        reset = (Button) findViewById(R.id.resetBnt);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hangman.setImageResource(R.drawable.beginning);
                correctAnsEntered = 0;
                wrongAnsEntered = 0;
                firstLetter.setText("");//복붙하면 바꿔야하는곳
                secondLetter.setText("");
                thirdLetter.setText("");
                fourthLetter.setText("");
                lastLetter.setText("");
                setBtn(0);
            }
        });

        //Alphabets
        alpA = (Button) findViewById(R.id.alphabetA);
        alpA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i < 5; i++){
                    if (answerArr[i].equals("A")){

                        if (i == 0) {
                            firstLetter.setText("A");//복붙하면 바꿔야하는곳
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[0] = 1;
                setBtn(1);
            }
        });


        alpB = (Button) findViewById(R.id.alphabetB);
        alpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i < 5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[1] = 1;
                setBtn(2);
            }
        });


        alpC = (Button) findViewById(R.id.alphabetC);
        alpC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[2] = 1;
                setBtn(3);

            }
        });


        alpD = (Button) findViewById(R.id.alphabetD);
        alpD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }


                userinput[3] = 1;
                setBtn(4);

            }
        });


        alpE = (Button) findViewById(R.id.alphabetE);
        alpE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }

                userinput[4] = 1;

                setBtn(5);

            }
        });


        alpF = (Button) findViewById(R.id.alphabetF);
        alpF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[5] = 1;
                setBtn(6);

            }
        });


        alpG = (Button) findViewById(R.id.alphabetG);
        alpG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[6] = 1;
                setBtn(7);

            }
        });


        alpH = (Button) findViewById(R.id.alphabetH);
        alpH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[7] = 1;
                setBtn(8);

            }
        });


        alpI = (Button) findViewById(R.id.alphabetI);
        alpI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
                    if (answerArr[i].equals("I")){

                        if (i == 0) {
                            firstLetter.setText("I");
                        }else if (i == 1){
                            secondLetter.setText("I");
                        }else if (i == 2) {
                            thirdLetter.setText("I");
                        }else if (i == 3) {
                            fourthLetter.setText("I");
                        }else {
                            lastLetter.setText("I");
                        }

                        fixCheck = true;
                        correctAnsEntered += 1;
                    }
                }

                if (fixCheck){
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[8] = 1;
                setBtn(9);

            }
        });


        alpJ = (Button) findViewById(R.id.alphabetJ);
        alpJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[9] = 1;
                setBtn(10);

            }
        });


        alpK = (Button) findViewById(R.id.alphabetK);
        alpK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[10] = 1;
                setBtn(11);

            }
        });


        alpL = (Button) findViewById(R.id.alphabetL);
        alpL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[11] = 1;
                setBtn(12);

            }
        });


        alpM = (Button) findViewById(R.id.alphabetM);
        alpM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[12] = 1;
                setBtn(13);

            }
        });


        alpN = (Button) findViewById(R.id.alphabetN);
        alpN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[13] = 1;
                setBtn(14);

            }
        });


        alpO = (Button) findViewById(R.id.alphabetO);
        alpO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[14] = 1;
                setBtn(15);

            }
        });


        alpP = (Button) findViewById(R.id.alphabetP);
        alpP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[15] = 1;
                setBtn(16);

            }
        });


        alpQ = (Button) findViewById(R.id.alphabetQ);
        alpQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }


                userinput[16] = 1;
                setBtn(17);

            }
        });


        alpR = (Button) findViewById(R.id.alphabetR);
        alpR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[17] = 1;
                setBtn(18);

            }
        });


        alpS = (Button) findViewById(R.id.alphabetS);
        alpS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[18] = 1;
                setBtn(19);

            }
        });


        alpT = (Button) findViewById(R.id.alphabetT);
        alpT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[19] = 1;
                setBtn(20);

            }
        });


        alpU = (Button) findViewById(R.id.alphabetU);
        alpU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[20] = 1;
                setBtn(21);

            }
        });


        alpV = (Button) findViewById(R.id.alphabetV);
        alpV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[21] = 1;
                setBtn(22);

            }
        });


        alpW = (Button) findViewById(R.id.alphabetW);
        alpW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[22] = 1;
                setBtn(23);

            }
        });


        alpX = (Button) findViewById(R.id.alphabetX);
        alpX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[23] = 1;
                setBtn(24);

            }
        });


        alpY = (Button) findViewById(R.id.alphabetY);
        alpY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[24] = 1;
                setBtn(25);

            }
        });


        alpZ = (Button) findViewById(R.id.alphabetZ);
        alpZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Count number of the same alphabet occurred.
                for (int i = 0; i <5; i++){
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
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    fixCheck = false;
                    setCorrectAnsEntered();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                    wrongAnsEntered += 1;
                    setWrongAnsEntered();
                }
                userinput[25] = 1;
                setBtn(26);

            }

        });

        hintTV = (TextView) findViewById(R.id.hintTextView);
        hint = (Button) findViewById(R.id.hintBnt);
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wrongAnsEntered != 5){
                    if (hintCount == 0){
                        hintTV.setText("Food");
                        hintCount += 1;
                    }else if (hintCount == 1) {
                        setBtn(100);
                        hintCount += 1;
                        wrongAnsEntered += 1;
                        setWrongAnsEntered();
                    }else if (hintCount == 2){
                        setBtn(101);
                        hintCount += 1;
                        wrongAnsEntered += 1;
                        setWrongAnsEntered();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Hint is not available !", Toast.LENGTH_SHORT).show();
                }
            }
        });


        if (savedInstanceState != null){
            String letter01 = savedInstanceState.getString("letter01");
            firstLetter.setText(letter01);
            String letter02 = savedInstanceState.getString("letter02");
            secondLetter.setText(letter02);
            String letter03 = savedInstanceState.getString("letter03");
            thirdLetter.setText(letter03);
            String letter04 = savedInstanceState.getString("letter04");
            fourthLetter.setText(letter04);
            String letter05 = savedInstanceState.getString("letter05");
            lastLetter.setText(letter05);
            correctAnsEntered = savedInstanceState.getInt("correctNum");
            wrongAnsEntered = savedInstanceState.getInt("wrongNum");
            setWrongAnsEntered();

            hintCount = savedInstanceState.getInt("hintCount");
            String str = savedInstanceState.getString("hintText");
            hintTV.setText(str);


            userinput = savedInstanceState.getIntArray("userInput");
            for (int i = 1; i < userinput.length+1; i++){
                if (userinput[i-1] == 1){
                    setBtn(i);
                }
            }
        }

    }; //End of onCreate

    @Override
    protected  void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("letter01", firstLetter.getText().toString());
        outState.putString("letter02", secondLetter.getText().toString());
        outState.putString("letter03", thirdLetter.getText().toString());
        outState.putString("letter04", fourthLetter.getText().toString());
        outState.putString("letter05", lastLetter.getText().toString());
        outState.putInt("correctNum",correctAnsEntered);
        outState.putInt("wrongNum",wrongAnsEntered);
        outState.putIntArray("userInput",userinput);
        outState.putString("hintText", hintTV.getText().toString());
        outState.putInt("hintCount",hintCount);


    }


} // End of Class