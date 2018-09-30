package io.ruszkipista.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGame = new TicTacToeGame(this);
    }

    public void pressedBoardButton(View view){

        Toast.makeText(this, "Pressed "+view.getTag(), Toast.LENGTH_SHORT).show();
    }
    public void pressedNewGame(View view){
        Toast.makeText(this, "Pressed NewGame", Toast.LENGTH_SHORT).show();
    }
}
