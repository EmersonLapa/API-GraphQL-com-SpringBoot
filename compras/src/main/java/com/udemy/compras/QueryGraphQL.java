// Essa classe implementa os metodos do schemma, usando uma interface do GraphQLQueryResolver
package com.udemy.compras;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component // esse componente é gerenciado pelo SpringBoot.
public class QueryGraphQL implements GraphQLQueryResolver {
    public String hello(){
        return "Hello GraphQL";
    }
    public int soma(int a, int b){
        return a + b;
    }
    public Cliente cliente() {
        return new Cliente("Emerson", "emerson@outlook.com");
    }
}
