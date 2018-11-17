package com.superman.superman.dao;

import com.superman.superman.model.ScoreBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liujupeng on 2018/11/15.
 */
@Mapper
public interface ScoreDao {
    /**
     * 查询是否领取过每日商品浏览积分
     * @param user
     * @return
     */
    ScoreBean isExit(@Param("score") ScoreBean user);
/**
     * 领取每日商品浏览积分
     * @param user
     * @return
     */
    Integer newSign(@Param("score") ScoreBean user);
/**
     * 增加积分
     * @param user
     * @return
     */
    Integer addScore(@Param("score") ScoreBean user);
/**
     * 增加积分
     * @param user
     * @return
     */
    Integer addUserScore(@Param("score") ScoreBean user);

}