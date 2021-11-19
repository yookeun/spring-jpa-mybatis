package com.example.test.jpa.control;

import com.example.test.jpa.dto.BoardDto;
import com.example.test.jpa.service.JpaService;
import com.example.test.util.ResultJson;
import com.querydsl.core.QueryResults;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jpa")
@RequiredArgsConstructor
public class BoardJpaController {

    private final JpaService jpaService;

    @GetMapping("/board")
    @ResponseBody
    public ResultJson selectBoard() {
        ResultJson resultJson = new ResultJson();
        QueryResults<BoardDto> queryResults = jpaService.selectBoardQueryDsl();
        resultJson.setItems(queryResults.getResults());
        resultJson.setTotal(queryResults.getTotal());
        resultJson.setSuccess(true);
        return resultJson;
    }

    @PostMapping("/board")
    @ResponseBody
    public ResultJson inserBoard(BoardDto boardDto) {
        ResultJson resultJson = new ResultJson();
        boolean result = false;
        if (jpaService.insertBoard(boardDto) != null) {
            result = true;
        }
        resultJson.setSuccess(result);
        return resultJson;
    }
}
