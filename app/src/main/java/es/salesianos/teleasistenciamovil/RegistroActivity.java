package es.salesianos.teleasistenciamovil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import es.salesianos.connection.ConexionSQLiteHelper;

public class RegistroActivity extends AppCompatActivity {

    private EditText txt1, txt2, txt3, txt4, txt5;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_usuarios", null,1);


        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        txt3 = (EditText)findViewById(R.id.txt3);
        txt4 = (EditText)findViewById(R.id.txt4);
        txt5 = (EditText)findViewById(R.id.txt5);
        btn = (Button) findViewById(R.id.btn);

    }
}
