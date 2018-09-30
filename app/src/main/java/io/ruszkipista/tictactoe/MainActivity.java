package io.ruszkipista.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static io.ruszkipista.tictactoe.TicTacToeGame.NUM_SQUARES;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame mGame;
    TextView mGameStateTextView;
    Button[] mButtons = new Button[NUM_SQUARES];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGame = new TicTacToeGame(this);
        mGameStateTextView = findViewById(R.id.game_state_text_view);
        mButtons[0] = findViewById(R.id.button0);
        mButtons[1] = findViewById(R.id.button1);
        mButtons[2] = findViewById(R.id.button2);
        mButtons[3] = findViewById(R.id.button3);
        mButtons[4] = findViewById(R.id.button4);
        mButtons[5] = findViewById(R.id.button5);
        mButtons[6] = findViewById(R.id.button6);
        mButtons[7] = findViewById(R.id.button7);
        mButtons[8] = findViewById(R.id.button8);
        updateView();
    }

    private void updateView() {
        mGameStateTextView.setText(mGame.stringForGameState());
        for (int i=0;i<mButtons.length;i++){
            mButtons[i].setText(mGame.stringForButtonAtIndex(i));
        }
    }

    public void pressedBoardButton(View view) {
//      Toast.makeText(this, "Pressed " + view.getTag(), Toast.LENGTH_SHORT).show();
        int buttonIndex = Integer.parseInt(view.getTag().toString());
        mGame.pressedButtonAtIndex(buttonIndex);
        updateView();
    }

    public void pressedNewGame(View view) {
//      Toast.makeText(this, "Pressed NewGame", Toast.LENGTH_SHORT).show();
        mGame = new TicTacToeGame(this);
        updateView();
    }
}
