package ch.dcamenisch.tichu.Player;

import ch.dcamenisch.tichu.Card.CardRank;
import ch.dcamenisch.tichu.Card.CardSuit;

public class PlayerManager {
    private Player[] players;
    private int currentPlayer;

    public PlayerManager(int num) {
        this.players = new Player[num];

        for(int i = 0; i < num; i++) {
            players[i] = new DumbAI("BOT " + i);
        }
    }

    public void selectStartingPlayer() {
        for(int i = 0; i < players.length; i++){
            if(players[i].hasCard(CardRank.MAHJONG, CardSuit.SPECIAL)) {
                currentPlayer = i;
            }
        }
    }

    public Player getCurrentPlayer() {
        return players[currentPlayer];
    }

    public Player[] getPlayers() {
        return players;
    }
}
