package com.mathrss.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mathrss.dslist.dto.GameMinDTO;
import com.mathrss.dslist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value = "/games")
public class GameController {


    @Autowired
    private GameService gameService;

    @GetMapping    
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findall();
        return result;
    }
}
