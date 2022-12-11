package com.zjut.bookservice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 收藏表
 * </p>
 *
 * @author xww
 * @since 2022-12-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserGoods对象", description="收藏表")
public class UserGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收藏id")
    @TableId(value = "collection_id", type = IdType.ID_WORKER_STR)
    private String collectionId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "产品id")
    private String goodsId;


}
