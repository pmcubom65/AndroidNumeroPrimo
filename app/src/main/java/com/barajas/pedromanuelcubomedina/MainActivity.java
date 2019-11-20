package com.barajas.pedromanuelcubomedina;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    boolean resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seguir();

    }


    public void seguir() {
        if (resultado) {
            Intent i=new Intent(this, Main2Activity.class);
            startActivity(i);
        }


    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setMessage("esta seguro de que quiere salir??")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        setContentView(R.layout.otrolayout);
                    Button botonk=(Button) findViewById(R.id.botonako);
                        RadioButton rb2=(RadioButton) findViewById(R.id.b2);
                        rb2.setOnCheckedChangeListener((buttonView, isChecked) -> {
                           System.out.println( buttonView.getText());
                        });


                        botonk.setOnClickListener(new View.OnClickListener() {
                            RadioGroup grupo=(RadioGroup) findViewById(R.id.grupo);
                            RadioButton rb1=(RadioButton) findViewById(R.id.b1);
                            RadioButton rb2=(RadioButton) findViewById(R.id.b2);



                            @Override
                            public void onClick(View v) {
                                if (grupo.getCheckedRadioButtonId()==R.id.b1){
                                            System.out.println("aqui");
                                        resultado=true;
                                        System.out.println(resultado);

                                } else {
                                    resultado=false;
                                }
                            }
                        });



// no tocar nada a partir de aquii
                    }
                }).setNegativeButton(android.R.string.no, null)
                   .show();

    }






    public void hacerclick(View view) {
        Button boton1= (Button) findViewById(R.id.miboton);

        boton1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero=(EditText)  findViewById(R.id.mitexto);
                EditText salida=(EditText)  findViewById(R.id.textofinal);
           //     salida.setText("no de a la flecha atrás por favor!!!");

                int entrada=0;
              try {
                  entrada=Integer.parseInt(numero.getText().toString());
              } catch (NumberFormatException nf) {
                  salida.setText(String.format("%s", "La posición tiene que ser mayor que 0"));
              }
               int miprimo= Primo.damePrimo(entrada);
               if(miprimo==0) {
                   salida.setText(String.format("%s", "La posición tiene que ser mayor que 0"));
               }else {
                   salida.setText(String.format("El primo número %d es el %d", entrada, miprimo));
               }
            }
        });

    }
}
