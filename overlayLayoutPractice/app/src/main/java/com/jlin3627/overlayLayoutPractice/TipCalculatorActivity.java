package com.jlin3627.overlayLayoutPractice;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TipCalculatorActivity extends AppCompatActivity
{
    private Button _btnTipCalcReturn;
    private Switch _swBill;
    private EditText _edtTxtBill;
    private TextView _lblBillAfterTax;
    private float    _totalBeforeTax;
    private float    _totalAfterTax;
    private boolean   _fBeforeTax;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        viewDidLoad();
        setupClick();
    }
    private void viewDidLoad()
    {
        _btnTipCalcReturn   = findViewById(R.id.btnTipCalcReturn);
        _swBill             = findViewById(R.id.swBill);
        _edtTxtBill         = findViewById(R.id.edtTxtBill);
    }

    private void setupClick()
    {
        _btnTipCalcReturn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                finish();
            }
        });
        _swBill.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                _fBeforeTax = _swBill.isChecked();
            }
        });
        _edtTxtBill.addTextChangedListener(new TextWatcher()
        {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                //if(s.length() == 0)
                    //_edtTxtBill.setText("0.00");
                //else
                //{
                //}

                _totalBeforeTax = Float.parseFloat(String.valueOf(_edtTxtBill.getText()));
                if(_fBeforeTax)
                {

                }
                else
                {
                    _totalAfterTax = _totalBeforeTax;
                    _lblBillAfterTax.setText(String.valueOf(_totalAfterTax));
                }
            }
        });
    }
}
