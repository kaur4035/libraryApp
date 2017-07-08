package com.garrytechnologieshub.librarymanagement;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by preet on 7/8/2017.
 */

public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(),
                "OnIemSelectedLisnter:" + parent.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
