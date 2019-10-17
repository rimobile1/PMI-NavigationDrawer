package br.com.example.navigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class CustomFragment extends Fragment {

    private String nome;
    private int idImagem;

    public static CustomFragment newInstance(String nome, int idImagem) {
        CustomFragment fragment = new CustomFragment();
        fragment.nome = nome;
        fragment.idImagem = idImagem;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_custom, container, false);
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(idImagem);
        getActivity().setTitle(nome);

        return view;
    }

}
