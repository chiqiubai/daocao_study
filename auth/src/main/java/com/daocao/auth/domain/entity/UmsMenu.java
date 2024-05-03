package com.daocao.auth.domain.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@TableName("ums_menu")
public class UmsMenu implements Serializable {
    @TableId
    private Long id;
    private Long parentId;
    private String menu_name;
    private Integer sort;
    private Integer menuType;
    private String path;
    private String componentPath;
    private String perms;
    private String icon;
    private Integer status;

    private String creator;
    private String updater;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String remark;
    // 逻辑删除, MybatisPlus默认,0-未删除, 1-已删除
    @TableLogic
    private Integer deleted;
}
