package com.example.pjapp.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private Context _Context;
    private int[] _IntPic;
    private String[] _StringsName;
    private String[] _StringsDetial;

    public MainAdapter(Context _Context, int[] _IntPic, String[] _StringsName, String[] _StringsDetial) {
        this._Context = _Context;
        this._IntPic = _IntPic;
        this._StringsName = _StringsName;
        this._StringsDetial = _StringsDetial;
    }

    @Override
    public int getCount() {
        return _IntPic.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=(LayoutInflater) _Context.getSystemService(_Context.LAYOUT_INFLATER_SERVICE);
        View view1=layoutInflater.inflate(R.layout.list_view,parent,false);
        ImageView imageView= view1.findViewById(R.id.imageView);
        TextView textName=view1.findViewById(R.id.textView2);
        TextView textDetail=view1.findViewById(R.id.textView3);

        imageView.setImageResource(_IntPic[position]);
        textName.setText(_StringsName[position]);
        textDetail.setText(_StringsDetial[position]);

        return view1;
    }
}
