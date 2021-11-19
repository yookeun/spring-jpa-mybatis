package com.example.test.mybatis.control;


import com.example.test.mybatis.model.Board;
import com.example.test.mybatis.service.MyBatisService;
import com.example.test.util.ResultJson;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mybatis")
@RequiredArgsConstructor
public class BoardMybatisController {

    private final MyBatisService myBatisService;

    @GetMapping("/board")
    @ResponseBody
    public ResultJson selectBoard() {
        ResultJson resultJson = new ResultJson();
        resultJson.setItems(myBatisService.selectBoard());
        resultJson.setSuccess(true);
        return resultJson;
    }

    @PostMapping("/board")
    @ResponseBody
    public ResultJson inserBoard(Board board) {
        ResultJson resultJson = new ResultJson();
        boolean result = false;
        if (myBatisService.insertBoard(board) > 0) {
            result = true;
        }
        resultJson.setSuccess(result);
        return resultJson;
    }

    @PutMapping("/board")
    @ResponseBody
    public ResultJson updateBoard(Board board) {
        ResultJson resultJson = new ResultJson();
        boolean result = false;
        if (myBatisService.updateBoard(board) > 0) {
            result = true;
        }
        resultJson.setSuccess(result);
        return resultJson;
    }

    @DeleteMapping("/board")
    @ResponseBody
    public ResultJson deleteBoard(Board board) {
        ResultJson resultJson = new ResultJson();
        boolean result = false;
        if (myBatisService.deleteBoard(board) > 0) {
            result = true;
        }
        resultJson.setSuccess(result);
        resultJson.setSuccess(true);
        return resultJson;
    }

}
