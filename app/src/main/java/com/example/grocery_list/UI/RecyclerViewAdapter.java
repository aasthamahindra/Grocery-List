package com.example.grocery_list.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grocery_list.Model.Grocery;
import com.example.grocery_list.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Grocery> groceryItems;

    public RecyclerViewAdapter(Context context, List<Grocery> groceryItems) {
        this.context = context;
        this.groceryItems = groceryItems;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);

        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        Grocery grocery = groceryItems.get(position);

        holder.groceryItemName.setText(grocery.getName());
        holder.quantity.setText(grocery.getQuantity());
        holder.dateAdded.setText(grocery.getDateItemAdded());

    }

    @Override
    public int getItemCount() {
        return groceryItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView groceryItemName;
        public TextView quantity;
        public TextView dateAdded;
        public Button editButton;
        public Button deleteButton;
        public int id;

        public ViewHolder(@NonNull View itemView, Context ctx) {
            super(itemView);

            context = ctx;

            groceryItemName = (TextView) itemView.findViewById(R.id.name);
            quantity = (TextView) itemView.findViewById(R.id.quantity) ;
            dateAdded = (TextView) itemView.findViewById(R.id.dateAdded);
            editButton = (Button) itemView.findViewById(R.id.editButton);
            deleteButton = (Button) itemView.findViewById(R.id.deleteButton) ;

            editButton.setOnClickListener(this);
            deleteButton.setOnClickListener(this);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //go to next screen
                }
            });
        }

        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.editButton:

                    break;

                case R.id.deleteButton:

                    break;

            }

        }
    }
}
