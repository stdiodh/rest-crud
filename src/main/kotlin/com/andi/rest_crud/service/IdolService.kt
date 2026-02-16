package com.andi.rest_crud.service

import com.andi.rest_crud.dto.IdolRequest
import com.andi.rest_crud.dto.IdolResponse
import com.andi.rest_crud.model.Idol
import org.springframework.stereotype.Service

@Service
class IdolService {

    private val idols = mutableListOf<Idol>()
    private var idSequence = 1L

    // TODO: 전체 아이돌 목록을 반환하는 함수를 완성하세요.
    fun getAll(): List<IdolResponse> {
        TODO("idols 리스트를 IdolResponse로 변환해서 반환하세요. 힌트: map { IdolResponse.from(it) }")
    }

    // TODO: id로 아이돌 한 명을 조회하는 함수를 완성하세요.
    fun getById(id: Long): IdolResponse {
        TODO("idols에서 id가 일치하는 아이돌을 찾아 반환하세요. 없으면 예외를 던지세요. 힌트: find { it.id == id }")
    }

    // TODO: 새 아이돌을 추가하는 함수를 완성하세요.
    fun create(request: IdolRequest): IdolResponse {
        TODO("IdolRequest를 Idol로 변환해 idols에 추가하고 IdolResponse로 반환하세요. 힌트: idSequence++")
    }

    // TODO: 아이돌 정보를 수정하는 함수를 완성하세요.
    fun update(id: Long, request: IdolRequest): IdolResponse {
        TODO("id로 아이돌을 찾아 request의 값으로 수정 후 반환하세요.")
    }

    // TODO: 아이돌을 삭제하는 함수를 완성하세요.
    fun delete(id: Long) {
        TODO("id로 아이돌을 찾아 idols에서 제거하세요. 힌트: removeIf { it.id == id }")
    }
}
