package com.example.com.my;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends android.app.Fragment {
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("onActivityCreated","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("onStart","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("onResume","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("onPause","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("onStop","onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("onDestroy","onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("onDestroyView","onDestroyView");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("onCreate","onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        Log.v("onCreateView","onCreateView");
        return textView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("onAttach","onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("onDetach","onDetach");
    }
}
