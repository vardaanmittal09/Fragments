package com.example.android.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static String TAG="myapp";
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Course> courses=new ArrayList<>();
        courses.add(new Course("Pandora","Arnav","Java"));
        courses.add(new Course("Crux","Sumeet","Java"));
        courses.add(new Course("Algo++","Arnav","C++"));
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        final FragmentManager FragMan=getSupportFragmentManager();
        //final CourseFragment clFrag=new CourseFragment();

        View.OnClickListener courseButtonListener =new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Course course=null;
                switch (v.getId()){
                    case R.id.btn1:course=courses.get(0);break;
                    case R.id.btn2:course=courses.get(1);break;
                    case R.id.btn3:course=courses.get(2);break;
                }
                FragMan.beginTransaction()
                        .replace(R.id.FragContainer,Course2Fragment.newInstance(course))
                        .commit();
            }
        };
        btn1.setOnClickListener(courseButtonListener);
        btn2.setOnClickListener(courseButtonListener);
        btn3.setOnClickListener(courseButtonListener);

    }
}
