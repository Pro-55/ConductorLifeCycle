package com.example.admin.conductorlifecycle;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

public class SecondController extends Controller {


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        Log.d("Invoked: ","onCreateView 2");
        return inflater.inflate(R.layout.controller_two, container, false);
    }

    @Override
    protected void onAttach(@NonNull View view) {
        super.onAttach(view);
        Log.d("Invoked: ","onAttach 2");
    }

    @Override
    protected void onDetach(@NonNull View view) {
        super.onDetach(view);
        Log.d("Invoked: ","onDetach 2");
    }

    @Override
    protected void onDestroyView(@NonNull View view) {
        super.onDestroyView(view);
        Log.d("Invoked: ","onDestroyView 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Invoked: ","onDestroy 2");
    }
}
