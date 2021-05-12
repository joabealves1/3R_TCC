package com.example.a3r;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Legenda extends AppCompatActivity {

    DrawerLayout dl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legendas);

        ListView lista = (ListView) findViewById(R.id.lvMarcadores);
        ArrayAdapter adapter = new marcardorAdapter(this, adicionarMarcadores());
        lista.setAdapter(adapter);

        dl = findViewById(R.id.drawer_layout);
    }

    private ArrayList<com.example.a3r.marcador> adicionarMarcadores(){

        ArrayList<com.example.a3r.marcador> marcadores = new ArrayList<com.example.a3r.marcador>();
        com.example.a3r.marcador e = new com.example.a3r.marcador("ECOPONTOS"
                ,"Os Ecopontos são locais de entrega voluntária, para coletar itens que não são mais utilizados por nós. Não necessariamente materiais recicláveis"
                ,R.drawable.ic_vermelho);
        marcadores.add(e);

        e = new com.example.a3r.marcador("PEV Público"
                ,"Pontos de Entrega Voluntária são coletores em uma área pública apropriados para receber diversos resíduos"
                ,R.drawable.ic_verde);
        marcadores.add(e);

        e = new com.example.a3r.marcador("PEV Privado","Ponto de Entrega Volutário de resíduos é uma área privada para receber diversos tipos de resíduos",R.drawable.ic_azul);
        marcadores.add(e);

        return  marcadores;
    }

    public void ClickMenu(View view){
        //open drawer
        inicio.openDrawer(dl);
    }
    public void ClickLogo(View view){
        //Close drawer
        inicio.closeDrawer(dl);
    }
    public void ClickHome (View view){
        //redirect activity to home
        inicio.redirectActivity(this,inicio.class);
    }
    public  void ClickMapa (View view){
        //redirect activity to legenda
        inicio.redirectActivity(this, Mapas.class);
    }

    public void ClickLegenda(View view){
        //Recreate activity
        recreate();
    }

    public  void ClickLogout(View view){
        //Close app
        inicio.logout(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        inicio.closeDrawer(dl);
    }

}