package com.example.jgli.fragmentapp;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DescriptionFragment extends Fragment {

    String[] mCourseDescription;
    TextView mCourseDescriptionTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // get the description array from resource
        mCourseDescription = getResources().getStringArray(R.array.course_description);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // returns the fragment view and set the variable for the text view
        View view =  inflater.inflate(R.layout.fragment_description, container, false);
        mCourseDescriptionTextView = (TextView) view.findViewById(R.id.courseDescription);
        return view;
    }

    public void setCourse(int courseIndex) {
        // expose the method that set the description by index
        mCourseDescriptionTextView.setText(mCourseDescription[courseIndex]);
    }

}













