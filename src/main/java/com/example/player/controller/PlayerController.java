/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */
 package com.example.player.controller;

 import com.example.player.model.Player;
 import com.example.player.service.PlayerH2Service;

 import org.springframework.web.bind.annotation.*;
 import org.springframework.beans.factory.annotation.Autowired;
 import java.util.*;

 @RestController
 public class PlayerController{
    @Autowired
    private PlayerH2Service ps;

    @GetMapping("/player")
    public ArrayList<Player> getPlayers(){
        return ps.getPlayers();
    }
 }
