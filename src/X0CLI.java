import hexlet.xo.model.Field;
import hexlet.xo.model.Figure;
import hexlet.xo.model.Game;
import hexlet.xo.model.Player;
import view.ConsoleView;

public class X0CLI {

    public static void main(String[] args) {

         final String name1 = "Gleb";
         final String name2 = "Slava";

         final Player[] players = new Player[2];
         players[0] = new Player(name1, Figure.X);
         players[1] = new Player(name2, Figure.O);

         final Game gameXO = new Game(players, new Field(3), "XO");

         final ConsoleView consoleView = new ConsoleView();
         consoleView.show(gameXO);
         while (consoleView.move(gameXO)){
             consoleView.show(gameXO);
         }
    }
}


