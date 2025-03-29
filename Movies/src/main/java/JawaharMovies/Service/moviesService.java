package JawaharMovies.Service;

import JawaharMovies.Entity.movies;
import JawaharMovies.Repository.moviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class moviesService {
    @Autowired
    private moviesRepository repository;



    public List<movies> getdata(){
        return repository.findAll();
    }
}
