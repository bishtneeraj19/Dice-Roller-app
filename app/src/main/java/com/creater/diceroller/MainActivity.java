package com.creater.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 private ImageView imageViewDicy1,imageViewDicy2;
 private Button button;
 private ImageButton button1;
 private ConstraintLayout layout;
 private Random myRandomNumber=new Random(),myRandomNumber2=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDicy1=findViewById(R.id.imageView);
        imageViewDicy2=findViewById(R.id.imageView2);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.imageButton);
        layout=findViewById(R.id.layout);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Random random=new Random();
int color= Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
layout.setBackgroundColor(color);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice();
            }
        });
    }
private void rollOurDice()
{
    int myRanNumber=myRandomNumber.nextInt(6)+1;
int myRanNumber2=myRandomNumber2.nextInt(6)+1;
    switch (myRanNumber)
    {
        case 1:imageViewDicy1.setImageResource(R.drawable.dice1);
        break;
        case 2:imageViewDicy1.setImageResource(R.drawable.dice2);
            break;
        case 3:imageViewDicy1.setImageResource(R.drawable.dice3);
            break;
        case 4:imageViewDicy1.setImageResource(R.drawable.dice4);
            break;
        case 5:imageViewDicy1.setImageResource(R.drawable.dice5);
            break;
        case 6:imageViewDicy1.setImageResource(R.drawable.dice6);
            break;}
    switch (myRanNumber2)
    {
        case 1:imageViewDicy2.setImageResource(R.drawable.dice1);
            break;
        case 2:imageViewDicy2.setImageResource(R.drawable.dice2);
            break;
        case 3:imageViewDicy2.setImageResource(R.drawable.dice3);
            break;
        case 4:imageViewDicy2.setImageResource(R.drawable.dice4);
            break;
        case 5:imageViewDicy2.setImageResource(R.drawable.dice5);
            break;
        case 6:imageViewDicy2.setImageResource(R.drawable.dice6);
            break;}
}

}
