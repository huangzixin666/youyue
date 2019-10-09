package com.youyue.mapper;

import com.youyue.domain.Seat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SeatMapper {


    //查询座位表全部信息
    public List<Seat> querySeatList();

    //更新座位信息
    public void updateSeatStatus(Integer id);

}
