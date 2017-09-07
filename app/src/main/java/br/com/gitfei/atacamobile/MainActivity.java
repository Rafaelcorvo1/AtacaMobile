package br.com.gitfei.atacamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callTelaCarrinho(View v) {
        Intent callTelaUm = new Intent(MainActivity.this,CarrinhoActivity.class);
        startActivity(callTelaUm);
    }
}
