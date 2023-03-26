package com.shubham.tick_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,re;
    int flag=0;
    int count=0;
    int no_of_x=0;
    int no_of_o=0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9,win,numo,numx;
    TextView noo;
    TextView nox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        re = findViewById(R.id.re);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart1();
            }
        });


    }

    public void init(){

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);



    }
    public void restart1(){
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        count=0;
        flag=0;
        no_of_x=0;
        no_of_o=0;

    }
   public void restart(){
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");
        count=0;
        flag=0;


    }
    public void check(View view){
        Button btnno = (Button) view;
        noo = findViewById(R.id.noo);
        nox = findViewById(R.id.nox);
        if(!btnno.getText().toString().equals("X") && !btnno.getText().toString().equals("O")){

            count++;
            if(flag==0){
                btnno.setText("X");
                flag=1;

            }else {
                btnno.setText("O");
                flag=0;
            }
            if(count>4){
                b1=btn1.getText().toString();
                b2=btn2.getText().toString();
                b3=btn3.getText().toString();
                b4=btn4.getText().toString();
                b5=btn5.getText().toString();
                b6=btn6.getText().toString();
                b7=btn7.getText().toString();
                b8=btn8.getText().toString();
                b9=btn9.getText().toString();

                if(b1.equals(b2) && b2.equals(b3) && !b1.equals(" ")){
                    //1
                    win=b1;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();


                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals(" ")){
                    //2
                    win=b4;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b7.equals(b8) && b8.equals(b9)&& !b7.equals(" ")) {
                    //3
                    win=b7;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();

                } else if (b1.equals(b4) && b4.equals(b7)&& !b1.equals(" ")) {
                    //4
                    win=b1;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();

                }else if (b2.equals(b5) && b5.equals(b8)&& !b2.equals(" ")) {
                    //5
                    win=b2;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();

                }else if (b3.equals(b6) && b3.equals(b9)&& !b3.equals(" ")) {
                    //6
                    win=b3;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();

                }else if (b1.equals(b5) && b5.equals(b9)&& !b1.equals(" ")) {
                    //7
                    win=b1;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();
                }else if (b3.equals(b5) && b5.equals(b7) && !b3.equals(" ")) {
                    //8
                    win=b3;
                    Toast.makeText(this, "WINNER is : "+win, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("")
                        && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("")
                        && !b9.equals("") && count==9) {
                    Toast.makeText(this, "MATCH IS DRAWN", Toast.LENGTH_SHORT).show();
                    restart();

                }
                if(win.equals("X")){
                    no_of_x++;
                } else if(win.equals("O")){
                    no_of_o++;
                }


            }




        }
        numx = Integer.toString(no_of_x);
        numo = Integer.toString(no_of_o);

        noo.setText(numo);
        nox.setText(numx);



    }

}