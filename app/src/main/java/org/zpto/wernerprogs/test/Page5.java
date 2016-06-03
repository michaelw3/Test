package org.zpto.wernerprogs.test;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.zpto.wernerprogs.interfaces.OnFragmentInteractionListener;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Page2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Page5 extends Fragment {

    private OnFragmentInteractionListener mListener;

    public Page5() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page_holder, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView tv = (TextView) view.findViewById(R.id.pageTextPlaceholder);
        tv.setText("Page 5");
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
        mListener.setToolbarTitle("Page5");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
