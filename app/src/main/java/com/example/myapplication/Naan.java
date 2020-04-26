package com.example.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Naan extends Fragment implements AdapterView.OnItemClickListener {

    public Naan() {
        // Required empty public constructor
    }
    ListView naan_list;
    String[] listnaan;
    String nan;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_lassi, container, false);
        ListView naan_list=v.findViewById(R.id.lassi_list);
        listnaan=getResources().getStringArray(R.array.Naan);
        teaadapter padapter = new teaadapter(getActivity(),listnaan);
        naan_list.setAdapter(padapter);
        naan_list.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0) {
            String nan = listnaan[position];
             lassi1dialogue(nan);
        }
        if(position==1){
            String nan = listnaan[position];
            lassi1dialogue(nan);
        }
        if(position==2){
            String nan = listnaan[position];
            lassi1dialogue(nan);
        }
        if(position==3){
            String nan = listnaan[position];
            lassi1dialogue(nan);
        }
        if(position==4){
            String nan = listnaan[position];
            lassi1dialogue(nan);
        }
        if(position==5){
            String nan = listnaan[position];
            lassi1dialogue(nan);
        } 

    }



    private void lassi1dialogue(String nan) {
        final AlertDialog.Builder alert =new AlertDialog.Builder(getActivity());
        View mview =getLayoutInflater().inflate(R.layout.alertdialogue,null);
        TextView item_name=mview.findViewById(R.id.alertTitle);
        item_name.setText(nan);
        Button okbtn=mview.findViewById(R.id.okbtn);
        Button cancelbtn=mview.findViewById(R.id.cancelbtn);
        final EditText text=mview.findViewById(R.id.quantity);
        item_name.setText(nan);
        alert.setView(mview);
        final AlertDialog alertDialog =alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        okbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nan1=text.getText().toString();
                if (nan1.isEmpty()){
                    Toast.makeText(getActivity(),"It is empty" ,Toast.LENGTH_SHORT).show();

                }else {
                    int numberlassi = Integer.parseInt(nan1);
                    alertDialog.dismiss();
                }


            }
        });
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }
}
