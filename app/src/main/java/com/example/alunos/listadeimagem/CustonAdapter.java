package com.example.alunos.listadeimagem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Alunos on 28/03/2018.
 */

public class CustonAdapter  extends BaseAdapter {
    Integer[] imags;
    Context context;

    private  static LayoutInflater inflater=null;

    public CustonAdapter( Integer[] imagem, MainActivity mainActivity) {
        this.context = mainActivity;
        this.imags = imagem;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imags.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class Holder{
        ImageView im;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.custon_layout, null);
        holder.im=(ImageView) rowView.findViewById(R.id.imageView);
        holder.im.setImageResource(imags[i]);

        return rowView;
    }
}
