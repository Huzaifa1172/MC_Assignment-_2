package com.example.daily_hafizquran_activity;

import android.content.Context;
import android.media.FaceDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class RecyclerStudent extends RecyclerView.Adapter<RecyclerStudent.ViewHolder> {

    Context context;
    ArrayList<StudentModel> arrayStudent;
    RecyclerStudent(Context context, ArrayList<StudentModel> arrayStudent)
    {
        this.context=context;
        this.arrayStudent=arrayStudent;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.student_row,parent, false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtName.setText(arrayStudent.get(position).name);
        holder.Age.setText(arrayStudent.get(position).Age);
    }

    @Override
    public int getItemCount() {
        return arrayStudent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,Age;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.Student);
            Age=itemView.findViewById(R.id.age);
        }
    }
}
