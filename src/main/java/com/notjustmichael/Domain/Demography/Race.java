package com.notjustmichael.Domain.Demography;


import java.util.Objects;

public class Race {

    String raceId, description;

    public String getRaceId() {
        return raceId;
    }

    public String getDescription() {
        return description;
    }

    private Race(){}

    private Race(Builder builder)
    {
        this.raceId = builder.raceId;
        this.description = builder.description;
    }

    public static class Builder {

        private String raceId, description;

        public Builder raceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Race build() {
            return new Race(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Race race = (Race) o;
            return raceId.equals(race.raceId);

        }

        @Override
        public int hashCode() {
            return Objects.hash(raceId);
        }

    }
}


