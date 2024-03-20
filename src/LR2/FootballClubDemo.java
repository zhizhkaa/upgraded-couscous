package LR2;

import java.util.Arrays;
import java.util.Comparator;

public class FootballClubDemo {
    public static void main(String[] args) {

        FootballClub[] footballClubs = {
            new FootballClub("Спартак", 100, new BestPlayer("Джон Джон")), 
            new FootballClub("ЦСКА", 135, new BestPlayer("Иван Иванович")), 
            new FootballClub("Мадрид", 89, new BestPlayer("Игрок Спортивный"))};

        Arrays.sort(footballClubs);

        for (FootballClub footballClub : footballClubs) {
            System.out.println(footballClub);
        }

        // Компараторы
        System.out.println("---\n");

        Comparator<FootballClub> byName = new Comparator<FootballClub>() {
            @Override
            public int compare(FootballClub o1, FootballClub o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<FootballClub> byNumberOfGames = new Comparator<FootballClub>() {
            @Override
            public int compare(FootballClub o1, FootballClub o2) {
                return o1.getNumberOfGames() - o2.getNumberOfGames();
            }
        };

        Comparator<FootballClub> byBestPlayer = new Comparator<FootballClub>() {
            @Override
            public int compare(FootballClub o1, FootballClub o2) {
                return o1.getBestPlayer().compareTo(o2.getBestPlayer());
            }
        };

        FootballClub[] footballClubs2 = {
            new FootballClub("Спартак", 100, new BestPlayer("Джон Джон")), 
            new FootballClub("ЦСКА", 135, new BestPlayer("Иван Иванович")), 
            new FootballClub("Мадрид", 89, new BestPlayer("Игрок Спортивный"))};

        Arrays.sort(footballClubs2, byBestPlayer.thenComparing(byNumberOfGames).thenComparing(byName));

        for (FootballClub footballClub : footballClubs2) {
            System.out.println(footballClub);
        }
    }
}
