package JawaharMovies.Repository;

import JawaharMovies.Entity.movies;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface moviesRepository extends MongoRepository<movies, String> {
    // You can add custom query methods here if needed
}