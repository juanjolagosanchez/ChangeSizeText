package com.example.sendmessage.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.sendmessage.data.model.Message;
import com.example.sendmessage.databinding.ActivitySendmessageBinding;
import com.example.sendmessage.databinding.ActivityViewMessageBinding;

public class ViewMessageActivity extends AppCompatActivity {

    private static final String TAG = "SendMessageProyect";
    private ActivityViewMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //1. Recogemos el intent que nos ha enviado la activity sendMessageActivity
        Intent intent = getIntent();
        //2. Recoger el objeto Bundle con el mismo metodo que se ha introducido en el intent
        Bundle bundle = intent.getExtras();
        //3. Asignar cada cadena a sus componentes
        //binding.tvContentUser.setText(bundle.getString("user"));
        //binding.tvContentMessage.setText(bundle.getString("message"));
        //Aquí recogemos los datos usando la clase que hemos implementado
        //Recogiendo el valor serializado del bundle y almacenandolo en nuestro objeto Message
        Message message = new Message();
        message = (Message)bundle.getSerializable("message");
        binding.tvContentUser.setText(message.getUser().toString());
        binding.tvContentMessage.setText(message.getMessage().toString());

        Log.i(TAG, "viewMessageActivity -> onCreate()");
    }

    // region Metodos ciclo de vida
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "viewMessageActivity -> onStart()");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "viewMessageActivity -> OnResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "viewMessageActivity -> OnPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "viewMessageActivity -> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "viewMessageActivity -> onDestroy()");

    }
    // endregion
}