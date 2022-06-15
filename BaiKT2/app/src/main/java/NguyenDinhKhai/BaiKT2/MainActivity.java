package NguyenDinhKhai.BaiKT2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTinh;
    EditText edA;
    RadioButton radio13, radio15, radio18;
    int kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTinh = (Button) findViewById(R.id.btnTinh);
        edA = (EditText) findViewById(R.id.edA);
        radio13 = (RadioButton) findViewById(R.id.radio13);
        radio15 = (RadioButton) findViewById(R.id.radio15);
        radio18 = (RadioButton) findViewById(R.id.radio18);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = edA.getText().toString();
                int b = Integer.parseInt(a);
                if(radio13.isChecked()) {
                    kq = b * 13 / 100;
                    Toast.makeText(MainActivity.this, "Your tip will be $" + kq, Toast.LENGTH_SHORT).show();
                }
                else
                     if(radio15.isChecked()) {
                         kq = b * 15/100;
                         Toast.makeText(MainActivity.this, "Your tip will be $"+kq, Toast.LENGTH_SHORT).show();
                     }
                     else
                     if(radio18.isChecked()) {
                         kq = b * 18/100;
                         Toast.makeText(MainActivity.this, "Your tip will be $"+kq, Toast.LENGTH_SHORT).show();
                     }
            }
        });
    }
}