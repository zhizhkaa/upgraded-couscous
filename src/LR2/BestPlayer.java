package LR2;

import java.util.Objects;

public class BestPlayer implements Comparable<BestPlayer> {
    private String name;

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        BestPlayer player = (BestPlayer) other;
        return name == player.name;
    }

    public BestPlayer(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return String.format(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(BestPlayer otherBestPlayer) {
        return this.getName().compareTo(otherBestPlayer.getName());
    }
}