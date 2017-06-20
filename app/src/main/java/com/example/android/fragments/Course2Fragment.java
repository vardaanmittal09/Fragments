package com.example.android.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Course2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Course2Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NAME = "name";
    private static final String ARG_TEACHER = "teacher";
    private  static  final  String ARG_LANGUAGE="language";

    // TODO: Rename and change types of parameters
    private String courseName="sample course";
    private String courseTeacher="sample teacher";
    private  String courseLanguage="sample language";

TextView tvName,tvTeacher,tvLanguage;
    public Course2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param name Parameter 1.
     * @param teacher Parameter 2.
     * @return A new instance of fragment Course2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Course2Fragment newInstance(String name, String teacher,String language) {
        Course2Fragment fragment = new Course2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putString(ARG_TEACHER, teacher);
        args.putString(ARG_LANGUAGE,language);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            courseName = getArguments().getString(ARG_NAME);
            courseTeacher = getArguments().getString(ARG_TEACHER);
            courseLanguage=getArguments().getString(ARG_LANGUAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_course,container,false);
        tvName=(TextView)rootView.findViewById(R.id.tvCourseName);
        tvTeacher=(TextView)rootView.findViewById(R.id.tvTeacher);
        tvLanguage=(TextView)rootView.findViewById(R.id.tvLanguage);
        // Inflate the layout for this fragment
        tvName.setText(courseName);
        tvTeacher.setText(courseTeacher);
        tvLanguage.setText(courseLanguage);
        return rootView;
    }

}
