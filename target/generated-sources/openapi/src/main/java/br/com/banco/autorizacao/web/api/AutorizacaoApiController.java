package br.com.banco.autorizacao.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-28T07:52:31.638-03:00[America/Sao_Paulo]")

@Controller
@RequestMapping("${openapi.autorizacao.base-path:/v1}")
public class AutorizacaoApiController implements AutorizacaoApi {

    private final AutorizacaoApiDelegate delegate;

    public AutorizacaoApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AutorizacaoApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AutorizacaoApiDelegate() {});
    }

    @Override
    public AutorizacaoApiDelegate getDelegate() {
        return delegate;
    }

}
