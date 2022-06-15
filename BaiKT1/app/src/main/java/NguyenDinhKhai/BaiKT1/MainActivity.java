package NguyenDinhKhai.BaiKT1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView attemps;
    EditText User, Pass;
    Button Login;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attemps = (TextView) findViewById(R.id.attemps);
        User = (EditText) findViewById(R.id.edtUserName);
        Pass = (EditText) findViewById(R.id.edtPass);
        Login = (Button) findViewById(R.id.btnOK);
        
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = i+1;
                i = a;
                attemps.setText(""+a);
                String Username = User.getText().toString();
                String Password = Pass.getText().toString();
                if (Username.equals("maicuongtho") && Password.equals("Cntt60ntu!"))
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}