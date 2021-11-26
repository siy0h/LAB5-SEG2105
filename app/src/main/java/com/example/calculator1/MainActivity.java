package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
/**This class provides the main functionality of the app. It implements all of the buttons
 * (add, view all, delete, find) with its methods
 *
 * @author Tina Trinh and Serena Iyoha
 * @version 1.0 (11/25/21)
 *
 */

public class MainActivity extends AppCompatActivity {

    //button references
    Button bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu0, budot, divideBTN, plusBTN, minusBTN,
    multiplyBTN, buequal, buclear;
    //text display reference
    TextView display;
    //double representation of the values that are going to added
    double val1, val2;
    //double representation of the final value
    double valFinal;
    enum Operator{none, add, minus, multiply, divide}
    Operator op = Operator.none;
    boolean isNewOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=findViewById(R.id.editText);
        bu0 = findViewById(R.id.bu0);
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        bu3 = findViewById(R.id.bu3);
        bu4 = findViewById(R.id.bu4);
        bu5 = findViewById(R.id.bu5);
        bu6 = findViewById(R.id.bu6);
        bu7 = findViewById(R.id.bu7);
        bu8 = findViewById(R.id.bu8);
        bu9 = findViewById(R.id.bu9);
        budot = findViewById(R.id.budot);

        divideBTN = findViewById(R.id.divideBTN);
        plusBTN = findViewById(R.id.plusBTN);
        minusBTN = findViewById(R.id.minusBTN);
        multiplyBTN = findViewById(R.id.multiplyBTN);

        buequal = findViewById(R.id.buequal);
        buclear = findViewById(R.id.buclear);

        /**The implementation of the zero button. Once this button is clicked, the display will show
         * its number
         */
        bu0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "0");
            }
        });

        /**The implementation of the one button. Once this button is clicked, the display will show
         * its number
         */
        bu1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "1");
            }
        });

        /**The implementation of the two button. Once this button is clicked, the display will show
         * its number
         */
        bu2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "2");
            }
        });

        /**The implementation of the three button. Once this button is clicked, the display will show
         * its number
         */
        bu3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "3");
            }
        });

        /**The implementation of the four button. Once this button is clicked, the display will show
         * its number
         */
        bu4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "4");
            }
        });

        /**The implementation of the five button. Once this button is clicked, the display will show
         * its number
         */
        bu5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "5");
            }
        });

        /**The implementation of the six button. Once this button is clicked, the display will show
         * its number
         */
        bu6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "6");
            }
        });

        /**The implementation of the seven button. Once this button is clicked, the display will show
         * its number
         */
        bu7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "7");
            }
        });

        /**The implementation of the eight button. Once this button is clicked, the display will show
         * its number
         */
        bu8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "8");
            }
        });

        /**The implementation of the nine button. Once this button is clicked, the display will show
         * its number
         */
        bu9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "9");
            }
        });

        /**The implementation of the dot button. Once this button is clicked, the display will show
         * its symbol. It also makes sure that there's only one dot in the display
         */
        budot.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (!display.getText().toString().contains(".") && !display.getText().toString().isEmpty() && !display.getText().toString().equals("-"))
                    display.setText(display.getText() + ".");
            }
        });

        /**The implementation of the clear button. Once this button is clicked, the display will
         * clear
         */
        buclear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                val1 = 0;
                val2 = 0;
                display.setText("");
                op = Operator.none;
            }
        });

        /**The implementation of the divide button. Once this button is clicked, it will divide the two numbers
         * on the display. It makes sure to check
         */
        divideBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.divide;
                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")){
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
                }
                display.setText("");
            }
        });

        /**The implementation of the multiple button. Once this button is clicked, it will mutliply
         * two button values
         */
        multiplyBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = Operator.multiply;
                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")){
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
                }
                display.setText("");
            }
        });


        /**The implementation of the plus button. Once this button is clicked, it will add
         * two button values
         */
        plusBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                op = Operator.add;
                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")){
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
            }
                display.setText("");
            }
        });

        /**The implementation of the minus button. Once this button is clicked, it will add
         * two button values
         */
        minusBTN.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (display.getText().toString().isEmpty()) //if the user wants to enter a negative number
                    display.setText("-");
                else if (!display.getText().toString().equals("-")) {
                    op = Operator.minus;
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = true;
                    display.setText("");
                }
            }
        });

        /**The implementation of the equal button. Once this button is clicked, do whatver operation
         * previously asked.
         */
        buequal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if (!display.getText().toString().isEmpty() && !display.getText().toString().equals("-")) {
                    if (isNewOp)
                        val2 = Double.parseDouble(display.getText().toString());
                    else
                        val1 = Double.parseDouble(display.getText().toString());

                    switch(op) {
                        case none:
                            valFinal = val1;
                            break;
                        case minus:
                            valFinal = val1 - val2;
                            break;
                        case add:
                            valFinal = val1 + val2;
                            break;
                        case multiply:
                            valFinal = val1 * val2;
                            break;
                        case divide:
                            valFinal = val1 / val2;
                            break;
                    }
                    if (valFinal % 1 == 0)
                        display.setText(Integer.toString((int) valFinal));
                    else
                        display.setText(Double.toString(valFinal));
                    valFinal = 0;
                    val1 = Double.parseDouble(display.getText().toString());
                    isNewOp = false;
                }

            }
        });
        };
    }
