package LR2;

public record FootballClubRecord(String name, int numberOfGames, BestPlayer bestPlayer) implements Comparable<FootballClubRecord> {
    @Override public int compareTo(FootballClubRecord other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
         return String.format("%s; %d игр; Лучший игрок: %s", name, numberOfGames, bestPlayer);
    }

    public FootballClubRecord {
        if (numberOfGames < 0) throw new IllegalArgumentException("Число игр не может быть < 0");
    }

    public FootballClubRecord(String fcName, int numberOfGames, String name, String surname) {
        this(fcName, numberOfGames, new BestPlayer(name + " " + surname));
    }
}