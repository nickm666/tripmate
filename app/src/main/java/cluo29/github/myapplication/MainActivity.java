package cluo29.github.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Joinbutton;
    private Button Loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Joinbutton = findViewById(R.id.Joinus);
        Loginbutton = findViewById(R.id.Login);
        Joinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjoinactivity();

            }
        });
        Loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openloginactivity();
            }
        });

    }
    public void openjoinactivity(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void openloginactivity(){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }


}
