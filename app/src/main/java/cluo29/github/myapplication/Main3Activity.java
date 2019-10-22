package cluo29.github.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
    private ImageButton back;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back = findViewById(R.id.loginback);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtomain();
            }
        });
    }
    public void backtomain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
