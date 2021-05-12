package com.example.a3r;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class marcardorAdapter extends ArrayAdapter<com.example.a3r.marcador> {

    private final Context context;
    private final ArrayList<com.example.a3r.marcador>elementos;

    public marcardorAdapter(Context context,ArrayList<com.example.a3r.marcador>elementos){

        super(context,R.layout.linha,elementos);
        this.context = context;
        this.elementos = elementos;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha,parent,false);

        TextView nomemarcador = (TextView) rowView.findViewById(R.id.nome);
        TextView descricao = (TextView) rowView.findViewById(R.id.descricao);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nomemarcador.setText(elementos.get(position).getNome());
        descricao.setText(elementos.get(position).getDescricao());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;

    }

}