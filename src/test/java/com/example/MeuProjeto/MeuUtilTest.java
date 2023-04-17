package com.example.MeuProjeto;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MeuUtilTest {

    @Test
    void trataNome() {
        String nome = " Jao do milho ";
        String nomeTratado = MeuUtil.trataNome(nome);
        Assert.assertEquals("Jao do milho",nomeTratado);

    }
}