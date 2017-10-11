package aldwin.tablante.com.mobilefinals;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.provider.MediaStore;

/**
 * Created by Bobby on 09/10/2017.
 */

public class TempData extends AppCompatActivity{
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private  int RESULT_LOAD_IMAGE = 1;
    private int  idpic = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_wish);
    }
public void SubmitWish(View view){
    EditText edt1 = (EditText) findViewById(R.id.Edt1);
    EditText edt2 = (EditText) findViewById(R.id.Edt2);
    EditText edt3 = (EditText) findViewById(R.id.Edt3);
    ImageView imageView = (ImageView) findViewById(R.id.imagepic);
    DataBaseHandler db = new DataBaseHandler(this);

    db.addContact(new Wishbase(edt1.getText().toString(),edt2.getText().toString(),
            Double.parseDouble(edt3.getText().toString()),idpic));
idpic++;
}
     public void ViewCamera(View view){

       // Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
       //  startActivityForResult(i, RESULT_LOAD_IMAGE);
         /*Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
         if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
             startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
         }*/

         //startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE), RESULT_LOAD_IMAGE);
        /* Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
         if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
             startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
         }*/
     }
     @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
         ImageView imageView = (ImageView) findViewById(R.id.imagepic);
       Uri u = intent.getData();
        imageView.setImageURI(u);
         /*if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
             Bundle extras = data.getExtras();
             Bitmap imageBitmap = (Bitmap) extras.get("data");
             imageView.setImageBitmap(imageBitmap);
         }*/
    }
}
