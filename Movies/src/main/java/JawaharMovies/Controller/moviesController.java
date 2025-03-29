package JawaharMovies.Controller;

import JawaharMovies.Entity.movies;
import JawaharMovies.Service.moviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class moviesController {
    @Autowired
    private moviesService service;


    @GetMapping("/findalldata")
    public List<movies> getalldata(){
    return service.getdata();

    }
}
