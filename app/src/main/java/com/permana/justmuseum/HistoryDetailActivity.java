package com.permana.justmuseum;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class HistoryDetailActivity extends Activity {

    private ShareActionProvider shareActionProvider;
    public static final String EXTRA_HISTORYNO = "historyNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_detail);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        int historyNo = (Integer) getIntent().getExtras().get(EXTRA_HISTORYNO);
        String historyName = History.histories[historyNo].getName();
        TextView textView = (TextView) findViewById(R.id.history_title);
        textView.setText(historyName);
        int historyImage = History.histories[historyNo].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.history_image);
        imageView.setImageDrawable(getResources().getDrawable(historyImage));
        imageView.setContentDescription(historyName);
        String historyDesc = History.histories[historyNo].getDescription();
        TextView textView1 = (TextView) findViewById(R.id.history_description);
        textView1.setText(historyDesc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        TextView textView = (TextView) findViewById(R.id.history_description);
        CharSequence historyDesc = textView.getText();
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,historyDesc);
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
