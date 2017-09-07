package br.com.gitfei.atacamobile;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class CarrinhoActivity extends AppCompatActivity {
    public static final String ACAO_EXIBIR_TELA = "atacamobile.ACAO_EXIBIR_TELA";
    public static final String CATEGORIA_TELA = "atacamobile.CATEGORIA_TELA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho_compras);
    }
}