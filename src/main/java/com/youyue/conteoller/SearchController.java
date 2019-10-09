package com.youyue.conteoller;



import com.youyue.domain.Seat;
import com.youyue.mapper.SeatMapper;
import com.youyue.utli.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SearchController {

    @Autowired
    private SeatMapper seatMapper;


    //查询座位表信息
    @RequestMapping("/save")
    @ResponseBody
    public List<Seat> save(){

        return  seatMapper.querySeatList();
    }

    //查询座位表状态信息
    @RequestMapping("/status")
    @ResponseBody
    public Map<Integer,Integer> status(){

        List<Seat>  seatList = seatMapper.querySeatList();
        Map<Integer,Integer> map = new HashMap<>();

        for (Seat seat : seatList) {
            map.put(seat.getId(),seat.getStatus())   ;
        }
        return  map;
    }

    //修改座位状态信息
    @GetMapping("/setStatus")
    @ResponseBody
    public void setStatus(Integer id){
        seatMapper.updateSeatStatus(id);

    }

    public void g(Result t){
       t.setData(998);

    }


}
