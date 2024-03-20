package LR2;

public record FootballClubRecord(String name, int numberOfGames, BestPlayer bestPlayer) implements Comparable<FootballClubRecord> {
    @Override public int compareTo(FootballClubRecord other) {
        return name.compareTo(other.name);
    }

    public FootballClubRecord {
        if (numberOfGames < 0) throw new IllegalArgumentException("Число игр не может быть < 0");
    }
}