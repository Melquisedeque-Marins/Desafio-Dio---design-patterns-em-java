package com.melck.consumoapipatterns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.melck.consumoapipatterns.model.Endereco;


@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
    Endereco consultaCep(@PathVariable String cep);

}
