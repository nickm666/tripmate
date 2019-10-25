package cluo29.github.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.widget.Toast;
import android.text.TextUtils;

public class Register extends AppCompatActivity {
    private ImageButton back;
    private Button register;
    EditText inputusername,inputemail,inputpassword;
    private FirebaseAuth auth;
    DatabaseReference mydbref = FirebaseDatabase.getInstance().getReference("Users");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        auth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_main2);
        back = findViewById(R.id.back);
        register = findViewById(R.id.myjoin);
        inputusername = (EditText) findViewById(R.id.username);
        inputemail = (EditText) findViewById(R.id.email);
        inputpassword = (EditText) findViewById(R.id.password);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtomain();
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = inputemail.getText().toString().trim();
                final String username = inputusername.getText().toString().trim();
                final String password = inputpassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(getApplicationContext(), "Enter username!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(!task.isSuccessful()){
                            Toast.makeText(Register.this,"SignUp Unsuccessful, Please Try Again",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            String id = mydbref.push().getKey();
                            Myusers nobody = new Myusers(id,username,email);
                            mydbref.child(id).setValue(nobody);
                            Toast.makeText(Register.this,"SignUp Successful ",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Register.this,Profile.class));
                            finish();
                        }
                    }
                });
            }

        });
    }


    public void backtomain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
