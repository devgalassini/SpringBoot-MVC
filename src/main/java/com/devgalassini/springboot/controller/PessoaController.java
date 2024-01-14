package com.devgalassini.springboot.controller;

import com.devgalassini.springboot.model.Pessoa;
import com.devgalassini.springboot.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/cadastropessoa")
    public ModelAndView inicio() {
        ModelAndView modelAndView = new ModelAndView("cadastro/cadastropessoa");
        modelAndView.addObject("pessoaobj",new Pessoa());
        return modelAndView;
    }

    @PostMapping("**/salvarpessoa")
    public ModelAndView salvar(Pessoa pessoa){
        pessoaRepository.save(pessoa);

        ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
        Iterable<Pessoa> pessoaIt = pessoaRepository.findAll();
        andView.addObject("pessoas",pessoaIt);
        andView.addObject("pessoaobj",new Pessoa());
        return andView;


    }
    @GetMapping("listapessoas")
    public ModelAndView pessoas() {
        ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
        Iterable<Pessoa> pessoaIt = pessoaRepository.findAll();
        andView.addObject("pessoas",pessoaIt);
        andView.addObject("pessoaobj",new Pessoa());

        return andView;
    }
    @GetMapping("/editarpessoa/{idpessoa}")
    public ModelAndView editar(@PathVariable("idpessoa")Long idpessoa){

        Optional<Pessoa> pessoa = pessoaRepository.findById(idpessoa);

        ModelAndView modelAndView = new ModelAndView("cadastro/cadastropessoa");
        modelAndView.addObject("pessoaobj",pessoa.get());
        return modelAndView;
    }
}
