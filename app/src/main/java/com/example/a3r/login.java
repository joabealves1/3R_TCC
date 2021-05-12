package com.example.a3r;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtSenha;
    private Button btnLogin;
    private Button btnCadastro;
    private FirebaseAuth mAuth;
    private ProgressBar loadingLogin;
    private CheckBox ckbMostrarSenha;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            mAuth = FirebaseAuth.getInstance();
            edtEmail = findViewById(R.id.edtEmail);
            edtSenha = findViewById(R.id.edtSenha);
            btnLogin = findViewById(R.id.btnLogin);
            btnCadastro = findViewById(R.id.btnCadastro);
            loadingLogin = findViewById(R.id.loadingLogin);
            ckbMostrarSenha = findViewById(R.id.ckbMostrarSenha);

            mAuth = FirebaseAuth.getInstance();
            loadingLogin = findViewById(R.id.loadingLogin);




            ckbMostrarSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        edtSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    }else{
                        edtSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }

                }
            });

            btnLogin.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String loginEmail = edtEmail.getText().toString();
                    String loginSenha = edtSenha.getText().toString();
 
                    if(!TextUtils.isEmpty(loginEmail) || (!TextUtils.isEmpty(loginSenha))){
                        loadingLogin.setVisibility(View.VISIBLE);
                        mAuth.signInWithEmailAndPassword(loginEmail,loginSenha)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful()) {
                                        AbrirTelaPrincipal();
                                    }else {
                                        String erro = task.getException().getMessage();
                                        Toast.makeText(login.this,""+erro, Toast.LENGTH_SHORT).show();
                                        loadingLogin.setVisibility(View.INVISIBLE);
                                    }
                                    }
                                });
                    }
                }
            });
            btnCadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(login.this,cadastro.class);
                    startActivity(intent);
                    finish();
                }
            });




        }

    private void AbrirTelaPrincipal() {
        Intent intent = new Intent(login.this, Mapas.class);
        startActivity(intent);
        finish();
    }

    public void Mapas(View view) {
        Intent intent = new Intent(login.this, Mapas.class);
        startActivity(intent);
        finish();
    }
}