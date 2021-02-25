package com.yl.orders;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName("mi_orders")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Orders implements Serializable {

    /**
     * 主键 id
     */
    @TableId(value = "ID",type = IdType.AUTO)
    private Long id;


    /**
     * 订单号
     */
    @TableField("ORDER_NUM")
    private String orderNum;


}
