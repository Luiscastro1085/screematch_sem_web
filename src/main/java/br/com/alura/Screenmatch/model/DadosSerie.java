package br.com.alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// para ignorar o que nao foi solicitado para mapear e evitar erro.
@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
