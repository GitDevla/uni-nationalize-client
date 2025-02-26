package nationalize;

import java.util.List;

import com.google.gson.annotations.SerializedName;

@lombok.Data
public class Nationality {
    private long count;
    private String name;

    @SerializedName("country")
    private List<Country> countries;

    @lombok.Data
    public static class Country {
        private String countryId;
        private float probability;
    }
}
