package com.example.kennedycalvins.projectui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Players extends AppCompatActivity {

    int[] IMAGES = {R.drawable.goli, R.drawable.playerone, R.drawable.playertwo, R.drawable.playerthree, R.drawable.playerfour, R.drawable.playerfive, R.drawable.playersix, R.drawable.playerseven};

    String [] NAMES = {"Mc Klein", "Christopher Obi", "Sam Oyugi", "Paddy Adala", "Blackberry Mwangi", "Alexis Sanchez", "Nicholas Anelka", "Didier Drogba"};

    String [] DESCRIPTIONS = {"GoalKeeper", "Defender", "Defender", "Mildfielder", "Mildfielder", "Mildfielder", "Striker", "Striker"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customlayout);

        ListView listView=(ListView)findViewById(R.id.listView);

        CustomAdapater customAdapater = new CustomAdapater();

        listView.setAdapter(customAdapater);

    }

    class CustomAdapater extends BaseAdapter{


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.activity_players,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name=(TextView)view.findViewById(R.id.textView_name);
            TextView textView_description=(TextView)view.findViewById(R.id.textView_description);

            //Binding the data to the image view

            //Getting images from the image array
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);


            return view;
        }
    }
}
