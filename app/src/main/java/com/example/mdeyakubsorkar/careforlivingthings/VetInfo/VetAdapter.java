package com.example.mdeyakubsorkar.careforlivingthings.VetInfo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mdeyakubsorkar.careforlivingthings.R;

import java.util.List;


public class VetAdapter extends BaseAdapter{

    private Context mContext;
    private List<Vet> mVetList;

    public VetAdapter(Context mContext, List<Vet> mVetList){
        this.mContext = mContext;
        this.mVetList = mVetList;
    }

    @Override
    public int getCount() {
        return mVetList.size();
    }

    @Override
    public Object getItem(int position) {
        return mVetList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.list_item_vet, null);
        TextView vetName = (TextView) v.findViewById(R.id.vetsName);
        TextView vetDist = (TextView) v.findViewById(R.id.vetsDistrict);

        vetName.setText(mVetList.get(position).getVetName());
        vetDist.setText(mVetList.get(position).getVetDistrict());

        return v;
    }
}


