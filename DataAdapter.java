package com.example.ficus.medicamentcontrol;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Course> courses;

    DataAdapter(Context context, List<Course> courses) {
        this.courses = courses;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.ViewHolder viewHolder, int i) {
        Course course = courses.get(i);
        viewHolder.name.setText(course.getCourseName());
        viewHolder.description.setText(course.getCourseDescription());
        viewHolder.period.setText(course.getPeriod());
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

     class ViewHolder extends RecyclerView.ViewHolder {
        final TextView name, description, period;
          ViewHolder(@NonNull View itemView) {
             super(itemView);
            name =  itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            period = itemView.findViewById(R.id.period);
         }
     }
}
