package estacio.edu.br.pushnotification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    Button btToken;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.btToken = findViewById(R.id.logTokenButton);
        this.editText = findViewById(R.id.editText);
        this.btToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preencherEditText();
            }
        });



    }

    private void preencherEditText() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.i("TOKEN DO TELEFONE:",token);
        this.editText.setText(token);
    }
}
