package com.andi.rest_crud.controller

import com.andi.rest_crud.dto.IdolRequest
import com.andi.rest_crud.dto.IdolResponse
import com.andi.rest_crud.service.IdolService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/idols")
class IdolController(
    private val idolService: IdolService
) {

    // TODO: 전체 아이돌 목록을 조회하는 API를 완성하세요.
    // GET /idols
    @GetMapping
    fun getAll(): List<IdolResponse> {
        TODO("idolService.getAll()을 호출해 반환하세요.")
    }

    // TODO: 특정 아이돌을 조회하는 API를 완성하세요.
    // GET /idols/{id}
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): IdolResponse {
        TODO("idolService.getById(id)를 호출해 반환하세요.")
    }

    // TODO: 새 아이돌을 등록하는 API를 완성하세요.
    // POST /idols
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody request: IdolRequest): IdolResponse {
        TODO("idolService.create(request)를 호출해 반환하세요.")
    }

    // TODO: 아이돌 정보를 수정하는 API를 완성하세요.
    // PUT /idols/{id}
    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @Valid @RequestBody request: IdolRequest): IdolResponse {
        TODO("idolService.update(id, request)를 호출해 반환하세요.")
    }

    // TODO: 아이돌을 삭제하는 API를 완성하세요.
    // DELETE /idols/{id}
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) {
        TODO("idolService.delete(id)를 호출하세요.")
    }
}
