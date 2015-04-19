package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> forecast_adapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> weatherData = new ArrayList<String>();
        weatherData.add("Today - Sunny - 88 / 63");
        weatherData.add("Tomorrow - Sunny - 88 / 63");
        weatherData.add("Monday - Sunny - 88 / 63");
        weatherData.add("Tuesday - Sunny - 88 / 63");
        weatherData.add("Wednesday - Sunny - 88 / 63");
        weatherData.add("Thursday - Sunny - 88 / 63");
        weatherData.add("Friday- Sunny - 88 / 63");
        weatherData.add("Saturday - Sunny - 88 / 63");
        weatherData.add("Sunday - Sunny - 88 / 63");

        forecast_adapter = new ArrayAdapter<String>(
                                    //The current context (fragment's parent activity)
                                    getActivity(),
                                    //ID of the list item layout
                                    R.layout.list_item_forecast,
                                    //links to the specific textView
                                    R.id.list_item_forecast_textview,
                                    //reference to our forecast data
                                    weatherData);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecast_adapter);

        return rootView;
    }
}
