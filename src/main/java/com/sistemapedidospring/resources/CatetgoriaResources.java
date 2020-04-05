package com.sistemapedidospring.resources;

import com.sistemapedidospring.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CatetgoriaResources {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1, "teste1");
        Categoria cat2 = new Categoria(2, "teste cat2");
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(cat1);
        categorias.add(cat2);
        return categorias;
    }
}
