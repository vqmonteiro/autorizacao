package br.com.banco.autorizacao.web.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Entrada de dados
 */
@ApiModel(description = "Entrada de dados")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-28T07:52:31.638-03:00[America/Sao_Paulo]")

public class AutorizacaoDTO   {
  @JsonProperty("numeroCartao")
  private String numeroCartao;

  public AutorizacaoDTO numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }

  /**
   * Nome do grupo
   * @return numeroCartao
  */
  @ApiModelProperty(required = true, value = "Nome do grupo")
  @NotNull


  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutorizacaoDTO autorizacaoDTO = (AutorizacaoDTO) o;
    return Objects.equals(this.numeroCartao, autorizacaoDTO.numeroCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutorizacaoDTO {\n");
    
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

