package com.yuhdeveloper.diksiyonhocam.Adapt;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yuhdeveloper.diksiyonhocam.R;
import com.yuhdeveloper.diksiyonhocam.Activity.TekerlemelerActivity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kored on 27.11.2017.
 */

public class myRecyAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

  List<String> listHarfler= new ArrayList<>();
  Context c;
  LayoutInflater layoutInflater;


  public  myRecyAdapter(Context c,List<String> _listHarfler){
    listHarfler = _listHarfler;
    this.c=c;
    layoutInflater = LayoutInflater.from(c);

  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View  v = layoutInflater.inflate(R.layout.custom_recy,parent,false);
    return new myViewHolder(v);
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    myViewHolder _myViewHolder = (myRecyAdapter.myViewHolder) holder;
    _myViewHolder.txtharfler.setText(listHarfler.get(position));
    _myViewHolder.getPosition(position);
  }

  @Override
  public int getItemCount() {
    return listHarfler.size();
  }

  class myViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

    TextView txtharfler;
    public myViewHolder(View itemView) {
      super(itemView);
      itemView.setOnClickListener(this);
      txtharfler = itemView.findViewById(R.id.txt_harfid);
    }

    public void getPosition(int position){
      if(position%2==0){
        itemView.setBackgroundColor(itemView.getResources().getColor(R.color.rec1color));
      }else{
        itemView.setBackgroundColor(itemView.getResources().getColor(R.color.rec2color));
      }
    }

    @Override
    public void onClick(View view) {
      Intent intent= new Intent(c, TekerlemelerActivity.class);
      intent.putExtra("Harf",txtharfler.getText().toString());
      c.startActivity(intent);
    }
  }
}
