package com.example.sendmessage.iu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sendmessage.R;
import com.example.sendmessage.data.model.Message;
import com.example.sendmessage.databinding.ActivitySendmessageBinding;

/**
 * <h1>Mi primer proyecto<h1/>
 * Pide al usuario el nombre del destinatario y un mensaje a enviar
 *
 * @author Juan Jose Lago Sanchez
 * @version 1.0
 * @see android.app.Activity
 */
public class SendMessageActivity extends AppCompatActivity {

    private static final String TAG = "SendMessageProyect";
    private ActivitySendmessageBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySendmessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        /*binding.btSend.setOnClickListener(view -> {
            sendMessage();
        });*/
        Log.i(TAG, "sendMessageActivity -> onCreate()");

    }


    //region Metodos que crea el Menu de la aplicacion
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Este metodo se ejecuta siempre que se pulsa una opcion dentro de una
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_About) {
            showAboutUs();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //endregion

    // region Metodos ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "SendMessageActivity -> onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessageActivit -> OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessageActivit -> OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "SendMessageActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SendMessageActivity -> onDestroy()");

    }


    // endregion

    public void getOnclick(View view) {
        /**
         * Este metodo es el que utilizamos en la propiedad android:onclick dentro del componente
         * button btSend
         *
         */
        switch (view.getId()) {
            case R.id.btSend:
                sendMessage();

                break;
        }
    }

    /**
     * Este metodo crea el intent con los datos que pasa la actividad SendActivity a ViewActivity
     * y inicializar la activity view
     */
    private void sendMessage() {
        //1.1 Crear un objeto contenedor o bundle para clear los datos
        Bundle bundle = new Bundle();
        //1.1.1 Ejemplo con dos variables string
        //bundle.putString("user",binding.edUser.getText().toString());
        //bundle.putString("message", binding.edMessage.getText().toString());
        //1.1.2 Ejemplo Con la clase Message
        Message message = new Message();
        message.setUser(binding.edUser.getText().toString());
        message.setMessage(binding.edMessage.getText().toString());
        bundle.putSerializable("message", message); //!!Hace falta implementar el serializable en la clase
        //1.2 Se crea el mensage o Intent explicito ya que se conoce la
        //Activity origen y la activity destino
        Intent intent = new Intent(this, ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * Este metodo inicializa la activiti aboutUs
     */
    private void showAboutUs() {
        Intent intent = new Intent(this,AboutUsActivity.class);
        startActivity(intent);
    }


}