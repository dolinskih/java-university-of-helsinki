
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<Game> games = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] data = row.split(",");
                
                String team1 = data[0];
                String team2 = data[1];
                int result1 = Integer.valueOf(data[2]);
                int result2 = Integer.valueOf(data[3]);

                if (result1 > result2) {
                    Game game1 = new Game(team1, true);
                    Game game2 = new Game(team2, false);

                    games.add(game1);
                    games.add(game2);
                } else {
                    Game game1 = new Game(team1, false);
                    Game game2 = new Game(team2, true);

                    games.add(game1);
                    games.add(game2);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int count = 0;
        int won = 0;
        int loss = 0;
        for (Game game : games) {
            if (game.getTeam().equals(team)) {
                count++;

                if (game.getWon()) {
                    won++;
                } else{
                    loss++;
                }
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + won);
        System.out.println("Losses: " + loss);
       
    }

}
