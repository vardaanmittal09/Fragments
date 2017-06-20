package com.example.android.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends Fragment {



    String courseName,courseTeacher,courseLanguage;

    public CourseFragment(String courseName, String courseTeacher, String courseLanguage) {
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.courseLanguage = courseLanguage;
    }

    TextView tvName,tvTeacher,tvLanguage;

    public CourseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_course,container,false);
        tvName=(TextView)rootView.findViewById(R.id.tvCourseName);
        tvTeacher=(TextView)rootView.findViewById(R.id.tvTeacher);
        tvLanguage=(TextView)rootView.findViewById(R.id.tvLanguage);
        // Inflate the layout for this fragment
        return rootView;
    }
    public void setData(String courseName,String courseTeacher,String courseLanguage){
        tvName.setText(courseName);
        tvTeacher.setText(courseTeacher);
        tvLanguage.setText(courseLanguage);

    }


}
