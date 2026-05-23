package com.example.techgadgetsappassignment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_IMAGE_RES_ID = "extra_image_res_id";
    public static final String EXTRA_URL = "extra_url";

    private ListView gadgetsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] gadgets = {
            getString(R.string.tvScreen),
            getString(R.string.tvDesk),
            getString(R.string.tvKeyboard),
            getString(R.string.tvPC),
            getString(R.string.tvLamp)
        };

        gadgetsListView = findViewById(R.id.gadgetsListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                gadgets
        );

        gadgetsListView.setAdapter(adapter);

        gadgetsListView.setOnItemClickListener((parent, view, position, id) -> {
            String title;
            int imageResId;
            String url;

            switch (position) {
                case 0:
                    title = getString(R.string.tvScreen);
                    imageResId = R.drawable.screen;
                    url = "https://us.aura-displays.com/products/triple-aero-pro-max";
                    break;
                case 1:
                    title = getString(R.string.tvDesk);
                    imageResId = R.drawable.desk;
                    url = "https://www.uline.com/BL_3795/Metro-L-Desks-with-Adjustable-Height-Return?keywords=standing+desk";
                    break;
                case 2:
                    title = getString(R.string.tvKeyboard);
                    imageResId = R.drawable.keyboard;
                    url = "https://www.walmart.com/ip/Wireless-gaming-Keyboard-Mouse-Rainbow-Backlit-Rechargeable-Mouse-3800mAh-Battery-Metal-Panel-Removable-Hand-Rest-Mechanical-Feel-7-Color-Gaming-Mute/13376923294?wmlspartner=wlpa&selectedSellerId=101176284&sourceid=dsn_mpmax_b7816648-c1aa-4cbe-a348-bade7e6d185e&veh=dsn&wmlspartner=dsn_mpmax_b7816648-c1aa-4cbe-a348-bade7e6d185e&cn=00pd_fy27_mp_mp_lo_int_dis_mpmax-p13n&wl9=&wl11=Online&msclkid=c0b01b5e0b7e1bc26372714ec1d3c042";
                    break;
                case 3:
                    title = getString(R.string.tvPC);
                    imageResId = R.drawable.pc;
                    url = "https://www.clxgaming.com/gaming-pc/gmset0000004mk/configure";
                    break;
                case 4:
                    title = getString(R.string.tvLamp);
                    imageResId = R.drawable.lamp;
                    url = "https://www.amazon.com/SKYLEO-Led-Desk-Lamp-Brightness/dp/B0D1DLY4H4/ref=asc_df_B0D1DLY4H4?tag=bingshoppinga-20&linkCode=df0&hvadid=80745595095772&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=61513&hvtargid=pla-4584345075632154&msclkid=2746527d9c13109d8eb5386c93032f90&th=1";
                    break;
                default:
                    return;
            }

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra(EXTRA_TITLE, title);
            intent.putExtra(EXTRA_IMAGE_RES_ID, imageResId);
            intent.putExtra(EXTRA_URL, url);
            startActivity(intent);
        });
    }
}