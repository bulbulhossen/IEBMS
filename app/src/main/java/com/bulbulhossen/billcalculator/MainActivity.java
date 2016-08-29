package com.bulbulhossen.billcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText firstNumber, bookname;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;

    double num1, num2, sum;
    private static final String[] booknamestr = new String[]{
            "Bulbul Hossen", "Md.Fraukh", "Dulal", "Motaleb", "Shishir", "Md.Mula Ahmed", "Abul Kalam Azad", "Anis", "Ansur Mula"
    };

    private static final String[] miternumberstr = new String[]{
            "1051", "555", "151321", "10055", "10025", "554", "10026", "10024", "10023 1022"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText) findViewById(R.id.txtNumber1);
        secondNumber = (EditText) findViewById(R.id.txtNumber2);
        addResult = (TextView) findViewById(R.id.txtResult);
        btnAdd = (Button) findViewById(R.id.btnAdd);


        // Book Name
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.bookname);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, booknamestr);
        textView.setAdapter(adapter);

        // Miter number
        AutoCompleteTextView miter = (AutoCompleteTextView) findViewById(R.id.mitername);
        ArrayAdapter<String> adapterr = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, miternumberstr);
        miter.setAdapter(adapterr);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstNumber.getText().toString());
                num2 = Double.parseDouble(secondNumber.getText().toString());
                sum = num1 - num2;
                addResult.setText(Double.toString(sum));
            }
        });


    }
}
