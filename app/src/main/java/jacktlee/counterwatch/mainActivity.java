package jacktlee.counterwatch;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class mainActivity extends ListActivity {

    private Cursor heroes;
    private DBHandler db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        db = new DBHandler(this);
        heroes = db.getHeroes(); // you would not typically call this on the main thread

        ListAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                heroes,
                new String[] {"name"},
                new int[] {android.R.id.text1});

        getListView().setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        heroes.close();
        db.close();
    }

}
