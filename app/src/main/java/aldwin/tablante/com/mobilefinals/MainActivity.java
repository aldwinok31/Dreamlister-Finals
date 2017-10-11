package aldwin.tablante.com.mobilefinals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;
import android.view.View;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;

import android.provider.MediaStore;
public class MainActivity extends AppCompatActivity {
    private static int RESULT_LOAD_IMAGE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataBaseHandler db = new DataBaseHandler(this);


    }



    public void AddWish(View v){
       Intent i = new Intent(MainActivity.this,TempData.class);
       /* Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivityForResult(i, RESULT_LOAD_IMAGE);*/
        startActivity(i);

    }

    public void DeleteWish(View view){




    }

}
