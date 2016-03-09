package com.gamez.teamlag.onlinestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by YING LOPEZ on 3/9/2016.
 */
public class StoreOrganizer extends RecyclerView.Adapter<StoreOrganizer.ItemViewHolder>{

    private ArrayList<Item> stock;
    private AdapterView.OnItemClickListener itemClickListener;
    private LayoutInflater inflater;
    private CardView cv;

    public StoreOrganizer(ArrayList<Item> items, Context context){
        this.stock = items;
        this.inflater = LayoutInflater.from(context);
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView itemName, itemPrice, itemQuantity;
        public ItemViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.recyclerView);
            itemName = (TextView)itemView.findViewById(R.id.item);

        }
    }

    public Item getItem(int i){
        return this.stock.get(i);
    }

    public void removeStock(int i) {
        this.stock.remove(i);
    }

    public void addStock(Item i){
        this.stock.add(i);
    }
}
