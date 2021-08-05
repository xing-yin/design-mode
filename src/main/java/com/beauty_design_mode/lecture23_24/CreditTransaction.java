package com.beauty_design_mode.lecture23_24;


/**
 * 积分明细表
 *
 * @author Alan Yin
 * @date 2020/10/13
 */

public class CreditTransaction {

    private Long id;

    /**
     * 赚取或消费渠道 id
     */
    private Integer channelId;

    /**
     * 相关事件 id
     */
    private Integer eventId;

    /**
     * 积分(赚取为正、消费为负)
     */
    private Long credit;

    private Long creatTime;

    private Long expiredTime;
}
