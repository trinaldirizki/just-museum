package com.permana.justmuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class MuseumDetailActivity extends Activity {

    private ShareActionProvider shareActionProvider;
    public static final String EXTRA_MUSEUMNO = "museumNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_detail);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        int museumNo = (Integer) getIntent().getExtras().get(EXTRA_MUSEUMNO);
        String museumName = Museum.museums[museumNo].getName();
        TextView textView = (TextView) findViewById(R.id.museum_title);
        textView.setText(museumName);
        int museumImage = Museum.museums[museumNo].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.museum_image);
        imageView.setImageDrawable(getResources().getDrawable(museumImage));
        imageView.setContentDescription(museumName);
        String museumDesc = Museum.museums[museumNo].getDescription();
        TextView textView1 = (TextView) findViewById(R.id.museum_description);
        textView1.setText(museumDesc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        TextView textView = (TextView) findViewById(R.id.museum_description);
        CharSequence museumDesc = textView.getText();
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,museumDesc);
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
