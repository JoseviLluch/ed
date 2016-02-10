package myfirstapp.mycompany.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

import myfirstapp.mycompany.calculadora.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnAdd,btnsub,btndivide,btnmul;
    private TextView tvresult;
    private EditText etfirst,etsecond;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnsub =(Button)findViewById(R.id.btnSubtract);
        btnmul =(Button)findViewById(R.id.btnMultiply);
        btndivide =(Button)findViewById(R.id.btnDivide);
        etfirst =(EditText)findViewById(R.id.etPrimerNumero);
        etsecond =(EditText)findViewById(R.id.etSegundoNumero);
        tvresult =(TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);

    }


    @Override
    public void onClick(View View) {
        String num1 =etfirst.getText().toString();
        String num2 =etsecond.getText().toString();
        switch(View.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1)+Integer.parseInt(num2);
                tvresult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int substraction =Integer.parseInt(num1)-Integer.parseInt(num2);
                tvresult.setText(String.valueOf(substraction));
                break;
            case R.id.btnDivide:
                try{
                    int division =Integer.parseInt(num1)/Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                }catch(Exception e){
                    tvresult.setText("NO SE PUEDE DIVIDIR");
                }
                break;
            case R.id.btnMultiply:
                int multiply =Integer.parseInt(num1)*Integer.parseInt(num2);
                tvresult.setText(String.valueOf(multiply));
                break;
        }

    }


}
