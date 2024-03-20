package LR2;

import java.util.Objects;

public class FootballClub implements Comparable<FootballClub> {
    private String name;
    private int numberOfGames;
    private BestPlayer bestPlayer;

    public FootballClub(String name, int numberOfGames, BestPlayer bestPlayer) {
        this.name = name;
        this.numberOfGames = numberOfGames;
        this.bestPlayer = bestPlayer;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        FootballClub footballClub = (FootballClub) other;
        return name.equals(footballClub.name) && numberOfGames == footballClub.numberOfGames && bestPlayer.equals(footballClub.bestPlayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfGames, bestPlayer);
    }

    @Override
    public String toString() {
        return String.format("%s; %d игр; Лучший игрок: %s", name, numberOfGames, bestPlayer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public BestPlayer getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(BestPlayer bestPlayer) {
        this.bestPlayer = bestPlayer;
    }

    @Override
    public int compareTo(FootballClub other) {
        int result = this.getName().compareTo(other.getName());
        
        if (result == 0) {
            result = Integer.compare(this.getNumberOfGames(), other.getNumberOfGames());
                if (result == 0) {
                    result = this.getBestPlayer().compareTo(other.getBestPlayer());
                }
        }
        return result;
    }
}