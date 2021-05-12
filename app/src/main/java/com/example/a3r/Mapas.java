package com.example.a3r;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Mapas extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    DrawerLayout dl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

       dl = findViewById(R.id.drawer_layout);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng ecopSantaLucia = new LatLng(-9.5716888, -35.756022);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(ecopSantaLucia));
        MarkerOptions options = new MarkerOptions().position(ecopSantaLucia).title("EcoPonto Santa Lúcia");
        options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        mMap.addMarker(options);

        LatLng ecopPajucara = new LatLng(-9.6610913, -35.7092874);
        mMap.addMarker(new MarkerOptions().position(ecopPajucara).title("EcoPonto Pajuçara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ecopPajucara));

        LatLng ecopTabuleiro = new LatLng(-9.593000783675958, -35.76836582794179);
        mMap.addMarker(new MarkerOptions().position(ecopTabuleiro).title("EcoPonto Tabuleiro do Martins"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ecopTabuleiro));

        LatLng ecopVergel = new LatLng(-9.660458315763256, -35.7610076873532);
        mMap.addMarker(new MarkerOptions().position(ecopVergel).title("Ecoponto Vergel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ecopVergel));

        LatLng ecoJaragua = new LatLng(-9.669444223711881, -35.723332792143836);
        mMap.addMarker(new MarkerOptions().position(ecoJaragua).title("Qualitec Soluções Ambientais"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ecoJaragua));

        LatLng pPublicaPrefeitura = new LatLng(-9.67277474049469, -35.72185701956292);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPublicaPrefeitura));
        MarkerOptions options1 = new MarkerOptions().position(pPublicaPrefeitura).title("PEV Pública Prefeitura");
        options1.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        mMap.addMarker(options1);

        LatLng pPublicaMinisteiroTrabalho = new LatLng(-9.648789936355138, -35.71362788787309);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPublicaMinisteiroTrabalho));
        MarkerOptions options2 = new MarkerOptions().position(pPublicaMinisteiroTrabalho).title("PEV Pública Ministeiro Público do Trabalho");
        options2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        mMap.addMarker(options2);

        LatLng pPrivadaCooprel = new LatLng(-9.583120346069336, -35.734859466552734);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaCooprel));
        MarkerOptions options3 = new MarkerOptions().position(pPrivadaCooprel).title("Cooprel Reciclagem");
        options3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options3);

        LatLng pPrivadaCooplum = new LatLng(-9.6219405442019, -35.69656819814278);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaCooplum));
        MarkerOptions options4 = new MarkerOptions().position(pPrivadaCooplum).title("COOPLUM");
        options4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options4);

        LatLng pPrivadaHospitalVida = new LatLng(-9.654117533775805,-35.70391970119461 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaHospitalVida));
        MarkerOptions options5 = new MarkerOptions().position(pPrivadaHospitalVida).title("Hospital Vida");
        options5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options5);

        LatLng pPrivadaLeroyMerlin = new LatLng(-9.628646240792596,-35.6974690146032 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaLeroyMerlin));
        MarkerOptions options6 = new MarkerOptions().position(pPrivadaLeroyMerlin).title("Leroy Merlin");
        options6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options6);

        LatLng pPrivadaSANAMA = new LatLng(-9.648812639704476,-35.71771115730095 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSANAMA));
        MarkerOptions options7 = new MarkerOptions().position(pPrivadaSANAMA).title("SANAMA - Saneamento Alta Maceió");
        options7.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options7);

        LatLng pPrivadaSanamaAlta = new LatLng(-9.538836640842375,-35.71594656962788 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSanamaAlta));
        MarkerOptions options8 = new MarkerOptions().position(pPrivadaSanamaAlta).title("E.T.E. Sanama - Saneamento Alta Maceió");
        options8.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options8);

        LatLng pPrivadaHospitalUnimed = new LatLng(-9.6577565,-35.7315126 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaHospitalUnimed));
        MarkerOptions options9 = new MarkerOptions().position(pPrivadaHospitalUnimed).title("Hospital Unimed Maceió");
        options9.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options9);

        LatLng pPrivadaSINTEP = new LatLng(-9.666700538391716,-35.7444059768214 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSINTEP));
        MarkerOptions options10 = new MarkerOptions().position(pPrivadaSINTEP).title("SINTEP Sin dos Trab Estab de Ens Privado de Maceió");
        options10.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options10);

        LatLng pPrivadaSantaCasaRodrigoR = new LatLng(-9.671801677736884,-35.74543505008576);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSantaCasaRodrigoR));
        MarkerOptions options11 = new MarkerOptions().position(pPrivadaSantaCasaRodrigoR).title("Santa Casa – Rodrigo Ramalho");
        options11.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options11);

        LatLng pPrivadaSecMunSaude = new LatLng(-9.6699109,-35.7416179 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSecMunSaude));
        MarkerOptions options12 = new MarkerOptions().position(pPrivadaSecMunSaude).title("Secretaria Municipal de Saúde de Maceió");
        options12.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options12);

        LatLng pPrivadaCamaraMun = new LatLng( -9.6710895,-35.7243954);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaCamaraMun));
        MarkerOptions options13 = new MarkerOptions().position(pPrivadaCamaraMun).title("Câmara Municipal de Maceió");
        options13.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options13);

        LatLng pPrivadaSERIS = new LatLng(-9.638967337176503,-35.73535333355883 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSERIS));
        MarkerOptions options14 = new MarkerOptions().position(pPrivadaSERIS).title("Secretaria de Estado de Ressocialização e Inclusão Social - SERIS");
        options14.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options14);

        LatLng pPrivadaIntMAmbiente = new LatLng(-9.644745024442507,-35.734929097772486 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaIntMAmbiente));
        MarkerOptions options15 = new MarkerOptions().position(pPrivadaIntMAmbiente).title("Instituto do Meio Ambiente de Alagoas");
        options15.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options15);

        LatLng pPrivadaIPREV = new LatLng(-9.649112866147643,-35.73207963757939 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaIPREV));
        MarkerOptions options16 = new MarkerOptions().position(pPrivadaIPREV).title("IPREV");
        options16.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options16);

        LatLng pPrivadaIFAL = new LatLng(-9.663862,-35.7306972 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaIFAL));
        MarkerOptions options17 = new MarkerOptions().position(pPrivadaIFAL).title("Instituto Federal de Alagoas - Campus Maceió");
        options17.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options17);

        LatLng pPrivadaProclinico = new LatLng( -9.6590107150428,-35.703935704797146);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaProclinico));
        MarkerOptions options18 = new MarkerOptions().position(pPrivadaProclinico).title("Proclínico");
        options18.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options18);

        LatLng pPrivadaPoderJud = new LatLng( -9.615695823694912,-35.71349032341806);
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaPoderJud));
        MarkerOptions options19 = new MarkerOptions().position(pPrivadaPoderJud).title("Poder Judiciario de Alagoas");
        options19.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options19);

        LatLng pPrivadaSantaCasa = new LatLng(-9.66783438931934,-35.74177186104117 );
        mMap.animateCamera(CameraUpdateFactory.newLatLng(pPrivadaSantaCasa));
        MarkerOptions options20 = new MarkerOptions().position(pPrivadaSantaCasa).title("Santa Casa de Maceió");
        options20.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options20);

        LatLng pPrivadaColegioAdventista = new LatLng(-9.6332428,-35.7151793 );
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pPrivadaColegioAdventista,13));
        MarkerOptions options21 = new MarkerOptions().position(pPrivadaColegioAdventista).title("Colégio Adventista");
        options21.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
        mMap.addMarker(options21);
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
        //Recreate activity
        recreate();
    }

    public void ClickLegenda(View view){

        //redirect activity to legenda
        inicio.redirectActivity(this,Legenda.class);
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