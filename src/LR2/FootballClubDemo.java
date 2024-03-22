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
        
        System.out.println("\nСортировка с помощью Comparable:\n");
        for (FootballClub footballClub : footballClubs) {
            System.out.println(footballClub);
        }

        // Компараторы
        System.out.println("\n---\n");

        Comparator<FootballClubRecord> byName = new Comparator<FootballClubRecord>() {
            @Override
            public int compare(FootballClubRecord o1, FootballClubRecord o2) {
                return o1.name().compareTo(o2.name());
            }
        };

        Comparator<FootballClubRecord> byNumberOfGames = new Comparator<FootballClubRecord>() {
            @Override
            public int compare(FootballClubRecord o1, FootballClubRecord o2) {
                return o1.numberOfGames() - o2.numberOfGames();
            }
        };

        Comparator<FootballClubRecord> byBestPlayer = new Comparator<FootballClubRecord>() {
            @Override
            public int compare(FootballClubRecord o1, FootballClubRecord o2) {
                return o1.bestPlayer().compareTo(o2.bestPlayer());
            }
        };

        FootballClubRecord[] fotballClubRecords = {
            new FootballClubRecord("Спартак", 100, "Джон", "Малкович"), 
            new FootballClubRecord("ЦСКА", 135, "Антон", "Антонович"), 
            new FootballClubRecord("Мадрид", 89, "Спортсмен", "Футбольный")};

        Arrays.sort(fotballClubRecords, byBestPlayer.thenComparing(byNumberOfGames).thenComparing(byName));
        
        System.out.println("Сортировка с помощью Comparator:\n");
        for (FootballClubRecord footballClub : fotballClubRecords) {
            System.out.println(footballClub);
        }
    }
}
