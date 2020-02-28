package br.com.banco.autorizacao.service

import br.com.banco.autorizacao.web.api.AutorizacaoApiDelegate
import br.com.banco.autorizacao.web.api.model.AutorizacaoDTO
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component

@Component
class AutorizacaoService :AutorizacaoApiDelegate{

    override fun autorizacaoCartao(autorizacaoDTO: AutorizacaoDTO): ResponseEntity<AutorizacaoDTO> {
        return if(autorizacaoDTO.numeroCartao == "0") {
            ResponseEntity.badRequest().body(autorizacaoDTO)
        }else{
            ResponseEntity.ok(autorizacaoDTO)
        }
    }
}