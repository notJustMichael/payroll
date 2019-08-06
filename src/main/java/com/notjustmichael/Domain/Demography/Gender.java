package com.notjustmichael.Domain.Demography;

import java.util.Objects;

public class Gender {

    String genderId, description;

    public String getGenderId() {
        return genderId;
    }

    public String getDescription() {
        return description;
    }

    private Gender(){}

    private Gender(Builder builder)
    {
        this.genderId = builder.genderId;
        this.description = builder.description;
    }

    public static class Builder {

        private String genderId, description;

        public Builder genderId(String genderId) {
            this.genderId = genderId;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Gender gender = (Gender) o;
            return genderId.equals(gender.genderId);

        }

        @Override
        public int hashCode() {
            return Objects.hash(genderId);
        }

    }
}


