package com.example.savemoneyback_end.controller;

import com.example.savemoneyback_end.dao.UsuarioDao;
import com.example.savemoneyback_end.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioRepositorio;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String showRegistrationForm(Model model) {
        model.addAttribute("usuario", new Usuario());

        return "cadastro";
    }

    @PostMapping("/processo_cadastro")
    public String processRegister(Usuario usuario) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(encodedPassword);

        usuarioRepositorio.save(usuario);

        return "login";
    }

    @GetMapping("/logar")
    public String listUsers(Model model) {
        List<Usuario> listaUsuarios = usuarioRepositorio.findAll();
        model.addAttribute("logar", listaUsuarios);

        return "Usuario/dashboard";
    }

}