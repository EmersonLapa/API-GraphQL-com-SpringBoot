package com.udemy.compras;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Essas 3 anotações são da dependencia (LOMBOK)
/*
@Data - Ela cria ou gera os Gets e Sets da classe
@AllArgsConstructor - Cria um construtor com os parametros da classe - Construtor com Argumentos.
@NoArgsConstructor - Cria um construtor sem os parametros da classe - Construtor vazio
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String nome;
    private String email;

}
