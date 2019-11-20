/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.barajas.pedromanuelcubomedina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class Main2Activity extends Activity {

    RelativeLayout milayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        milayout=new RelativeLayout(this);
        setContentView(milayout);
        RelativeLayout.LayoutParams limites=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        limites.addRule(RelativeLayout.CENTER_VERTICAL);
        limites.addRule(RelativeLayout.CENTER_HORIZONTAL);
        EditText et=new EditText(this);
        et.setId(2);
        et.setText("te dejo volver pulsa ok");
        milayout.addView(et, limites);

        Button b=new Button(this);
        b.setText("Vuelve a casa vuelve");
        RelativeLayout.LayoutParams limites2=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        limites2.addRule(RelativeLayout.BELOW, 2);

        milayout.addView(b,limites2);


        b.setOnClickListener( event-> {
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
        });



    }
}
