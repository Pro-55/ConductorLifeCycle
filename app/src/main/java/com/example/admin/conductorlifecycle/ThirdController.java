package com.example.admin.conductorlifecycle;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

public class ThirdController extends Controller {


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        Log.d("Invoked: ","onCreateView 3");
        return inflater.inflate(R.layout.controller_three, container, false);
    }

    @Override
    protected void onAttach(@NonNull View view) {
        super.onAttach(view);
        Log.d("Invoked: ","onAttach 3");
    }

    @Override
    protected void onDetach(@NonNull View view) {
        super.onDetach(view);
        Log.d("Invoked: ","onDetach 3");
    }

    @Override
    protected void onDestroyView(@NonNull View view) {
        super.onDestroyView(view);
        Log.d("Invoked: ","onDestroyView 3");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Invoked: ","onDestroy 3");
    }
}
