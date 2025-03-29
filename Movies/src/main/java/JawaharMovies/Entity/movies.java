package JawaharMovies.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection="movies")//This to map collections to object
public class movies {
    @Id
    private String id;
    private String imdbId;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> reviewIds;
    private List<String> genres;
    // getters and setters

}
