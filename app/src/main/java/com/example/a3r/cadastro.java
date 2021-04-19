package com.example.a3r;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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

public class cadastro extends AppCompatActivity {

    private EditText edtEmail_Cad;
    private EditText edtSenhaCad;
    private EditText edtConfSenha;
    private CheckBox ckbMostrarSenha;
    private Button btnRegistro;
    private ProgressBar progressoRegistro;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        mAuth = FirebaseAuth.getInstance();

        edtEmail_Cad = findViewById(R.id.edtEmail_Cad);
        edtSenhaCad = findViewById(R.id.edtSenhaCad);
        edtConfSenha = findViewById(R.id.edtConfSenha);
        ckbMostrarSenha = findViewById(R.id.ckbMostrarSenha);
        btnRegistro = findViewById(R.id.btnRegistro);
        progressoRegistro = findViewById(R.id.progressoRegistro);

        ckbMostrarSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    edtSenhaCad.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    edtConfSenha.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    edtSenhaCad.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    edtConfSenha.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });
        btnRegistro.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String resgistreEmail = edtEmail_Cad.getText().toString();
                String senha = edtSenhaCad.getText().toString();
                String confirmarSenha = edtConfSenha.getText().toString();

                if (!TextUtils.isEmpty(senha) || !TextUtils.isEmpty(senha) || !TextUtils.isEmpty(senha)){
                    if (senha.equals(confirmarSenha)){
                        progressoRegistro.setVisibility(View.VISIBLE);

                        mAuth.createUserWithEmailAndPassword(resgistreEmail,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    AbrirTelaPrinciapl();
                                }else {
                                    String erro = task.getException().getMessage();
                                    Toast.makeText(cadastro.this, ""+erro, Toast.LENGTH_SHORT).show();
                                }
                                progressoRegistro.setVisibility(View.VISIBLE);
                            }
                        });
                    }else{
                        Toast.makeText(cadastro.this, "A senha deve ser a mesma de ambos os campos!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }

    private void AbrirTelaPrinciapl() {
        Intent intent = new Intent(cadastro.this, Mapas.class);
        startActivity(intent);
        finish();
    }
}
