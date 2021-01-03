package br.com.denilson.springboot3.controller;

import br.com.denilson.springboot3.domain.Anime;
import br.com.denilson.springboot3.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {


    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(String name){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime(name="DBZ"), new Anime(name="Bersek"));
    }
}
