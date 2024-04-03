package alura.com.forum.model

import java.time.LocalDateTime

data class Resposta (
    val id: Long?,
    val mensagem: String,
    val datacriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val topico: Topico,
    val solucao: Boolean
)
