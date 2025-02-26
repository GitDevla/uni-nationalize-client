package nationalize;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public record Nationality(long count, String name, @SerializedName("country") List<Country> countries) {
    public record Country(String countryId, float probability) {}
}