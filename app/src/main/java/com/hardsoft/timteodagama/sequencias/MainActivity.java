package com.hardsoft.timteodagama.sequencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String sequencia;
    Random random = new Random(10000);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sequencia = " ";
    }

    public void LevelOne(View view){
        random.setSeed(100);
        int n1 = random.nextInt(50);
        int n2 = random.nextInt(1000);

        for(int i = 1; i<4;i++){
            n1 = 11-(i+1);
            n2 = 12+i+1;
            if(i<3){
            sequencia = sequencia+"   "+n1;
            sequencia = sequencia+"   "+n2;
            }else {
                sequencia = sequencia+"   "+n1;
            }
        }
        TextView viewshow = (TextView) findViewById(R.id.viewSequence);
        viewshow.setText(sequencia);

        sequencia="";

        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText("Selecione o número que completa a sequência.");

        Button op1 = (Button) findViewById(R.id.option1);
        op1.setText(""+n2);
        Button jogar = (Button) findViewById(R.id.jogar);
        jogar.setVisibility(View.INVISIBLE);


        Button op2 = (Button) findViewById(R.id.option2);
        Button op3 = (Button) findViewById(R.id.option3);
        Button op4 = (Button) findViewById(R.id.option4);


        random.setSeed(5);
        op2.setText(String.valueOf(random.nextInt()));
        op3.setText(String.valueOf(random.nextInt()));
        op4.setText(String.valueOf(random.nextInt()));
    }
    public void Sair(View v){
        System.exit(1);
    }
    public void ZerarValores(){
        Button op1 = (Button) findViewById(R.id.option3);
        Button op2 = (Button) findViewById(R.id.option3);
        Button op3 = (Button) findViewById(R.id.option3);
        Button op4 = (Button) findViewById(R.id.option3);
        op1.setText(" ");
        op2.setText(" ");
        op3.setText(" ");
        op4.setText(" ");

    }
    public void Ganhou(View v){
        TextView tv = (TextView) findViewById(R.id.resultado);
        tv.setText("Parabéns você acertou.");
        ZerarValores();
    }
    public void Perdeu(View view){
        TextView tv = (TextView) findViewById(R.id.resultado);
        tv.setText("Errado");
        ZerarValores();
    }
}
