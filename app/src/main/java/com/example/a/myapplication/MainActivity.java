package com.example.a.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //  ListView mlistview;
//

    //String[] array_technic;
    ListView mlistview;
    String[] fruit = {"Mango", "Apple", "Jackfruit", "Litchi","Mango", "Apple", "Jackfruit", "Litchi","Mango", "Apple", "Jackfruit", "Litchi"};
    String[] color = {"Green", "Yellow", "dark", "red","Green", "Yellow", "dark", "red","Green", "Yellow", "dark", "red"};
    Integer[] image = {R.drawable.m, R.drawable.m2, R.drawable.m3, R.drawable.m4,R.drawable.m, R.drawable.m2, R.drawable.m3, R.drawable.m4,R.drawable.m, R.drawable.m2, R.drawable.m3, R.drawable.m4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  array_technic =getResources().getStringArray(R.array.array_technic);

        //mlistview=findViewById(R.id.list);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        //      getApplicationContext(), android.R.layout.simple_list_item_1, array_technic);

        //mlistview.setAdapter(adapter);


        MyListAdapter adapter=new MyListAdapter(this, fruit, color,image);
        mlistview=(ListView)findViewById(R.id.list);
        mlistview.setAdapter(adapter);
        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),"Mango",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"apple",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Jackfruit",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"lice",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}