package com.permana.justmuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class CityDetailActivity extends Activity {

    private ShareActionProvider shareActionProvider;
    public static final String EXTRA_CITYNO = "cityNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        int cityNo = (Integer) getIntent().getExtras().get(EXTRA_CITYNO);
        String cityName = City.cities[cityNo].getName();
        TextView textView = (TextView) findViewById(R.id.city_title);
        textView.setText(cityName);
        int cityImage = City.cities[cityNo].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.city_image);
        imageView.setImageDrawable(getResources().getDrawable(cityImage));
        imageView.setContentDescription(cityName);
        String cityDesc = City.cities[cityNo].getDescription();
        TextView textView1 = (TextView) findViewById(R.id.city_description);
        textView1.setText(cityDesc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        TextView textView = (TextView) findViewById(R.id.city_description);
        CharSequence cityDesc = textView.getText();
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,cityDesc);
        shareActionProvider.setShareIntent(intent);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:
                Intent intent = new Intent(this,SearchResultActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
