package com.hotels;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hotels.service.movie.MovieService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    private MovieService movieService;

    @Test
    public void contextLoads() {
        assertThat(movieService).isNotNull();
    }

}
